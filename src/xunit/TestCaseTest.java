package xunit;

import static xunit.Assert.*;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String name) {
		super(name);
	}

	public void testRunning() {
		WasRun wasRun = new WasRun("testMethod");
		assertEquals(false, wasRun.wasRun); // 실행 전에는 false
		wasRun.run();
		assertEquals(true, wasRun.wasRun); // 실행 후에는 true
	}
}
