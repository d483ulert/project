package com.my.project.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@RequestMapping("/join")
	public String UserJoin() {
		
		return "user/join";
	}
	
	
	@RequestMapping("/userAdd")
	public void UserAdd() {
		
	}
	
	
	@RequestMapping("/login")
	public String Login() {
		 
		return "user/login";
	}
	
	
	@RequestMapping("/loginAction")
	public void LoginAction() {
		
	}

}
