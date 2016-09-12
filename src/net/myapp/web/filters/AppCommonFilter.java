package net.myapp.web.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.myapp.common.web.holders.RequestHolder;
import net.myapp.common.web.holders.ResponseHolder;
import net.myapp.test.spring.controller.Common;

import java.util.*;

public class AppCommonFilter implements Filter  {
		   public void  init(FilterConfig config) 
		                         throws ServletException{
		      // Get init parameter 
		      String testParam = config.getInitParameter("test-param"); 

		      //Print the init parameter 
		      System.out.println("Test Param: " + testParam); 
		   }

		   private void doBeforeProcessing(HttpServletRequest request, HttpServletResponse response)
		   {
		   

		     RequestHolder.set(request);
		     ResponseHolder.set(response);
		    }
		   
		   
		   public void  doFilter(ServletRequest request, 
		                 ServletResponse response,
		                 FilterChain chain) 
		                 throws java.io.IOException, ServletException {
System.out.println("filter start");
			  doBeforeProcessing((HttpServletRequest)request, (HttpServletResponse)response);
		      // Pass request back down the filter chain
		      chain.doFilter(request,response);
		      System.out.println("filter end");
		      doAfterProcessing((HttpServletRequest)request, (HttpServletResponse)response);
		   }
		   
		   private void doAfterProcessing(HttpServletRequest request, HttpServletResponse response)
		   {
		    /* DataSessionHolder.closeCurrentThreadConnections();*/
		     
		    /* ViewErrorHolder.remove();
		     ViewMessagesHolder.remove();
		    */ 
			 RequestHolder.remove();
		     ResponseHolder.remove();
		     /*WebSessionHolder.remove();*/
		   }
		   public void destroy( ){
		      /* Called before the Filter instance is removed 
		      from service by the web container*/
		   }
}
