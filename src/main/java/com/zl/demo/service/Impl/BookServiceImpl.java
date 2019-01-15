package com.zl.demo.service.Impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.demo.mapper.BookMapper;
import com.zl.demo.popj.Book;
import com.zl.demo.popj.Cartitem;
import com.zl.demo.popj.Page;
import com.zl.demo.popj.Query;
import com.zl.demo.popj.User;
import com.zl.demo.service.IBookService;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private BookMapper bookMapper;

	public Page<Book> queryPage(Integer pageIndex,Query query, Integer pageSize,HttpSession session) {
			Page<Book> pages=new Page<Book>();
			User user = (User) session.getAttribute("user");
			if (user==null) {
				pages.setUser(null);
			}
		
			pages.setPageIndex(pageIndex);
			pages.setPageSize(pageSize);
			query.setPageState((pageIndex-1)*pageSize);
			query.setPageEnd(pageSize);
			pages.setUser(user);
			pages.setPageCount(bookMapper.queryCount(query));
			pages.setDatas(bookMapper.queryData(query));
		return pages;
	}

	@Override
	public Book queryByBookId(Integer bid) {
		
		return bookMapper.queryBookById(bid);
	}


	@Override
	public boolean deleteByBookId(Integer bid) {
		 return bookMapper.deleteByBookId(bid);
	}


	@Override
	public void addByBookId(Cartitem cart) {
		bookMapper.addByBookId(cart);
	}


	@Override
	public List<Cartitem> queryCart(Integer uid) {
		
		return bookMapper.queryCart(uid);
	}


	@Override
	public void updateCart(Cartitem cart) {
		bookMapper.updateCart(cart);
		
	}


	@Override
	public Cartitem queryCartByBid(Integer bid) {
		
		return  bookMapper.queryCartByBid(bid);
	}
	


}
