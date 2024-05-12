package xunit;

import java.lang.reflect.Method;

/**
 * 생성자에 이름을 넣고 run을 하면 그 이름의 메서드를 실행하는 TestCase 클래스
 */
public class TestCase implements Test {

	protected final String name;

	public TestCase(String name) {
		this.name = name;
	}

	public void run(TestResult result) {
		result.testStarted();

		beforeEach();

		try {
			Method method = getClass().getMethod(name); // 메서드 이름으로 메서드 객체를 얻는다.
			method.invoke(this); // 메서드 객체를 실행한다.
		} catch (Exception e) {
			result.testFailed();
		}

		afterEach();
	}

	public void beforeEach() {
	}

	public void afterEach() {
	}
}
