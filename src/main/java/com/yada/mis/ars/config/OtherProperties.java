package com.yada.mis.ars.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "other")
public class OtherProperties {

    private String fileFormat;

    private String merNo;

    private String dateFormat;

    private String charset;

    private Mark[] marks;

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }
}
