package dataAccess.hibernate;

import dataAccess.IInstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Instructor is added with Hibernate");
		
	}

}
