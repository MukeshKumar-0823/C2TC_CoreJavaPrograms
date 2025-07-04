package day8;

public class Person {
	private int id;
	private String name;
	private String city;
	public Person() {
		this.id=100;
		this.name="mukesh";
		this.city="chennai";
	}
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Person(int id,String name,String city) {
		this.id=id;
		this.city=city;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
