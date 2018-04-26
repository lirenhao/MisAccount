package com.yada.mis.ars.view;

import com.yada.mis.ars.model.AccountTrans;

import java.util.List;

public class AccountTransView {

    // 每一页的大小
    private int size;
    // 第几页从0开始
    private int page;
    // 总条数
    private long total;
    // 返回的数据
    private List<AccountTrans> content;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<AccountTrans> getContent() {
        return content;
    }

    public void setContent(List<AccountTrans> content) {
        this.content = content;
    }
}
