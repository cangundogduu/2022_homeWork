import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.ICategoryManager;
import business.ICourseManager;
import coreLogging.DatabaseLogger;
import coreLogging.EmailLogger;
import coreLogging.FileLogger;
import coreLogging.ILogger;
import dataAccess.ICategoryDao;
import dataAccess.ICourseDao;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.jdbc.JdbcCategoryDao;
import dataAccess.jdbc.JdbcCourseDao;
import entities.Category;
import entities.Course;

public class Main {

	public static void main(String[] args) {
		
		

		ILogger[] loggers = {new DatabaseLogger(),new EmailLogger(),new FileLogger()};
		ICourseDao courseDao= new JdbcCourseDao(); 
		
		Course course1 = new Course(1,"Java Programming",100);
		Course course2= new Course(2, ".Net Programming", 110);
		Course course3= new Course(3,"Javascprit Programming",50);
		Course[] courses= new Course[]{course3,course2,course1};
		
		ICourseManager courseManager= new CourseManager(courses, loggers,courseDao );
		courseManager.add(course2);
		
		
		ICategoryDao categoryDao= new HibernateCategoryDao();
		
		Category category1= new Category(1,"Programming");
		Category category2= new Category(2,"Programming");
		Category[] categories= new Category[] {category1,category2};
		
		ICategoryManager categoryManager= new CategoryManager(categories,loggers,categoryDao);
		categoryManager.add(categories);
	}

}
