package net.myapp.dao;


import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import net.myapp.model.Group;


public class GroupDAO {
	String sql;

	

	public static  int addGroup(Group myGroup) throws SQLException
	{
		String sql="INSERT INTO group "
				+ " (teacher_id,status) "
				+ " values (?,?)";		
		


		PreparedStatement preparedStatement = (PreparedStatement) Db.getConnection().prepareStatement(sql);
		preparedStatement.setInt(1, myGroup.getTeacher().getId());
		preparedStatement.setString(2, "1");
		
		

		// execute insert SQL stetement
		preparedStatement .executeUpdate();
		
		preparedStatement.executeUpdate(sql);
		
		preparedStatement.close();
		return 0;
		}


}




