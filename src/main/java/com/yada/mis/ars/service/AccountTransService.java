package com.yada.mis.ars.service;

import com.yada.mis.ars.dao.AccountTransDao;
import com.yada.mis.ars.model.AccountTrans;
import com.yada.mis.ars.query.AccountTransQuery;
import com.yada.mis.ars.view.AccountTransView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class AccountTransService {

    private AccountTransDao accountTransDao;

    @Autowired
    public AccountTransService(AccountTransDao accountTransDao) {
        this.accountTransDao = accountTransDao;
    }

    public AccountTransView queryView(AccountTransQuery query, Pageable pageable) {
        Page<AccountTrans> page =  accountTransDao.findAll(query, pageable);
        AccountTransView view = new AccountTransView();
        view.setSize(page.getSize());
        view.setPage(page.getNumber());
        view.setTotal(page.getTotalElements());
        view.setContent(page.getContent());
        return view;
    }
}
