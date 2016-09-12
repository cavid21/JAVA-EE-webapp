package net.myapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import net.myapp.dao.Db;
import net.myapp.model.Student;


public class StudentDAO {
	String sql;
	public  List<Student> getStudentsList(String s) throws SQLException
	{
		List<Student> itemList=new ArrayList<Student>();
		Student item;
        sql=s;
		ResultSet rs=Db.stmt.executeQuery(sql);
		
		while (rs.next()) {
			item=new Student();
			
			item.setId(rs.getInt("id"));
			item.setName(rs.getString("name"));
			item.setSurname(rs.getString("surname"));
			item.setFirstname(rs.getString("firstname"));
		//	item.setActivity(rs.getString("sub.name"));
			item.setAbout(rs.getString("about"));
			item.setEmail(rs.getString("email"));
			item.setPhone(rs.getString("phone"));
			item.setBirthday(rs.getString("birthday"));
			item.setCity(rs.getString("city"));
			item.setCity(rs.getString("subject_id"));
			item.setCity(rs.getString("group_id"));
			
			
			itemList.add(item);
		}
		
		rs.close();
		return itemList;
	
	}
	public  List<Student> getStudentsList() throws SQLException
	{
		sql="Select * from students";
	return this.getStudentsList(sql);
	}
	
	public  List<Student> getStudentsListBySubjectID(String id) throws SQLException
	{
		sql="Select * from student where subject_id='"+id+"'"
				+ " and group_id is null ";
         
	return this.getStudentsList(sql);
	}

	public  List<Student> getStudentsList(Student filter) throws SQLException
	{
		List<Student> itemList=new ArrayList<Student>();
		Student item;
		
		
        sql="Select * from students where 1=1";
        
        //filter.getName()!=null
        if(filter.getName()!=null && !filter.getName().equals("")){
        	sql+=" and name='"+filter.getName()+"'";
        }
        if(filter.getSurname()!=null && !filter.getSurname().equals("")){
        	sql+=" and surname='"+filter.getSurname()+"'";
        }
        if(filter.getActivity()!=null && !filter.getActivity().equals("null")){
        	sql+=" and subject_id='"+filter.getActivity()+"'";
        }
        
        System.out.println(sql);
        return this.getStudentsList(sql);	
	//	return null;
		
	}

	public static Student getStudent(String id) throws SQLException
	{
       String sql;
		Student item = null;
        sql="Select * from students where id="+id;

	    System.out.println(sql);
        
        ResultSet rs=Db.stmt.executeQuery(sql);
		
		while (rs.next()) {
			item=new Student();
			
			item.setId(rs.getInt("id"));
			item.setName(rs.getString("name"));
			item.setSurname(rs.getString("surname"));
			item.setFirstname(rs.getString("firstname"));
			item.setActivity(rs.getString("activity"));
			item.setAbout(rs.getString("about"));
			item.setEmail(rs.getString("email"));
			item.setPhone(rs.getString("phone"));
			item.setBirthday(rs.getString("birthday"));
			item.setCity(rs.getString("city"));
			item.setCity(rs.getString("subject_id"));
			item.setCity(rs.getString("group_id"));
			

		}
		
		rs.close();
		return item;
	
		
	}
	public  int addStudent(Student myStudent) throws SQLException
	{
		String sql="INSERT INTO students (name,surname,firstname,activity,about,email,phone,birthday,city,subject_id,group_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

			//PreparedStatement pst = (PreparedStatement) Db.getConnection().prepareStatement(sql);
		
			try{
			PreparedStatement pst=(PreparedStatement) Db.conn.prepareStatement(sql);
				
			pst.setString(1,myStudent.getName());
			pst.setString(2,myStudent.getSurname());
			pst.setString(3,myStudent.getFirstname());
			pst.setString(4,myStudent.getActivity());
			pst.setString(5,myStudent.getAbout());
			pst.setString(6,myStudent.getEmail());
			pst.setString(7,myStudent.getPhone());
			pst.setString(8,myStudent.getBirthday());
			pst.setString(9,myStudent.getCity());
			pst.setString(10,myStudent.getSubject_id());
			pst.setString(11,myStudent.getGroup_id());
			
			pst.execute();
			pst.executeUpdate();
			pst.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
	
	public  int updateStudent(Student myStudent) throws SQLException
	{
		String sql="INSERT INTO students "
				+ " (name,surname,firstname,activity,about,email,phone,birthday,city,subject_id,group_id) "
				+ " values (?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = (PreparedStatement) Db.getConnection().prepareStatement(sql);
		preparedStatement.setString(1, myStudent.getName());
		preparedStatement.setString(2, myStudent.getSurname());
		preparedStatement.setString(3, myStudent.getFirstname());
		preparedStatement.setString(4, myStudent.getActivity());
		preparedStatement.setString(5, myStudent.getAbout());
		preparedStatement.setString(6, myStudent.getEmail());
		preparedStatement.setString(7,myStudent.getPhone());
		preparedStatement.setString(8, myStudent.getBirthday());
		preparedStatement.setString(9, myStudent.getCity());
		preparedStatement.setString(10, myStudent.getSubject_id());
		preparedStatement.setString(10, myStudent.getGroup_id());

		// execute insert SQL stetement
		preparedStatement .executeUpdate();
		
		preparedStatement.executeUpdate(sql);
		
		preparedStatement.close();
		return 0;
		}
	
	
	public  HashMap<String,String> getSubjectMap() throws SQLException
	{
		HashMap<String,String> itemMap=new HashMap<String,String>();
		Student item;
		
		
        sql="Select * from subjects where status=1 ";
        
        
        System.out.println(sql);
        
		ResultSet rs=Db.stmt.executeQuery(sql);
		
		while (rs.next()) {
itemMap.put( rs.getString("id"),rs.getString("name"));
			
			
		}
		
		rs.close();
		return itemMap;
	
		
	}

}




