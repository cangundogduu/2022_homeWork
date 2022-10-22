package business;

import java.util.List;

import coreLogging.ILogger;
import dataAccess.IInstructorDao;
import entities.Instructor;

public class InstructorManager implements IInstructorManager{

	private List<Instructor> instructors;
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	
	
	public InstructorManager(List<Instructor> instructor, IInstructorDao instructorDao,ILogger[] logger) {
		super();
		this.instructors = instructor;
		this.instructorDao = instructorDao;
		this.loggers= logger;
	}



	@Override
	public void add(Instructor instructor) throws Exception {
			for(ILogger logger:loggers) {
				logger.log();
			}
		instructorDao.add(instructor);
		instructors.add(instructor);
		
	}

		
}
