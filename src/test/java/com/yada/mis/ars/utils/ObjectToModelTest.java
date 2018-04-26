package com.yada.mis.ars.utils;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectToModelTest {

    @Test
    public void toAlipayTrans() {
        String line = "2088721458626814      48045977    条码支付        退款          2017072521001004110201027611\t     20170725  2017-07-25 17:00:49           -0.01          0.00           -0.01  2831118770910097001\t                                                          0.01  2831117115762363001";
        String tran = line.replaceAll("\\s+", "#");
        String[] strings = tran.split("#");
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < strings.length; i ++) {
            a.append("\n").append(i).append(":").append(strings[i]);
        }
        System.out.println(a);
    }

    @Test
    public void toWechatTrans() {
        String line = "35199461           48404434    MICROPAY REFUND        4004792001201707242368913298      20170725  2017-07-25 11:44:11            0.00          0.00          -17.00  50000203702017072501457120848                                     2829217145247599001                                                 ORIGINAL     SUCCESS           17.00          0.00  2819937908559743001                ABC_DEBIT  涓\uE15Eぇ鍏\uE0A6櫌锛堟繁鍦筹級 ";
        String tran = line.replaceAll("\\s+", "#");
        String[] strings = tran.split("#");
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < strings.length; i ++) {
            a.append("\n").append(i).append(":").append(strings[i]);
        }
        System.out.println(a);
    }

    @Test
    public void toEacqTrans() {
        String line = "1 48001132 000579 6222601310021307590  20130719 074432        629.00          1.26         627.74  722100 PCEP 0000 CUPD 319968384183";
        Pattern pattern = Pattern.compile(".{1}\\s+(.{8})\\s+(.{6})\\s+(.{20})\\s+(\\d{8})\\s+(\\d{6})\\s+(.{13}).\\s+(.{12}).\\s+(.{13}).\\s+(.{6})\\s+(.{4})\\s+((.{4})|(.{4})\\s+(.{4})\\s+(.{12}))");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}