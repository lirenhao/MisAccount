package com.yada.mis.ars.web;

import com.yada.mis.ars.query.AccountTransQuery;
import com.yada.mis.ars.service.AccountTransService;
import com.yada.mis.ars.service.FileHandleService;
import com.yada.mis.ars.view.AccountTransView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private AccountTransService accountTransService;
    private FileHandleService fileHandleService;

    @Autowired
    public WebController(AccountTransService accountTransService, FileHandleService fileHandleService) {
        this.accountTransService = accountTransService;
        this.fileHandleService = fileHandleService;
    }

    @Value("${file-token}")
    private String fileToken;

    @RequestMapping("/")
    public AccountTransView query(AccountTransQuery query, @PageableDefault(value = 100) Pageable pageable) {
        return accountTransService.queryView(query, pageable);
    }

    @RequestMapping("/export")
    public String export(String passWord, String fileName, String fileType) {
        if(fileToken.equals(passWord)) {
            if ("eacq".equals(fileType)) {
                return fileHandleService.handleEacq(fileName);
            } else {
                return fileHandleService.handleOther(fileName);
            }
        } else {
            return "没有访问该资源的权限";
        }
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return e.getMessage();
    }
}
