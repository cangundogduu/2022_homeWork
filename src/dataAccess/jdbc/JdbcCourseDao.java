package dataAccess.jdbc;

import dataAccess.ICourseDao;
import entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		
		System.out.println("Course is added with Jdbc");
		
	}

}
