package com.yada.mis.ars.utils;

import com.yada.mis.ars.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectToModel {

    private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

    public static AlipayTrans toAlipayTrans(String line, String fileName) {
        String tran = line.replaceAll("\\s+", "#");
        String[] strings = tran.split("#");

        AlipayTrans trans = new AlipayTrans();
        // 商户编号
        String merNo = strings[0];
        trans.setMerNo(merNo);
        // 终端号
        String termNo = strings[1];
        trans.setTermNo(termNo);
        // 交易方式
        String tranType = strings[2];
        trans.setTranType(tranType);
        // 业务类型
        String busType = strings[3];
        trans.setBusType(busType);
        // 支付宝交易号
        String aliTranNo = strings[4];
        trans.setAliTranNo(aliTranNo);
        // 结算日期
        String settleDate = strings[5];
        trans.setSettleDate(settleDate);
        // 交易时间
        String tranDate = strings[6] + " " + strings[7];
        trans.setTranDate(tranDate);
        // 交易金额
        String tranAmt = strings[8];
        trans.setTranAmt(tranAmt);
        // 手续费
        String fee = strings[9];
        trans.setFee(fee);
        // 结算金额
        String settleAmt = strings[10];
        trans.setSettleAmt(settleAmt);
        if ("退款".equals(strings[3])) {
            // 退款批次号/请求号
            String batchNo = strings[11];
            trans.setBatchNo(batchNo);
            // 订单金额
            String orderAmt = strings[12];
            trans.setOrderAmt(orderAmt);
            // 商户订单号
            String orderNo = strings[13];
            trans.setOrderNo(orderNo);
        } else {
            // 订单金额
            String orderAmt = strings[11];
            trans.setOrderAmt(orderAmt);
            // 商户订单号
            String orderNo = strings[12];
            trans.setOrderNo(orderNo);
        }
        // 备注
        String remarks = "";
        trans.setRemarks(remarks);
        // 文件来源
        trans.setFileName(fileName);
        trans.setExpDate(df.format(new Date()));
        return trans;
    }

    public static WechatTrans toWechatTrans(String line, String fileName) {
        String tran = line.replaceAll("\\s+", "#");
        String[] strings = tran.split("#");

        WechatTrans trans = new WechatTrans();
        // 商户编号
        String merNo = strings[0];
        trans.setMerNo(merNo);
        // 终端号
        String termNo = strings[1];
        trans.setTermNo(termNo);
        // 交易方式
        String tranType = strings[2];
        trans.setTranType(tranType);
        // 交易状态
        String tranStatus = strings[3];
        trans.setTranStatus(tranStatus);
        // 微信订单号
        String wcTranNo = strings[4];
        trans.setWcTranNo(wcTranNo);
        // 结算日期
        String settleDate = strings[5];
        trans.setSettleDate(settleDate);
        // 交易时间
        String tranDate = strings[6] + " " + strings[7];
        trans.setTranDate(tranDate);
        // 交易金额
        String tranAmt = strings[8];
        trans.setTranAmt(tranAmt);
        // 手续费
        String fee = strings[9];
        trans.setFee(fee);
        // 结算金额
        String settleAmt = strings[10];
        trans.setSettleAmt(settleAmt);
        if ("REFUND".equals(strings[3])) {
            // 微信退款单号
            String wcRefundNo = strings[11];
            trans.setWcRefundNo(wcRefundNo);
            // 商户退款单号
            String refundNo = strings[12];
            trans.setRefundNo(refundNo);
            // 退款类型
            String refundType = strings[13];
            trans.setRefundType(refundType);
            // 退款状态
            String refundStatus = strings[14];
            trans.setRefundStatus(refundStatus);
            // 退款金额
            String refundAmt = strings[15];
            trans.setRefundAmt(refundAmt);
            // 退款手续费
            String refundFee = strings[16];
            trans.setRefundFee(refundFee);
            // 商户订单号
            String orderNo = strings[17];
            trans.setOrderNo(orderNo);
            // 付款银行
            String bankType = strings[18];
            trans.setBankType(bankType);
            // 备注
            String remarks = strings[19];
            trans.setRemarks(remarks);
        } else {
            // 微信退款单号
            String wcRefundNo = strings[11];
            trans.setWcRefundNo(wcRefundNo);
            // 商户退款单号
            String refundNo = strings[12];
            trans.setRefundNo(refundNo);
            // 退款金额
            String refundAmt = strings[13];
            trans.setRefundAmt(refundAmt);
            // 退款手续费
            String refundFee = strings[14];
            trans.setRefundFee(refundFee);
            // 商户订单号
            String orderNo = strings[15];
            trans.setOrderNo(orderNo);
            // 付款银行
            String bankType = strings[16];
            trans.setBankType(bankType);
            // 备注
            String remarks = strings[17];
            trans.setRemarks(remarks);
        }
        // 文件来源
        trans.setFileName(fileName);
        trans.setExpDate(df.format(new Date()));
        return trans;
    }

    public static EacqTrans toEacqTrans(Matcher matcher, String fileName) {
        EacqTrans trans = new EacqTrans();
        // 终端号
        String termNo = matcher.group(1);
        trans.setTermNo(termNo);
        // 批号
        String batchNo = matcher.group(2);
        trans.setBatchNo(batchNo);
        // 交易卡号
        String cardNo = matcher.group(3);
        trans.setCardNo(cardNo);
        // 交易日期
        String tranDate = matcher.group(4);
        trans.setTranDate(tranDate);
        // 交易时间
        String tranTime = matcher.group(5);
        trans.setTranTime(tranTime);
        // 交易金额
        String tranAmt = matcher.group(6);
        trans.setTranAmt(tranAmt);
        // 手续费
        String fee = matcher.group();
        trans.setFee(fee);
        // 结算金额
        String settleAmt = matcher.group(7);
        trans.setSettleAmt(settleAmt);
        // 授权码
        String authNo = matcher.group(8);
        trans.setAuthNo(authNo);
        // 交易码
        String tranType = matcher.group(9);
        trans.setTranType(tranType);
        // 分期
        String stag = matcher.group(10);
        trans.setStag(stag);
        // 卡别
        String cardType = matcher.group(11);
        trans.setCardType(cardType);
        // 参考号
        String rrn = matcher.group(12);
        trans.setRrn(rrn);
        // 文件来源
        trans.setFileName(fileName);
        trans.setExpDate(df.format(new Date()));
        return trans;
    }

    public static AccountTrans toAccountTrans(HisTranList hisTranList) {
        AccountTrans trans = new AccountTrans();
        trans.setTraceNo(hisTranList.getTraceNo() + "");// 流水号
        trans.setBatchNo(hisTranList.getBatchNo() + "");// 批次号
        trans.setMerNo(hisTranList.getMerchantId());// 商户号
        trans.setTermNo(hisTranList.getTerminalId());// 终端号
        trans.setCardNo(hisTranList.getCardNo());// 卡号
        trans.setTranType(hisTranList.getTranType());// 交易类型
        trans.setTranDate(hisTranList.getPosTranStamp());// 交易时间
        trans.setTranAmt(hisTranList.getTranAmt() + "");// 金额
        trans.setRrn(hisTranList.getRrn());// 参考号
        trans.setInvoiceNo(hisTranList.getInvoiceNo() + "");// 票据号
        return trans;
    }
}
