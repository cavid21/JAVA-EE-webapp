package net.myapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import net.myapp.model.Email;
import net.myapp.model.Student;
import net.myapp.model.Teacher;


public class EmailDAO {
	String sql;
	public  List<Email> getEmailList() throws SQLException
	{
		List<Email> itemList=new ArrayList<Email>();
		Email item;
        sql="Select * from email ";
         
		ResultSet rs=Db.stmt.executeQuery(sql);
		
		while (rs.next()) {
			item=new Email();

			item.setEmail(rs.getString("email"));
		
			
			
			itemList.add(item);
		}
		return itemList;
		


	}
	public boolean  checkEmail(String email) throws SQLException{
		
		String sql;
	
		
		sql="Select * from student where email='"+email+"'";
		System.out.println(sql);
		
		ResultSet rs=Db.stmt.executeQuery(sql);
		
		
				
		
		return rs.next();
		
	}
	
	
	
	}




