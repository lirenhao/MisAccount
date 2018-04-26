package com.yada.mis.ars.service;

import com.yada.mis.ars.config.EacqProperties;
import com.yada.mis.ars.config.Mark;
import com.yada.mis.ars.config.OtherProperties;
import com.yada.mis.ars.model.AlipayTrans;
import com.yada.mis.ars.model.EacqTrans;
import com.yada.mis.ars.model.WechatTrans;
import com.yada.mis.ars.utils.ObjectToModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class FileHandleService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EacqProperties eacqProperties;
    private final OtherProperties otherProperties;
    private final EacqTransService eacqTransService;
    private final WechatTransService wechatTransService;
    private final AlipayTransService alipayTransService;

    @Value("${file-path}")
    private String filePath;

    @Autowired
    public FileHandleService(EacqProperties eacqProperties, OtherProperties otherProperties,
                             EacqTransService eacqTransService, WechatTransService wechatTransService,
                             AlipayTransService alipayTransService) {
        this.eacqProperties = eacqProperties;
        this.otherProperties = otherProperties;
        this.eacqTransService = eacqTransService;
        this.wechatTransService = wechatTransService;
        this.alipayTransService = alipayTransService;
    }

    public String handleEacq(String fileName) {
        logger.info("处理的文件名称:{}", fileName);
        String result;
        try {
            FileInputStream fis = new FileInputStream(filePath + fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis, eacqProperties.getCharset()));
            String line;
            while ((line = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile(eacqProperties.getRegex());
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    logger.info("EACQ-交易流水:{}", matcher.group());
                    EacqTrans eacqTrans = ObjectToModel.toEacqTrans(matcher, fileName);
                    eacqTransService.account(eacqTrans);
                }
            }
            reader.close();
            result = "EACQ文件已执行完，详情请查看日志";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.error("读取文件失败-{}", e.getMessage());
            result = String.format("读取EACQ[%s]文件失败", fileName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            logger.error("读取文件失败-{}", e.getMessage());
            result = String.format("读取EACQ[%s]文件失败", fileName);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("读取文件失败-{}", e.getMessage());
            result = String.format("读取EACQ[%s]文件失败", fileName);
        }
        return result;
    }

    public String handleOther(String fileName) {
        logger.info("处理的文件名称:{}", fileName);
        String result;
        try {
            FileInputStream fis = new FileInputStream(filePath + fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis, otherProperties.getCharset()));

            String tag = "";
            int lineNum = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                // 判断是微信交易还是支付宝交易
                for (Mark mark : otherProperties.getMarks()) {
                    if (line.contains(mark.getStartTag())) {
                        tag = mark.getTag();
                        lineNum = 0;
                    } else if (line.contains(mark.getEndTag())) {
                        tag = "";
                        lineNum = 0;
                    }
                    if (tag.equals(mark.getTag()) && lineNum >= mark.getLineNum()) {
                        logger.info("{}-{}:{}", tag, mark.getStartTag(), line);
                        if (tag.equals("wechat")) {
                            // 微信交易处理
                            WechatTrans wechatTrans = ObjectToModel.toWechatTrans(line, fileName);
                            wechatTransService.account(wechatTrans);
                        }
                        if (tag.equals("alipay")) {
                            // 支付宝交易处理
                            AlipayTrans alipayTrans = ObjectToModel.toAlipayTrans(line, fileName);
                            alipayTransService.account(alipayTrans);
                        }
                    }
                }
                lineNum++;
            }
            reader.close();
            result = "微信支付宝文件已执行完，详情请查看日志";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.error("读取文件失败-{}", e.getMessage());
            result = String.format("读取微信支付宝[%s]文件失败", fileName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            logger.error("读取文件失败-{}", e.getMessage());
            result = String.format("读取微信支付宝[%s]文件失败", fileName);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("读取文件失败-{}", e.getMessage());
            result = String.format("读取微信支付宝[%s]文件失败", fileName);
        }
        return result;
    }
}
