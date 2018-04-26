package com.yada.mis.ars.model;

import javax.persistence.*;

/**
 * 微信交易明细
 */
@Entity
@SequenceGenerator(name = "wechat_trans_seq", sequenceName = "eacq_trans_seq", allocationSize = 1)
public class WechatTrans {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wechat_trans_seq")
    private long id;
    // 商户编号
    @Column
    private String merNo;
    // 终端号
    @Column
    private String termNo;
    // 交易类型
    @Column
    private String tranType;
    // 交易状态
    @Column
    private String tranStatus;
    // 微信订单号
    @Column
    private String wcTranNo;
    // 结算日期
    @Column
    private String settleDate;
    // 交易时间
    @Column
    private String tranDate;
    // 交易金额
    @Column
    private String tranAmt;
    // 手续费
    @Column
    private String fee;
    // 结算金额
    @Column
    private String settleAmt;
    // 微信退款单号
    @Column
    private String wcRefundNo;
    // 商户退款单号
    @Column
    private String refundNo;
    // 退款类型
    @Column
    private String refundType;
    // 退款状态
    @Column
    private String refundStatus;
    // 退款金额
    @Column
    private String refundAmt;
    // 退款手续费
    @Column
    private String refundFee;
    // 商户订单号
    @Column
    private String orderNo;
    // 付款银行
    @Column
    private String bankType;
    // 备注
    @Column
    private String remarks;
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

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getTranStatus() {
        return tranStatus;
    }

    public void setTranStatus(String tranStatus) {
        this.tranStatus = tranStatus;
    }

    public String getWcTranNo() {
        return wcTranNo;
    }

    public void setWcTranNo(String wcTranNo) {
        this.wcTranNo = wcTranNo;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
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

    public String getWcRefundNo() {
        return wcRefundNo;
    }

    public void setWcRefundNo(String wcRefundNo) {
        this.wcRefundNo = wcRefundNo;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(String refundAmt) {
        this.refundAmt = refundAmt;
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
