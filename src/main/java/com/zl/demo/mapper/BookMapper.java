package com.zl.demo.mapper;

import java.util.List;

import com.zl.demo.popj.Book;
import com.zl.demo.popj.Cartitem;
import com.zl.demo.popj.Query;



public interface BookMapper {
//总记录数
	Integer queryCount(Query query);
//显示页数据
	List<Book> queryData(Query query);

	Book queryBookById(Integer bid);
	
	boolean deleteByBookId(Integer bid);
	
	void addByBookId(Cartitem cart);
	
	List<Cartitem> queryCart(Integer uid);
	Cartitem queryCartByBid(Integer bid);
	void updateCart(Cartitem cart);

}
