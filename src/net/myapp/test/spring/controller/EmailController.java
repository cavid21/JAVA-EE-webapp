package net.myapp.test.spring.controller;

import net.myapp.common.logging.impl.Log;
import net.myapp.common.web.holders.RequestHelper;
import net.myapp.dao.Db;
import net.myapp.dao.EmailDAO;
import net.myapp.dao.StudentDAO;
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

@Controller
public class EmailController {
  
	@RequestMapping(value="/email",method = RequestMethod.GET)
	   public String printHello221(String email) {
		  
		  
		  
	
		 return "email";
	   }

	  ////normal page passing to default/jsp folder page inside of main.jsp 
	@RequestMapping(value="/checkEmail",method = RequestMethod.GET)
	   public String printHello1(String email) {
		String r="tapildi";
		Db.start();
		
		EmailDAO emailDAO=new EmailDAO();
		StudentDAO studentDAO=new StudentDAO();
		Student student=new Student();
		try {
			
			if(!emailDAO.checkEmail(email)){r="tapilmadi ve elave edildi ";
			

	        Student myStudent=new Student();
	        myStudent.setName("Test");
	        myStudent.setSurname("xxxx");
	        myStudent.setPhone("12345678");
	        myStudent.setEmail(email);
	        
	        studentDAO.addStudent(myStudent);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		 //return r;
		return "test";
	   }
	  
	  
	  


	  
	  
	  

	  }
