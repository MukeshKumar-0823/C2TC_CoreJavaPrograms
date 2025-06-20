package day6;

public class demo {
	public static void main(String[] a) {
		Myclass o1 = new Myclass();
		System.out.println(o1);

		// static method with class name
		Myclass.display();

		Myclass o2 = new Myclass();
		System.out.println(o2);
		Myclass.display();
		Myclass o3 = new Myclass();
		System.out.println(o3);
		Myclass.display();
	}

}
