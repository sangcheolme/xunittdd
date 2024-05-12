package xunit;

public class XUnitTest {

	public static void main(String[] args) {
		WasRun wasRun = new WasRun("testMethod");
		System.out.println(wasRun.wasRun); // 실행 전에는 false
		wasRun.run();
		System.out.println(wasRun.wasRun); // 실행 후에는 true
	}
}
