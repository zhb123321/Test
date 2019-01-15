package com.zl.demo.mapper;

import java.util.List;

import com.zl.demo.popj.User;



public interface UserMapper {
		List<User> login();
		User queryByNameAndPw(String loginname,String loginpass);
		void add(User user);
	
}
