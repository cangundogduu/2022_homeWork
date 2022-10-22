package business;


import coreLogging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

public class CourseManager implements ICourseManager{

	private Course[] courses;
	private ILogger[] loggers;
	private ICourseDao courseDao;
	




	public CourseManager(Course[] courses, ILogger[] loggers, ICourseDao courseDao) {
		super();
		this.courses = courses;
		this.loggers = loggers;
		this.courseDao = courseDao;
	}



	@Override
	public void add(Course course) throws Exception {
		if(course.getCoursePrice()<0) {
			throw new Exception("Course fee cannot be less than 0");
		}
		for (Course courseName : courses) {
			if(courseName.getCourseName().equals(course.getCourseName())) {
				throw new Exception("This course has already been added.");
		}
			for (ILogger logger : loggers) {
				logger.log();
			}
			courseDao.add(course);
		}
		
	}

}
