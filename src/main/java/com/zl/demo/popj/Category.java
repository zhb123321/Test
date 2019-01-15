package com.zl.demo.popj;

//分类
public class Category {
	private String cid ;//'分类ID主键',
	private String cname ;//'分类名称',
	private String desc ; //'分类描述',
	private Integer orderBy ; //'序号,用于排序',
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", desc=" + desc + ", orderBy=" + orderBy + "]";
	}
	
}
