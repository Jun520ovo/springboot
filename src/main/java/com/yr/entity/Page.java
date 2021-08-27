package com.yr.entity;


import java.util.ArrayList;
import java.util.List;

public class Page<T> {

    private int pageSize = 3;// 每页多少条记录数
    private int pageNo = 1;// 当前页
    private int pageCount = 0;// 总页数
    private Long sum;//总条数
    private int start;//开始下标
    private List<T> pgList = new ArrayList<>();//数据集合

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }


    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<T> getPgList() {
        return pgList;
    }

    public void setPgList(List<T> pgList) {
        this.pgList = pgList;
    }

    //计算出总页数
    public Long getPageCount() {
        if (sum % pageSize == 0) {
            return sum / pageSize;
        } else {
            return sum / pageSize + 1;
        }
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                ", pageCount=" + pageCount +
                ", sum=" + sum +
                ", start=" + start +
                ", pgList=" + pgList +
                '}';
    }
}
