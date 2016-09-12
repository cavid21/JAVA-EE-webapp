package net.myapp.test.spring.controller;

import net.myapp.common.logging.impl.Log;
import net.myapp.common.web.holders.RequestHelper;
import net.myapp.dao.Db;
import net.myapp.dao.StudentDAO;
import net.myapp.dao.TeacherDAO;
import net.myapp.model.Student;
import net.myapp.model.Teacher;

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

@Controller
public class AjaxController {
	 
       @ResponseBody
       @RequestMapping(value="/GetTeachersBySubject",method = RequestMethod.GET)
	   public String printHello(String id) {
    	   
    	   TeacherDAO teacherDAO=new TeacherDAO();
    	   String r="";
    	   try {
    		   Db.start();
			
			
			for (Teacher myTeachers : teacherDAO.getTeachersListBySubjectID(id)) {
				r+="<option value='"+myTeachers.getId()+"'>"+myTeachers.getName()+"</option>";
			}
			
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
	   		 return r;
	   }
       
       @ResponseBody
       @RequestMapping(value="/GetStudentsBySubject",method = RequestMethod.GET)
	   public String printHello1(String id) {
    	   
    	 StudentDAO  studentDAO=new StudentDAO();
    	   String r="";
    	   try {
    		   Db.start();
			
			
			for (Student myStudent:studentDAO.getStudentsListBySubjectID(id) ) {
				r+="<input type='checkbox' name='student' value='"+myStudent.getId()+"'/>"+myStudent.getName();
			}
			
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
	   		 return r;
	   }
       
       
       
       
       
       
       
       
       
       
	  	  }
