package com.yada.mis.ars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountTrans {

    @Id
    private String traceNo;// 流水号
    @Column
    private String batchNo;// 批次号
    @Column
    private String merNo;// 商户号
    @Column
    private String termNo;// 终端号
    @Column
    private String cardNo;// 卡号
    @Column
    private String tranType;// 交易类型
    @Column
    private String tranDate;// 交易时间
    @Column
    private String tranAmt;// 金额
    @Column
    private String rrn;// 参考号
    @Column
    private String invoiceNo;// 票据号

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
}
