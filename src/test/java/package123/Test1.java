package package123;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeMethod
	public void method1() {
		System.out.println("from before method");
	}
	
	@Test
	public void method2() {
		System.out.println("from test ");
	}

	
	@Test
	public void method3() {
		System.out.println("from test ");
	}
	
	@Test
	public void method4() {
		System.out.println("from test1");
	}
	
	//modified test class
	
}
