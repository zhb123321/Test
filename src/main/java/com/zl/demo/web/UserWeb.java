package com.zl.demo.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.demo.popj.RestData;
import com.zl.demo.popj.User;
import com.zl.demo.service.IUserService;
@Controller
public class UserWeb {
	@Autowired
	private IUserService userService;

	//登录
	@RequestMapping("/loginName.action")
	@ResponseBody
	public RestData loginName(String loginname,String loginpass,HttpSession session) {
		User user = userService.queryByNameAndPw(loginname,loginpass);
		RestData restData= new RestData();	
		if (user==null) {
			restData.setRight("OFF");
			restData.setError("用户名或密码错误!");
		}else {
			session.setAttribute("user", user);
		}
		return restData;
	}
	//退出
	@RequestMapping("/removeSession.action")
	
	public String loginName(HttpSession session) {
		session.invalidate();
		return "redirect:/index.html";

	}
	
	//注册
	@RequestMapping("/register.action")
	public String register(User user, Model model) {
		System.err.println(user.getGender());
		userService.add(user);
		model.addAttribute("err","\"<script> alert('注册成功,请登录'); location.href='login.jsp'</script>\"");
		return "login";
	}
	

	
	//浏览历史
	@RequestMapping("/history.action")
	
	public String history(String pageSize,String pageNum,Model model) {

		return "index";
	}
}
