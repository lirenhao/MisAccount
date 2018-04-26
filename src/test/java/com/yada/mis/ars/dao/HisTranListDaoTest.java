package com.yada.mis.ars.dao;

import com.yada.mis.ars.model.HisTranList;
import com.yada.mis.ars.query.HisTranListQuery;
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
public class HisTranListDaoTest {

    @Autowired
    private HisTranListDao hisTranListDao;

    @Test
    public void test() {
        HisTranListQuery query = new HisTranListQuery();
        query.setRespCode("00");
        query.setTranFlag("0");
        query.setSafFlag("0");
        List<HisTranList> list = hisTranListDao.findAll(query);
        System.out.println(list);
    }
}