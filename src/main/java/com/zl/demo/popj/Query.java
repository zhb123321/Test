package com.zl.demo.popj;

public class Query {
	private Integer pageState;//开始列
	private Integer pageEnd;//结束列
	private String condition; //模糊查询
	private  String cid  ;//'所属分类ID'
	private  String order;//价格排序
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public Integer getPageState() {
		return pageState;
	}
	public void setPageState(Integer pageState) {
		this.pageState = pageState;
	}
	public Integer getPageEnd() {
		return pageEnd;
	}
	public void setPageEnd(Integer pageEnd) {
		this.pageEnd = pageEnd;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Query [pageState=" + pageState + ", pageEnd=" + pageEnd + ", condition=" + condition + ", cid=" + cid
				+ ", order=" + order + "]";
	}
	

	
}
