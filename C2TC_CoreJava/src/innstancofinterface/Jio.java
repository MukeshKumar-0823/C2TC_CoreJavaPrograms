package innstancofinterface;

public class Jio implements Phone {
	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void message() {
		System.out.println("Messaging using Jio");

	}

}
