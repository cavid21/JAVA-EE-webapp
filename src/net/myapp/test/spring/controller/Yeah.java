package net.myapp.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Yeah {
	@RequestMapping(value="/yeah" , method = RequestMethod.GET )
	public String go(){
		System.out.println("YEAHHHHHH");
		return "Yeah"; 
	}
}
