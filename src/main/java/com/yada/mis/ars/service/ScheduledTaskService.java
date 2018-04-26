package com.yada.mis.ars.service;

import com.yada.mis.ars.config.EacqProperties;
import com.yada.mis.ars.config.OtherProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTaskService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private EacqProperties eacqProperties;
    private OtherProperties otherProperties;
    private FileHandleService fileHandleService;

    @Autowired
    public ScheduledTaskService(EacqProperties eacqProperties, OtherProperties otherProperties,
                                FileHandleService fileHandleService) {
        this.eacqProperties = eacqProperties;
        this.otherProperties = otherProperties;
        this.fileHandleService = fileHandleService;
    }

    @Scheduled(cron = "${file-cron}")
    public void fileLoad() {
        logger.info("----------开始读取文件-----------");
        // 组装文件名称
        SimpleDateFormat eacqDateFormat = new SimpleDateFormat(eacqProperties.getDateFormat());
        String eacqFileName = String.format(eacqProperties.getFileFormat(),
                eacqProperties.getOrgCode(), eacqProperties.getOrgNo(), eacqDateFormat.format(new Date()));

        SimpleDateFormat otherDateFormat = new SimpleDateFormat(eacqProperties.getDateFormat());
        String otherFileName = String.format(otherProperties.getFileFormat(),
                otherProperties.getMerNo(), otherDateFormat.format(new Date()));

        fileHandleService.handleEacq(eacqFileName);
        fileHandleService.handleEacq(otherFileName);
    }
}
