package com.zl.demo.popj;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

//商品
public class Book {
	private Integer bid; //'主键'
	private String bname ;// '图书名称'
	private String author ; //'作者'
	private double price ;// '定价'
	private double currPrice; // '当前价'
	private double discount ;// '折扣'
	private String press ;// '出版社'
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",locale="zh",timezone="GMT+8")
	private Date publishtime ;// '上架时间'
	private Integer weight  ;//'重量'
	private  String cid  ;//'所属分类ID'
	private Integer star  ;//'用户评价'
	private String image_w ;// '大图路径'
	private String image_b ;// '小图路径'
	private Integer stock  ;//'库存'
	private String book_no ;// '商品货号'
	private String description  ;//'描述'
	
	private String cname;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Double getCurrPrice() {
		return currPrice;
	}
	public void setCurrPrice(double currPrice) {
		this.currPrice = currPrice;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public Date getPublishtime() {
		return publishtime;
	}
	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	public String getImage_w() {
		return image_w;
	}
	public void setImage_w(String image_w) {
		this.image_w = image_w;
	}
	public String getImage_b() {
		return image_b;
	}
	public void setImage_b(String image_b) {
		this.image_b = image_b;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getBook_no() {
		return book_no;
	}
	public void setBook_no(String book_no) {
		this.book_no = book_no;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + ", currPrice="
				+ currPrice + ", discount=" + discount + ", press=" + press + ", publishtime=" + publishtime
				+ ", weight=" + weight + ", cid=" + cid + ", star=" + star + ", image_w=" + image_w + ", image_b="
				+ image_b + ", stock=" + stock + ", book_no=" + book_no + ", description=" + description + "]";
	}
	
}
