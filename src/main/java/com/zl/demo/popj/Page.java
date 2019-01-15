package com.zl.demo.popj;

import java.util.List;

public class Page<T> {
	private Integer pageSize;//页容量
	private Integer pageIndex;//当前页码
	private Integer pageMax;//最大页数
	private Integer pageCount;//总记录数
	private List<T> datas;//当前页显示数据
	private User user= new User();
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageMax() {
		pageMax=pageCount/pageSize;
		return (pageCount%pageSize)==0?pageMax:pageMax+1;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Page [pageSize=" + pageSize + ", pageIndex=" + pageIndex + ", pageMax=" + pageMax + ", pageCount="
				+ pageCount + ", datas=" + datas + "]";
	}
	
	
}
