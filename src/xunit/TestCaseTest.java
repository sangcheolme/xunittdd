package xunit;

import static xunit.Assert.*;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String name) {
		super(name);
	}

	public void testTemplateMethod() {
		WasRun wasRun = new WasRun("testMethod");
		TestResult result = new TestResult();
		wasRun.run(result);
		assertEquals("beforeEach testMethod afterEach", wasRun.log);
	}


	public void testResult() {
		WasRun wasRun = new WasRun("testMethod");
		TestResult result = new TestResult();
		wasRun.run(result);
		assertEquals("1 run, 0 failed", result.getSummary());
	}

	public void testFailedResultFormating() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();

		assertEquals("1 run, 1 failed", result.getSummary());
	}

	public void testFailedResult() {
		WasRun wasRun = new WasRun("testBrokenMethod");
		TestResult result = new TestResult();
		wasRun.run(result);
		assertEquals("1 run, 1 failed", result.getSummary());
	}

	public void testSuite() {
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		TestResult result = new TestResult();

		suite.run(result);
		assertEquals("2 run, 1 failed", result.getSummary());
	}
}
