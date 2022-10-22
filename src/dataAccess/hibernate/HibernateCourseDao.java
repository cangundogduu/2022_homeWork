package dataAccess.hibernate;

import dataAccess.ICourseDao;
import entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println(" Course is added with Hibernate");
		
	}

}
