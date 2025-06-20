package day6;

public class finalkeyword {

	int x = 100;

	// Declare a static blank final variable.
	static int Y;

	// Declare & intialize static final variable.
	static int Z = 10;

	// instatnce method
	void change() {
		x = 30; // final variables can't be reassigned
		Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		Z = 100; // Once intialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}

}
