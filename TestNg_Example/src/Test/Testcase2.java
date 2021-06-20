package Test;

import org.testng.annotations.Test;

public class Testcase2 {
	
	@Test(priority=0, description = "Verify that Homepage fundtionality is working fine", groups= {"Regression"})
	public void HomepageTest() {
		
		System.out.println("Inside Homepage Test");
	}	
	

	@Test(priority=1)
	public void HomepageTest1() {
		
		System.out.println("Inside Homepage Test1");
	}

	
	@Test(priority=2)
	public void HomepageTest2() {
		
		System.out.println("Inside Homepage Test2");
	}

}
