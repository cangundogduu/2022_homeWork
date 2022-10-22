package dataAccess.jdbc;

import dataAccess.IInstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Instructor is added with Jdbc");
	}

}
