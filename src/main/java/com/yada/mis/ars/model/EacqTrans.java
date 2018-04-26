package com.yada.mis.ars.model;

import javax.persistence.*;

/**
 * 支付宝交易明细
 */
@Entity
@SequenceGenerator(name = "eacq_trans_seq", sequenceName = "eacq_trans_seq", allocationSize = 1)
public class EacqTrans {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eacq_trans_seq")
    private long id;
    // 终端号
    @Column
    private String termNo;
    // 批号
    @Column
    private String batchNo;
    // 交易卡号
    @Column
    private String cardNo;
    // 交易日期
    @Column
    private String tranDate;
    // 交易时间
    @Column
    private String tranTime;
    // 交易金额
    @Column
    private String tranAmt;
    // 手续费
    @Column
    private String fee;
    // 结算金额
    @Column
    private String settleAmt;
    // 授权码
    @Column
    private String authNo;
    // 交易码
    @Column
    private String tranType;
    // 分期
    @Column
    private String stag;
    // 卡别
    @Column
    private String cardType;
    // 参考号
    @Column
    private String rrn;
    // 文件来源
    @Column
    private String fileName;
    // 导入日期
    @Column
    private String expDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
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

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(String settleAmt) {
        this.settleAmt = settleAmt;
    }

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getStag() {
        return stag;
    }

    public void setStag(String stag) {
        this.stag = stag;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
