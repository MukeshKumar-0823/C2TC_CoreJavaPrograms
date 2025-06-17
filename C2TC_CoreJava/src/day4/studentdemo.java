package day4;

public class studentdemo {
	int age;
	studentdemo(){
	}
	studentdemo(int age){
		this.age=age;
	}
	studentdemo(String name){
		System.out.println("i am in default construcutor"+name);
	}
  private int id;
  private String name;
  private String course;
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getCourse() {
	return course;
  }
  public void setCourse(String course) {
	this.course = course;
  }
  
}
