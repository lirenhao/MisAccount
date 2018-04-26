package com.yada.mis.ars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HisTranList {

    @Id
    private long traceNo;        //		   NOT NULL NUMBER(38)
    @Column
    private long batchNo;//				   NOT NULL NUMBER(38)
    @Column
    private long bankBatchNo;//				   NOT NULL NUMBER(38)
    @Column
    private long voidBatchNo;//				   NOT NULL NUMBER(38)
    @Column
    private long bankTraceNo;//				   NOT NULL NUMBER(38)
    @Column
    private  long voidTraceNo;//				   NOT NULL NUMBER(38)
    @Column
    private  long invoiceNo;//			   NOT NULL NUMBER(38)
    @Column
    private  long bankInvoiceNo;//			   NOT NULL NUMBER(38)
    @Column
    private  long voidInvoiceNo;//			   NOT NULL NUMBER(38)
    @Column
    private  float tranAmt;        //		   NOT NULL FLOAT(126)
    @Column
    private  float voidAmt;//				   NOT NULL FLOAT(126)
    @Column
    private  float addAmt;//			   NOT NULL FLOAT(126)
    @Column
    private  String tranType;//		   NOT NULL CHAR(2)
    @Column
    private  String voidTranType;//			    CHAR(2)
    @Column
    private  String voidOldType;//				    CHAR(2)
    @Column
    private  String cardNo;//	   NOT NULL CHAR(19)
    @Column
    private  String expDate;//		    CHAR(4)
    @Column
    private  String cardType;//			    CHAR(2)
    @Column
    private  String cardName;//			    CHAR(20)
    @Column
    private  String posTranStamp;//			    CHAR(16)
    @Column
    private  String localTranStamp;//			    CHAR(16)
    @Column
    private  String bankTranStamp;//			    CHAR(16)
    @Column
    private  String merchantId;//			    CHAR(15)
    @Column
    private  String bankTerminalId;//			    CHAR(15)
    @Column
    private  String bankMerchantId;//			    CHAR(15)
    @Column
    private  String operNo;//		    CHAR(6)
    @Column
    private  String authNo;//		    CHAR(6)
    @Column
    private  String rrn;//		    CHAR(12)
    @Column
    private  String respCode;//			    CHAR(2)
    @Column
    private  String respCodeBank;//			    CHAR(4)
    @Column
    private  String respBankId;//			    CHAR(8)
    @Column
    private  String respHostId;//			    CHAR(2)
    @Column
    private  String inputMode;//			    CHAR(3)
    @Column
    private  String posConCode;//			    CHAR(2)
    @Column
    private  String ccyCode;//		    CHAR(3)
    @Column
    private  String mcc;//		    CHAR(4)
    @Column
    private  String idType;//		    CHAR(2)
    @Column
    private  String personalId;//			    CHAR(18)
    @Column
    private  String settleFlag;//			    CHAR(1)
    @Column
    private  String tranFlag;//			    CHAR(1)
    @Column
    private  String safFlag;//		    CHAR(1)
    @Column
    private  String offlineFlag;//			    CHAR(1)
    @Column
    private  String adviceFlag;//			    CHAR(1)
    @Column
    private  String mccCode;//		    CHAR(4)
    @Column
    private  String bankCode;//			    CHAR(2)
    @Column
    private  String terminalId;//			    CHAR(8)
    @Column
    private  String centerType;//			    CHAR(11)
    @Column
    private  String addData;//		    CHAR(100)
    @Column
    private  String orgId;//		    VARCHAR2(16)

    public long getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(long traceNo) {
        this.traceNo = traceNo;
    }

    public long getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(long batchNo) {
        this.batchNo = batchNo;
    }

    public long getBankBatchNo() {
        return bankBatchNo;
    }

    public void setBankBatchNo(long bankBatchNo) {
        this.bankBatchNo = bankBatchNo;
    }

    public long getVoidBatchNo() {
        return voidBatchNo;
    }

    public void setVoidBatchNo(long voidBatchNo) {
        this.voidBatchNo = voidBatchNo;
    }

    public long getBankTraceNo() {
        return bankTraceNo;
    }

    public void setBankTraceNo(long bankTraceNo) {
        this.bankTraceNo = bankTraceNo;
    }

    public long getVoidTraceNo() {
        return voidTraceNo;
    }

    public void setVoidTraceNo(long voidTraceNo) {
        this.voidTraceNo = voidTraceNo;
    }

    public long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(long invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public long getBankInvoiceNo() {
        return bankInvoiceNo;
    }

    public void setBankInvoiceNo(long bankInvoiceNo) {
        this.bankInvoiceNo = bankInvoiceNo;
    }

    public long getVoidInvoiceNo() {
        return voidInvoiceNo;
    }

    public void setVoidInvoiceNo(long voidInvoiceNo) {
        this.voidInvoiceNo = voidInvoiceNo;
    }

    public float getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(float tranAmt) {
        this.tranAmt = tranAmt;
    }

    public float getVoidAmt() {
        return voidAmt;
    }

    public void setVoidAmt(float voidAmt) {
        this.voidAmt = voidAmt;
    }

    public float getAddAmt() {
        return addAmt;
    }

    public void setAddAmt(float addAmt) {
        this.addAmt = addAmt;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getVoidTranType() {
        return voidTranType;
    }

    public void setVoidTranType(String voidTranType) {
        this.voidTranType = voidTranType;
    }

    public String getVoidOldType() {
        return voidOldType;
    }

    public void setVoidOldType(String voidOldType) {
        this.voidOldType = voidOldType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getPosTranStamp() {
        return posTranStamp;
    }

    public void setPosTranStamp(String posTranStamp) {
        this.posTranStamp = posTranStamp;
    }

    public String getLocalTranStamp() {
        return localTranStamp;
    }

    public void setLocalTranStamp(String localTranStamp) {
        this.localTranStamp = localTranStamp;
    }

    public String getBankTranStamp() {
        return bankTranStamp;
    }

    public void setBankTranStamp(String bankTranStamp) {
        this.bankTranStamp = bankTranStamp;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBankTerminalId() {
        return bankTerminalId;
    }

    public void setBankTerminalId(String bankTerminalId) {
        this.bankTerminalId = bankTerminalId;
    }

    public String getBankMerchantId() {
        return bankMerchantId;
    }

    public void setBankMerchantId(String bankMerchantId) {
        this.bankMerchantId = bankMerchantId;
    }

    public String getOperNo() {
        return operNo;
    }

    public void setOperNo(String operNo) {
        this.operNo = operNo;
    }

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespCodeBank() {
        return respCodeBank;
    }

    public void setRespCodeBank(String respCodeBank) {
        this.respCodeBank = respCodeBank;
    }

    public String getRespBankId() {
        return respBankId;
    }

    public void setRespBankId(String respBankId) {
        this.respBankId = respBankId;
    }

    public String getRespHostId() {
        return respHostId;
    }

    public void setRespHostId(String respHostId) {
        this.respHostId = respHostId;
    }

    public String getInputMode() {
        return inputMode;
    }

    public void setInputMode(String inputMode) {
        this.inputMode = inputMode;
    }

    public String getPosConCode() {
        return posConCode;
    }

    public void setPosConCode(String posConCode) {
        this.posConCode = posConCode;
    }

    public String getCcyCode() {
        return ccyCode;
    }

    public void setCcyCode(String ccyCode) {
        this.ccyCode = ccyCode;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getSettleFlag() {
        return settleFlag;
    }

    public void setSettleFlag(String settleFlag) {
        this.settleFlag = settleFlag;
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

    public String getOfflineFlag() {
        return offlineFlag;
    }

    public void setOfflineFlag(String offlineFlag) {
        this.offlineFlag = offlineFlag;
    }

    public String getAdviceFlag() {
        return adviceFlag;
    }

    public void setAdviceFlag(String adviceFlag) {
        this.adviceFlag = adviceFlag;
    }

    public String getMccCode() {
        return mccCode;
    }

    public void setMccCode(String mccCode) {
        this.mccCode = mccCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getCenterType() {
        return centerType;
    }

    public void setCenterType(String centerType) {
        this.centerType = centerType;
    }

    public String getAddData() {
        return addData;
    }

    public void setAddData(String addData) {
        this.addData = addData;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}
