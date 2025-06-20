package day7;

public class SBI extends RBI {
	@Override//annotation for overriding the method
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}

