package com.yada.mis.ars.service;

import com.yada.mis.ars.dao.AccountTransDao;
import com.yada.mis.ars.dao.EacqTransDao;
import com.yada.mis.ars.dao.HisTranListDao;
import com.yada.mis.ars.model.EacqTrans;
import com.yada.mis.ars.model.HisTranList;
import com.yada.mis.ars.query.HisTranListQuery;
import com.yada.mis.ars.utils.ObjectToModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EacqTransService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private EacqTransDao eacqTransDao;
    private HisTranListDao hisTranListDao;
    private AccountTransDao accountTransDao;

    @Autowired
    public EacqTransService(EacqTransDao eacqTransDao, HisTranListDao hisTranListDao, AccountTransDao accountTransDao) {
        this.eacqTransDao = eacqTransDao;
        this.hisTranListDao = hisTranListDao;
        this.accountTransDao = accountTransDao;
    }

    public void account(EacqTrans eacqTrans) {
        logger.info("开始匹配EACQ交易:{}", eacqTrans.getCardNo());
        eacqTransDao.save(eacqTrans);
        // 匹配EACQ交易,参考号、终端号、批号、卡号、交易日期、交易时间、交易金额
        HisTranListQuery query = new HisTranListQuery();
        query.setRespCode("00");
        query.setTranFlag("0");
        query.setSafFlag("0");
        query.setRrn(eacqTrans.getRrn());
        query.setTerminalId(eacqTrans.getTermNo());
        query.setBatchNo(eacqTrans.getBatchNo());
        query.setCardNo(eacqTrans.getCardNo());
        query.setPosTranStamp(eacqTrans.getTranDate() + eacqTrans.getTranTime());
        query.setTranAmt(eacqTrans.getTranAmt());
        List<HisTranList> list = hisTranListDao.findAll(query);
        HisTranList hisTran = null;
        for (HisTranList his : list) {
            hisTran = his;
        }
        if (null != hisTran) {
            accountTransDao.save(ObjectToModel.toAccountTrans(hisTran));
        } else {
            logger.warn("没有匹配到EACQ交易:{}", eacqTrans.getCardNo());
        }
    }
}
