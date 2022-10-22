package dataAccess.hibernate;

import dataAccess.ICategoryDao;
import entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Category is added with Hibernate");
		
	}

}
