package day5;

public class Tranier extends person{
	private String desgination;
	private String location;
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "Tranier [desgination=" + desgination + ", location=" + location + "]";
	}
	public void setLocation(String location) {
		this.location = location;
	}
	 public Tranier(){
		super();
		this.desgination="yengayo";
		this.location= "chennai";
	}
}
