package net.myapp.dao;

import java.sql.SQLException;

import net.myapp.model.Email;
import net.myapp.model.Teacher;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
Db.start();
/*
TeacherDAO teacherDAO=new TeacherDAO();
Teacher teacher=new Teacher();

teacherDAO.getTeachersList();
Db.start();
//testing studentDAO.getStudentsList() method
for (Teacher myTeacher : teacherDAO.getTeachersList()) {
	System.out.println(myTeacher.getName());
}*/
		
		
		EmailDAO emailDAO=new EmailDAO();
		Email email=new Email();
		
	System.out.println(emailDAO.checkEmail("vezir@mail.ru"));

		


	
	}

}
