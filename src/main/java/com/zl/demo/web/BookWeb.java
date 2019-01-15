package com.zl.demo.web;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.demo.popj.Book;
import com.zl.demo.popj.Page;
import com.zl.demo.popj.Query;
import com.zl.demo.redis.RedisUtil;
import com.zl.demo.service.IBookService;

@Controller
public class BookWeb {
	@Autowired
	private IBookService bookService;
	//主页
	
	@RequestMapping("/index.action")
	@ResponseBody
	public Page<Book>  index(@RequestParam(defaultValue="1") Integer pageIndex,
						@RequestParam(defaultValue="12") Integer pageSize,
						Query query,HttpSession session) {
		Page<Book> pages=bookService.queryPage(pageIndex,query,pageSize,session);
		if (!RedisUtil.hasKey("test")) {
			RedisUtil.set("test",pages.getUser());
		}
		return pages;
	}
	//查看
	@RequestMapping("/detail.action")
	@ResponseBody
	public Book detail(Integer bid) {
		Book book = bookService.queryByBookId(bid);
		return book;
	}
	
	//删除
	@RequestMapping("/delMore.action")
	public String delMore(Integer[] bids) {
		System.err.println(bids.toString());
		for (Integer bid : bids) {
		boolean rest=bookService.deleteByBookId(bid);
		if (rest) {
			System.out.println("删除成功------------------------------");
			}
		}
		return "redirect:/index.html";
	}
	
}
