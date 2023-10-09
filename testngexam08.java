package testngexam;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngexam08 {
	
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("i am before method");
		}
		

		@BeforeMethod
		public void afterMethod() {
			System.out.println("i am after method");
		}
		@Test
		public void testCase1() {
			System.out.println("test case pass");
		}

}
