package net.myapp.test.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession session=request.getSession();
		  
		  String sG1 = request.getParameter("Email");
		  String sG2 = request.getParameter("Password");
		 
		  session.setAttribute("email" , sG1);
		  session.setAttribute("pass" , sG2);
		  
		  System.out.println(session.getAttribute("email"));
		  System.out.println(session.getAttribute("pass"));
		  
		  request.getRequestDispatcher("/WEB-INF/servletView/Yeah.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
