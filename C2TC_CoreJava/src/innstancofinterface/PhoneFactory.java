package innstancofinterface;

public class PhoneFactory {

	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsumg();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
	}
}
