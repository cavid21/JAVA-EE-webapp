package net.myapp.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.myapp.model.Auth;

@Controller
public class AuthorizationController {
	@RequestMapping(value="/authPage" , method=RequestMethod.GET)
	public String print(){
		Auth auth = new  Auth("cavid@mail.ru" , "12345");
		//String email = Request.getParameter("email");
		return "Yeah";
	}
}
