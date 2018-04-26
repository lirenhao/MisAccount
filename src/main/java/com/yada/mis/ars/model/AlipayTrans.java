package com.yada.mis.ars.model;

import javax.persistence.*;

/**
 * 支付宝交易明细
 */
@Entity
@SequenceGenerator(name = "alipay_trans_seq", sequenceName = "alipay_trans_seq", allocationSize = 1)
public class AlipayTrans {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alipay_trans_seq")
    private long id;
    // 商户编号
    @Column
    private String merNo;
    // 终端号
    @Column
    private String termNo;
    // 交易方式
    @Column
    private String tranType;
    // 业务类型
    @Column
    private String busType;
    // 支付宝交易号
    @Column
    private String aliTranNo;
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
    // 退款批次号/请求号
    @Column
    private String batchNo;
    // 订单金额
    private String orderAmt;
    // 商户订单号
    @Column
    private String orderNo;
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

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getAliTranNo() {
        return aliTranNo;
    }

    public void setAliTranNo(String aliTranNo) {
        this.aliTranNo = aliTranNo;
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

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
