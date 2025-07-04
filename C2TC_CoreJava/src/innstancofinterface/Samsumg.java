package innstancofinterface;

public class Samsumg  implements Phone{


	@Override
	public void call() {
		System.out.println("Calling using Samsung");
	}

	@Override
	public void message() {
		System.out.println("Messaging using Samsung");

	}

}
