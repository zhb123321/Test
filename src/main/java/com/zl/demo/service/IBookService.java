package com.zl.demo.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.zl.demo.popj.Book;
import com.zl.demo.popj.Cartitem;
import com.zl.demo.popj.Page;
import com.zl.demo.popj.Query;

public interface IBookService {

	Page<Book> queryPage(Integer pageIndex,Query query,Integer pageSize, HttpSession session);
	
	Book queryByBookId(Integer bid);

	boolean deleteByBookId(Integer bid);

	void addByBookId(Cartitem cart);

	List<Cartitem> queryCart(Integer uid);
	
	Cartitem queryCartByBid(Integer bid);

	void updateCart(Cartitem cart);

}
