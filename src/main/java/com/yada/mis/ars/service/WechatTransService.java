package com.yada.mis.ars.service;

import com.yada.mis.ars.dao.AccountTransDao;
import com.yada.mis.ars.dao.HisTranListDao;
import com.yada.mis.ars.dao.WechatTransDao;
import com.yada.mis.ars.model.HisTranList;
import com.yada.mis.ars.model.WechatTrans;
import com.yada.mis.ars.query.HisTranListQuery;
import com.yada.mis.ars.utils.ObjectToModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WechatTransService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private WechatTransDao wechatTransDao;
    private HisTranListDao hisTranListDao;
    private AccountTransDao accountTransDao;

    @Autowired
    public WechatTransService(WechatTransDao wechatTransDao, HisTranListDao hisTranListDao, AccountTransDao accountTransDao) {
        this.wechatTransDao = wechatTransDao;
        this.hisTranListDao = hisTranListDao;
        this.accountTransDao = accountTransDao;
    }

    public void account(WechatTrans wechatTrans) {
        logger.info("开始匹配微信交易:{}", wechatTrans.getWcTranNo());
        wechatTransDao.save(wechatTrans);

        // 匹配微信交易,交易号
        HisTranListQuery tranQuery = new HisTranListQuery();
        tranQuery.setAddData(wechatTrans.getWcTranNo());
        List<HisTranList> tranList = hisTranListDao.findAll(tranQuery);
        for (HisTranList his : tranList) {
            accountTransDao.save(ObjectToModel.toAccountTrans(his));
        }
        if (tranList.size() == 0) {
            logger.warn("没有匹配到微信交易:{}", wechatTrans.getWcTranNo());
        }

        // 匹配微信退货交易
        if (wechatTrans.getWcRefundNo() != null && wechatTrans.getWcRefundNo().length() > 10) {
            HisTranListQuery refundQuery = new HisTranListQuery();
            refundQuery.setAddData(wechatTrans.getWcRefundNo());
            List<HisTranList> refundList = hisTranListDao.findAll(refundQuery);
            for (HisTranList his : refundList) {
                accountTransDao.save(ObjectToModel.toAccountTrans(his));
            }
            if (refundList.size() == 0) {
                logger.warn("没有匹配到微信退货交易:{}", wechatTrans.getWcRefundNo());
            }
        }
    }
}
