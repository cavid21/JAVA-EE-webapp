package net.myapp.test.spring.controller;

import net.myapp.common.logging.impl.Log;
import net.myapp.common.web.holders.RequestHelper;
import net.myapp.dao.Db;
import net.myapp.dao.StudentDAO;
import net.myapp.dao.TeacherDAO;
import net.myapp.model.Student;

import org.apache.log4j.Logger;
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
import javax.servlet.http.HttpSession;

@Controller
public class StudentController {
	 
	  ////normal page passing to default/jsp folder page inside of main.jsp
	  @RequestMapping(value="/studentList",method = RequestMethod.GET)
	   public String printHello(Student filter) {

			Db.start();
			StudentDAO studentDAO=new StudentDAO();
			try {
				RequestHelper.setAttribute("Subjects",studentDAO.getSubjectMap());
				RequestHelper.setAttribute("Filter",filter);
				RequestHelper.setAttribute("Student",studentDAO.getStudentsList(filter));
				
				Db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return "studentList";
	   }
	  ////normal page passing to default/jsp folder page inside of main.jsp
	  @RequestMapping(value="/addStudent",method = RequestMethod.GET)
	   public String printHello1(HttpServletRequest request) {
		  StudentDAO studentDAO1=new StudentDAO();
		  try {
			  Db.start();
			RequestHelper.setAttribute("Subjects",studentDAO1.getSubjectMap());
			Db.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
	     
  Student student=new Student(
			request.getParameter("name"),
			request.getParameter("surname"),
			request.getParameter("firstname"),
			request.getParameter("activity"),
			request.getParameter("about"),
			request.getParameter("email"),
			request.getParameter("phone"),
            request.getParameter("birthday"),
            request.getParameter("city"),
  			request.getParameter("subject_id"),
  			request.getParameter("group_id"));

	      try{
		   Db.start();
		   StudentDAO studentDAO=new StudentDAO();
		   studentDAO.addStudent(student);
		   
		
	     	Db.close();
		
	    }   catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return "addStudent";
	   }
	  
	  
	  
	  
	  @RequestMapping(value="/studentInfo",method = RequestMethod.GET)
	   public String printHello1(String id,HttpServletRequest request) {
		  
	
		  Db.start();
			try {
			
				RequestHelper.setAttribute("Student",StudentDAO.getStudent(id));
				
				
				
				Db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
 return "studentInfo";
	   }
	  
	  @RequestMapping(value="/test",method = RequestMethod.GET)
	   public String printHello2(String id) {
	     
		 System.out.println("/test iwleyir");
         return "test";
	   }

	  
	  
	  
	  
	  @ResponseBody
	   @RequestMapping(value="/GetNameByID",method=RequestMethod.GET)
	    public String printAjax(@RequestParam String id) {
		System.out.println("ajax work");
	    StudentDAO studentDAO=new StudentDAO();
	    String name="salam";
	    Db.start();
	    try {
			name=studentDAO.getStudent(id).getName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    finally {
	    	try {
				Db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
	    return "ajax tapdi "+name;
	   } 
	  }
