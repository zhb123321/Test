package com.zl.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.demo.mapper.UserMapper;
import com.zl.demo.popj.User;
import com.zl.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper usermapper;

	public List<User> queryAll() {
		return usermapper.login();
	}

	
	public User queryByNameAndPw(String loginname,String loginpass) {

		return usermapper.queryByNameAndPw(loginname,loginpass);
	}


	public void add(User user) {
		
		usermapper.add(user);
	}


	


	
}
