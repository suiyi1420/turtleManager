package turtleManager.Domain;

/**
 * Created by Killer on 2017/10/2.
 */
public class Page {
    private int currentPage;//当前页数
    private int pageCount;//总页数
    private int pageSize=5;//每页显示数据数目
    private int itemCount;//数据总数目

    public Page() {
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
