package net.myapp.model;

import java.util.ArrayList;

public class Group {
	
	int id;
	Teacher teacher;
	ArrayList<Student>  studentList;
	public Group(int id, Teacher teacher, ArrayList<Student> studentList) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.studentList = studentList;
	}
	


	public Group() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	

}
