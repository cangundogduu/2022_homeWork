package entities;

public class Course {

	

	public Course(int id, String courseName, int coursePrice) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	private int id;
	private String courseName;
	private int coursePrice;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

}
