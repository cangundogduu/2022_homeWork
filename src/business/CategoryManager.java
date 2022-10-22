package business;


import coreLogging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;


public class CategoryManager implements ICategoryManager{

	private Category[] categories;
	private ILogger[] loggers;
	private ICategoryDao categoryDao;
	
	public CategoryManager(Category[] categories, ILogger[] loggers, ICategoryDao categoryDao) {
		super();
		this.categories = categories;
		this.loggers = loggers;
		this.categoryDao = categoryDao;
	}

	@Override
	public void add(Category category) throws Exception {
		for (Category categoryName : categories) {
			if(categoryName.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("This category has already been added.");}
		}
		for(ILogger logger : loggers) {
			logger.log();
		}
		categoryDao.add(category);
		
		
	}

}
