package net.myapp.model;

public class GroupAddRequest {
	
	String subjectid;
	String teachersid;
	String[] studentsid;
	
	
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getTeachersid() {
		return teachersid;
	}
	public void setTeachersid(String teachersid) {
		this.teachersid = teachersid;
	}
	public String[] getStudentsid() {
		return studentsid;
	}
	public void setStudentsid(String[] studentsid) {
		this.studentsid = studentsid;
	}
	
	
}
