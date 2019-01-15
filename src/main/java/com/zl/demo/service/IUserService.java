package com.zl.demo.service;

import java.util.List;

import com.zl.demo.popj.User;

public interface IUserService {
		List<User> queryAll();

		User queryByNameAndPw(String loginname,String loginpass);

		void add(User user);

}
