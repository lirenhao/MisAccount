package com.yada.mis.ars.dao;

import com.yada.mis.ars.model.WechatTrans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WechatTransDao extends CrudRepository<WechatTrans, Long> {

    List<WechatTrans> findByFileName(String fileName);
}
