package com.yada.mis.ars.dao;

import com.yada.mis.ars.model.AccountTrans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountTransDao extends JpaRepository<AccountTrans, String>,JpaSpecificationExecutor<AccountTrans> {

}
