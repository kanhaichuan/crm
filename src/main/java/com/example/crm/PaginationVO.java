package com.example.crm;

import java.util.List;

/**
 * @date:2019/5/21
 * @author:felix
 */
public class PaginationVO<T> {
    private Integer total;
    private List<T> dataList;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
