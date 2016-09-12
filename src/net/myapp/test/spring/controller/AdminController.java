package net.myapp.test.spring.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.myapp.model.Auth;

@Controller
public class AdminController {
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String printHello1(HttpServletRequest request , HttpServletResponse response) {
		Auth auth = new Auth("Cavid" , "c@mail.ru");
		
		Cookie[] cookies = request.getCookies();
 		HttpSession session=request.getSession();
		 
		System.out.println("id" + session.getId());
		System.out.println("creation time" + session.getCreationTime());
		System.out.println("max active interval" + session.getMaxInactiveInterval());
		System.out.println("last access time" + session.getLastAccessedTime());
		
		session.setAttribute("Auth", auth);
		
		return "admin";
	}
	@RequestMapping(value="/admin/hi",method = RequestMethod.GET)
	public String printHello2(HttpServletRequest request , HttpServletResponse response) {
		/*HttpSession session=request.getSession(false);
		if(session == null){return "redirect:admin3";}
		System.out.println("id" + session.getId());*/
		return "admin1";
	}
	@RequestMapping(value="/admin/logout",method = RequestMethod.GET)
	public String printHello3(HttpServletRequest request , HttpServletResponse response) {
		HttpSession session=request.getSession(false);
		System.out.println("id" + session.getId());
		session.invalidate();
		System.out.println("id" + session.getId());
		return "admin1";
	}
	@RequestMapping(value="/notFound",method = RequestMethod.GET)
	public String printHello4(HttpServletRequest request , HttpServletResponse response) {
		
		return "admin3";
	}
	
	
		
	  
	  
	  
	  
	  

}
