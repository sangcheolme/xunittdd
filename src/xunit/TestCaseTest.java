package xunit;

import static xunit.Assert.*;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String name) {
		super(name);
	}

	public void testTemplateMethod() {
		WasRun wasRun = new WasRun("testMethod");
		wasRun.run();
		assertEquals("beforeEach testMethod", wasRun.log);
	}
}
