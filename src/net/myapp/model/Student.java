package net.myapp.model;


public class Student {
    /**
	 * @param id
	 * @param name
	 * @param surname
	 * @param firstname
	 * @param activity
	 * @param about
	 * @param email
	 * @param phone
	 * @param birthday
	 * @param city
	 * @param subject_id
	 */
	int id;
	String name;
	String surname;
	String firstname;
	String activity;
	String about;
	String email;
	String phone;
	String birthday;
	String city;
	String subject_id;
	String group_id;
	
	public Student(String name, String surname, String firstname, String activity, String about, String email,
			String phone, String birthday, String city, String subject_id, String group_id) {
		super();
		this.name = name;
		this.surname = surname;
		this.firstname = firstname;
		this.activity = activity;
		this.about = about;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
		this.city = city;
		this.subject_id = subject_id;
		this.group_id = group_id;
	}
	
	
	public Student() {
		super();
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
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}


	public String getGroup_id() {
		return group_id;
	}


	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	
	
	
	

	

}
