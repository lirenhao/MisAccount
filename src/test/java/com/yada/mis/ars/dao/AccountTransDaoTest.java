package com.yada.mis.ars.dao;

import com.yada.mis.ars.model.AccountTrans;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:application.properties"})
@SpringApplicationConfiguration
public class AccountTransDaoTest {

    @Autowired
    protected AccountTransDao accountTransDao;

    @Test
    public void test(){
        List<AccountTrans> count = accountTransDao.findAll();
        System.out.println(count);
    }
}