package net.myapp.services.impl;

import java.sql.SQLException;

import net.myapp.dao.GroupDAO;
import net.myapp.dao.StudentDAO;
import net.myapp.dao.TeacherDAO;
import net.myapp.model.Group;
import net.myapp.services.GroupService;

public class GroupServiceImpl implements GroupService {

	@Override
	public void addGroup(Group group) {
		
		
		
		GroupDAO myGroupDAO=new GroupDAO();
		StudentDAO mystudentDAO=new StudentDAO();

		TeacherDAO myteacherDAO=new TeacherDAO();
		if (group.getTeacher().getSubject().equals(group.getStudentList().get(0).getActivity()))
			try {
				myGroupDAO.addGroup(group);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
