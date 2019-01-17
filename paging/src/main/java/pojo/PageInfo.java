package pojo;

import java.util.List;

public class PageInfo {
    private int pageSize;
    private int pageNumber;
    private int totalEntryNumber;
    private List<?> list;

    public PageInfo(int pageSize, int pageNumber, int totalEntryNumber, List<?> list) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalEntryNumber = totalEntryNumber;
        this.list = list;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalEntryNumber() {
        return totalEntryNumber;
    }

    public void setTotalEntryNumber(int totalEntryNumber) {
        this.totalEntryNumber = totalEntryNumber;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
