package xunit;

public class XUnitTest {

	public static void main(String[] args) {
		// 테스트 메서드가 실행 되었는 지 체크하는 메서드
		WasRun wasRun = new WasRun("testMethod");
		System.out.println(wasRun.wasRun); // 실행 전에는 false
		wasRun.testMethod();
		System.out.println(wasRun.wasRun); // 실행 후에는 true
	}
}
