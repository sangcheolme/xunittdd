package xunit;

public class TestCaseTest extends TestCase {
	public TestCaseTest(String name) {
		super(name);
	}

	public void testRunning() {
		WasRun wasRun = new WasRun("testMethod");

		wasRun.run();
		assert wasRun.wasRun;
	}
}
