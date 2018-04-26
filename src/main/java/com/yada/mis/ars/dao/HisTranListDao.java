package com.yada.mis.ars.dao;

import com.yada.mis.ars.model.HisTranList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HisTranListDao extends JpaRepository<HisTranList, Long>, JpaSpecificationExecutor<HisTranList> {
}
