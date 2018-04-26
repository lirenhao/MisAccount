package com.yada.mis.ars.dao;

import com.yada.mis.ars.model.AlipayTrans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlipayTransDao extends CrudRepository<AlipayTrans, Long> {

    List<AlipayTrans> findByFileName(String fileName);
}
