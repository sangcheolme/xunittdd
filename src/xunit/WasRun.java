package xunit;

public class WasRun {

	public boolean wasRun;

	public WasRun(String testMethod) {
	}

	public void testMethod() {
		wasRun = true;
	}
}
