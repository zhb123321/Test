package com.zl.demo.popj;

public class Cartitem {
	private Integer cartItemId ; //'主键',
	private Integer  quantity ;//'数量',
	private Integer  bid ; //'图书ID', 
	private Integer  uid ;//'用户ID',
	private double price ; //'价格',
	private String image_b ; //'小图路径',
	
	public Integer getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Integer cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage_b() {
		return image_b;
	}

	public void setImage_b(String image_b) {
		this.image_b = image_b;
	}

	@Override
	public String toString() {
		return "Cartitem [cartItemId=" + cartItemId + ", quantity=" + quantity + ", bid=" + bid + ", uid=" + uid
				+ ", price=" + price + ", image_b=" + image_b + "]";
	}
	
	
}

