package testngexam;

import org.testng.annotations.Test;


public class testngexam3 {
	

	@Test(groups = {"smoke"})
	public void testCase1() {
		System.out.println("smoke test 1");
	}

	@Test(groups = {"regression"})
	public void testCase2() {
		System.out.println("regression test 2");
	}

	@Test(groups = {"smoke"})
	public void testCase3() {
		System.out.println("smoke test 3");
	}

}
