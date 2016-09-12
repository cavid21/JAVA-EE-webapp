package net.myapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import net.myapp.model.Student;
import net.myapp.model.Teacher;


public class TeacherDAO {
	String sql;
	public  List<Teacher> getTeachersList() throws SQLException
	{
		/*List<Teacher> itemList=new ArrayList<Teacher>();
		Teacher item;
        sql="Select * from teacher ";
         
		ResultSet rs=Db.stmt.executeQuery(sql);
		
		while (rs.next()) {
			item=new Teacher();
			
			item.setId(rs.getInt("id"));
			item.setName(rs.getString("name"));
			item.setSurname(rs.getString("surname"));
			item.setFirstname(rs.getString("firstname"));
			item.setActivity(rs.getString("subject"));
			item.setAbout(rs.getString("about"));
			item.setEmail(rs.getString("email"));
			item.setPhone(rs.getString("phone"));
			item.setBirthday(rs.getString("birthday"));
		
			
			
			itemList.add(item);
		}
		
		rs.close();
		*/
		return getTeachersList("Select * from teacher ");
	
	}
	public  List<Teacher> getTeachersListBySubjectID(String id) throws SQLException
	{
		return getTeachersList("Select * from teacher where subject_id='"+id+"'");
	
	}
	
	public  List<Teacher> getTeachersList(String s) throws SQLException
	{
		List<Teacher> itemList=new ArrayList<Teacher>();
		Teacher item;
        sql=s;
         
		ResultSet rs=Db.stmt.executeQuery(sql);
		
		while (rs.next()) {
			item=new Teacher();
			
			item.setId(rs.getInt("id"));
			item.setName(rs.getString("name"));
			item.setSurname(rs.getString("surname"));
			item.setFirstname(rs.getString("firstname"));
			item.setActivity(rs.getString("subject"));
			item.setAbout(rs.getString("about"));
			item.setEmail(rs.getString("email"));
			item.setPhone(rs.getString("phone"));
			item.setBirthday(rs.getString("birthday"));
		
			
			
			itemList.add(item);
		}
		
		rs.close();
		return itemList;
	
	}
	
	public  int addTeacher(Teacher myTeacher) throws SQLException
	{
		String sql="INSERT INTO teacher "
				+ " (name,surname,firstname,subject,about,email,phone,birthday) "
				+ " values (?,?,?,?,?,?,?,?)";		
		


		PreparedStatement preparedStatement = (PreparedStatement) Db.getConnection().prepareStatement(sql);
		preparedStatement.setString(1, myTeacher.getName());
		preparedStatement.setString(2, myTeacher.getSurname());
		preparedStatement.setString(3, myTeacher.getFirstname());
		preparedStatement.setString(4, myTeacher.getSubject());
		preparedStatement.setString(5, myTeacher.getAbout());
		preparedStatement.setString(6, myTeacher.getEmail());
		preparedStatement.setString(7, myTeacher.getPhone());
		preparedStatement.setString(8, myTeacher.getBirthday());
		
		

		// execute insert SQL stetement
		preparedStatement .executeUpdate();
		
		preparedStatement.executeUpdate(sql);
		
		preparedStatement.close();
		return 0;
		}


}




