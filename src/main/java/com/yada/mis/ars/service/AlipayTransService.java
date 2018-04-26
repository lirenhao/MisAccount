package com.yada.mis.ars.service;

import com.yada.mis.ars.dao.AccountTransDao;
import com.yada.mis.ars.dao.AlipayTransDao;
import com.yada.mis.ars.dao.HisTranListDao;
import com.yada.mis.ars.model.AlipayTrans;
import com.yada.mis.ars.model.HisTranList;
import com.yada.mis.ars.query.HisTranListQuery;
import com.yada.mis.ars.utils.ObjectToModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlipayTransService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private AlipayTransDao alipayTransDao;
    private HisTranListDao hisTranListDao;
    private AccountTransDao accountTransDao;

    @Autowired
    public AlipayTransService(AlipayTransDao alipayTransDao, HisTranListDao hisTranListDao, AccountTransDao accountTransDao) {
        this.alipayTransDao = alipayTransDao;
        this.hisTranListDao = hisTranListDao;
        this.accountTransDao = accountTransDao;
    }

    public void account(AlipayTrans alipayTrans) {
        logger.info("开始匹配支付宝交易:{}", alipayTrans.getOrderNo());
        alipayTransDao.save(alipayTrans);

        // 匹配支付宝交易, 交易号、交易类型tranType 81 83 addDate
        HisTranListQuery query = new HisTranListQuery();
        query.setAddData(alipayTrans.getAliTranNo());
        List<HisTranList> list = hisTranListDao.findAll(query);
        for (HisTranList his : list) {
            accountTransDao.save(ObjectToModel.toAccountTrans(his));
        }
        if (list.size() == 0) {
            logger.warn("没有匹配到支付宝交易:{}", alipayTrans.getOrderNo());
        }
    }
}
