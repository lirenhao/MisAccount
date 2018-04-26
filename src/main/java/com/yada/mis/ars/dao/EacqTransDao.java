package com.yada.mis.ars.dao;

import com.yada.mis.ars.model.EacqTrans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EacqTransDao extends CrudRepository<EacqTrans, Long> {

    List<EacqTrans> findByFileName(String fileName);
}
