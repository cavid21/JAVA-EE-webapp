package net.myapp.test.spring.controller;

import net.myapp.common.logging.impl.Log;
import net.myapp.common.web.holders.RequestHelper;
import net.myapp.dao.Db;
import net.myapp.dao.StudentDAO;
import net.myapp.dao.TeacherDAO;
import net.myapp.model.Student;
import net.myapp.model.Teacher;

import org.apache.catalina.connector.Request;
import org.apache.log4j.Logger;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TeacherController {
	 
	  ////normal page passing to default/jsp folder page inside of main.jsp
	  @RequestMapping(value="/teacherList",method = RequestMethod.GET)
	   public String printHello() {
	     

			Db.start();
			TeacherDAO teacherDAO=new TeacherDAO();
			try {
			

							
				RequestHelper.setAttribute("Teacher",teacherDAO.getTeachersList());
				
				
				
				Db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return "teacherList";
	   }
	  
	  ////normal page passing to default/jsp folder page inside of main.jsp
	  @RequestMapping(value="/addTeacher",method = RequestMethod.GET)
	   public String print(HttpServletRequest request) {
		 
		  
		Teacher teacher=new Teacher(
				request.getParameter("name"),
				request.getParameter("surname"),
				request.getParameter("firstname"),
				request.getParameter("birthday"),
				request.getParameter("about"),
				request.getParameter("email"),
				request.getParameter("phone"),
				request.getParameter("subject"));
		

		
		
		try{
			Db.start();
			TeacherDAO teacherDAO=new TeacherDAO();
			teacherDAO.addTeacher(teacher);
			
			Db.close();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		 return "addTeacher";
	   }
	  
	  

	  
	  }

