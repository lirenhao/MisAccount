package com.yada.mis.ars.query;

import com.yada.mis.ars.model.AccountTrans;
import com.yada.mis.ars.utils.DateUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

public class AccountTransQuery implements Specification<AccountTrans> {

    private static SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式

    @Override
    public Predicate toPredicate(Root<AccountTrans> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> list = new LinkedList<Predicate>();
        if (startDate != null && !"".equals(startDate.trim())) {
            //大于或等于传入时间
            list.add(cb.greaterThanOrEqualTo(root.get("tranDate").as(String.class), startDate));
        } else {
            list.add(cb.greaterThanOrEqualTo(root.get("tranDate").as(String.class), df.format(DateUtils.getTodayStart())));
        }
        if (endDate != null && !"".equals(endDate.trim())) {
            //小于或等于传入时间
            list.add(cb.lessThanOrEqualTo(root.get("tranDate").as(String.class), endDate));
        } else {
            list.add(cb.lessThanOrEqualTo(root.get("tranDate").as(String.class), df.format(DateUtils.getTodayEnd())));
        }
        if (list.size() > 0) {
            query.where(list.toArray(new Predicate[list.size()]));
        }
        return query.getRestriction();
    }

    private String startDate;

    private String endDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
