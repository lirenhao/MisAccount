package com.yada.mis.ars.query;

import com.yada.mis.ars.model.HisTranList;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.LinkedList;
import java.util.List;

public class HisTranListQuery implements Specification<HisTranList> {

    @Override
    public Predicate toPredicate(Root<HisTranList> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> list = new LinkedList<Predicate>();
        if (respCode != null && !"".equals(respCode.trim())) {
            list.add(cb.equal(root.get("respCode").as(String.class), respCode));
        }
        if (tranFlag != null && !"".equals(tranFlag.trim())) {
            list.add(cb.equal(root.get("tranFlag").as(String.class), tranFlag));
        }
        if (safFlag != null && !"".equals(safFlag.trim())) {
            list.add(cb.equal(root.get("safFlag").as(String.class), safFlag));
        }
        if (rrn != null && !"".equals(rrn.trim())) {
            list.add(cb.equal(root.get("rrn").as(String.class), rrn));
        }
        if (terminalId != null && !"".equals(terminalId.trim())) {
            list.add(cb.equal(root.get("terminalId").as(String.class), terminalId));
        }
        if (batchNo != null && !"".equals(batchNo.trim())) {
            list.add(cb.equal(root.get("batchNo").as(String.class), batchNo));
        }
        if (cardNo != null && !"".equals(cardNo.trim())) {
            list.add(cb.equal(root.get("cardNo").as(String.class), cardNo));
        }
        if (posTranStamp != null && !"".equals(posTranStamp.trim())) {
            list.add(cb.equal(root.get("posTranStamp").as(String.class), posTranStamp));
        }
        if (tranAmt != null && !"".equals(tranAmt.trim())) {
            list.add(cb.equal(root.get("tranAmt").as(String.class), tranAmt));
        }
        if (addData != null && !"".equals(addData.trim())) {
            list.add(cb.like(root.get("addData").as(String.class), "%" + addData + "%"));
        }
        if (list.size() > 0) {
            query.where(list.toArray(new Predicate[list.size()]));
        } else {
            query.where(cb.lessThan(root.get("traceNo").as(Long.class), 0L));
        }
        return query.getRestriction();
    }

    private String respCode;// 交易标志
    private String tranFlag;// 冲正标志
    private String safFlag;// 返回码
    private String rrn;// 参考号
    private String terminalId;// 终端号
    private String batchNo;// 批次号
    private String cardNo;// 交易卡号
    private String posTranStamp;// 交易日期、时间
    private String tranAmt;// 交易金额
    private String addData;// 附加数据

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getTranFlag() {
        return tranFlag;
    }

    public void setTranFlag(String tranFlag) {
        this.tranFlag = tranFlag;
    }

    public String getSafFlag() {
        return safFlag;
    }

    public void setSafFlag(String safFlag) {
        this.safFlag = safFlag;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPosTranStamp() {
        return posTranStamp;
    }

    public void setPosTranStamp(String posTranStamp) {
        this.posTranStamp = posTranStamp;
    }

    public String getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getAddData() {
        return addData;
    }

    public void setAddData(String addData) {
        this.addData = addData;
    }
}
