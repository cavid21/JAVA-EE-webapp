package net.myapp.model;



public class Teacher {
	
    int id;
	String name;
	String surname;
	String firstname;
	String birthday;
	String about;
	String email;
	String phone;
	String subject;
	
	
	public Teacher() {
		super();
	}
	public Teacher( String name, String surname, String firstname, String birthday, String about, String email,
			String phone, String activity) {
		super();
		this.name = name;
		this.surname = surname;
		this.firstname = firstname;
		this.birthday = birthday;
		this.about = about;
		this.email = email;
		this.phone = phone;
		this.subject = activity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setActivity(String subject) {
		this.subject = subject;
	}
	

}
