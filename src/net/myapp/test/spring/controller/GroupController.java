package net.myapp.test.spring.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.myapp.common.web.holders.RequestHelper;
import net.myapp.dao.Db;
import net.myapp.dao.StudentDAO;
import net.myapp.model.Group;
import net.myapp.model.GroupAddRequest;
import net.myapp.model.Student;
import net.myapp.model.Teacher;

@Controller
public class GroupController {
  
	@RequestMapping(value="/group/add",method = RequestMethod.GET)
	   public String printHello221(GroupAddRequest groupAddRequest) {
		Db.start();  
		StudentDAO studentDAO = new StudentDAO();
		  try {
			RequestHelper.setAttribute("Subjects" , studentDAO.getSubjectMap());
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
		 if(groupAddRequest.getTeachersid()!=null)
		 {
		 //System.out.println(groupAddRequest.getTeachers());
		 //System.out.println(groupAddRequest.getStudent()[0]);
		 
		 Group myGroup=new Group();
		// try {
			 Teacher myTeacher=null;//TeacherDAO.getTeacher(groupAddRequest.getTeachers());
			 ArrayList<Student> studentList=null;//StudentsDAO.getStudentsList(groupAddRequest.getStudentsid());
			myGroup.setTeacher(myTeacher);
			myGroup.setStudentList(studentList);
			
			
			
		 
		/* } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
		 
		 }
		 return "groupAdd";
	   }

	}
	
