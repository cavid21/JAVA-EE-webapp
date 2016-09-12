package net.myapp.web.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.myapp.test.spring.controller.Common;

import java.util.*;

public class AppCommonFilterTest implements Filter  {
		   public void  init(FilterConfig config) throws ServletException{

		      System.out.println("salamlar "+config.getInitParameter("company")); 
		   }
		   public void  doFilter(ServletRequest request, 
		                 ServletResponse response,
		                 FilterChain chain) 
		                 throws java.io.IOException, ServletException {


		      System.out.println("admin gelmek isdeyir");
		      HttpServletRequest req = (HttpServletRequest) request;
		      HttpServletResponse res = (HttpServletResponse) response;
		      
		      HttpSession session = req.getSession(true);
		      if(session.getAttribute("Auth") == null){res.sendRedirect("http://localhost:8080/WebApp/notFound");}
		      else{ chain.doFilter(request,response);}

		   }
		   public void destroy( ){
			   System.out.println("Tom died ");
		   }
}
