package xunit;

import static xunit.Assert.*;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String name) {
		super(name);
	}

	WasRun wasRun;

	@Override
	public void beforeEach() {
		wasRun = new WasRun("testMethod");
	}

	public void testRunning() {
		assertEquals(false, wasRun.wasRun); // 실행 전에는 false
		wasRun.run();
		assertEquals(true, wasRun.wasRun); // 실행 후에는 true
	}

	public void testBeforeEach() {
		assertEquals(false, wasRun.wasBeforeEach); // 실행 전에는 false
		wasRun.run();
		assertEquals(true, wasRun.wasBeforeEach); // 실행 후에는 true
	}
}
