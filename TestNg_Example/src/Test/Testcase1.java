package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeGroups("Sanity")
    public void BeforeGroupMethod() {
        System.out.println("Before Groups");
    } 
	
	@BeforeTest
	public void BeforeTestMethod() {
		
		System.out.println("Inside Before Test");
	}

	
	
	@BeforeMethod
	public void Setup() {
		
		System.out.println("Inside Before Method");
	}

	
	@Test(groups= {"Sanity"})
	public void LoginTest() {
		
		System.out.println("Inside Login Test");
	}
	
	@Test(groups= {"Regresson"})
	public void SignUpTest() {
		
		System.out.println("Inside SignUp Test");
	}
	
	
	@Test
	public void RandomName() {
		
		System.out.println("Inside RandomName");
	}
	
	
	@AfterMethod
	public void AfterMeth() {
		
		System.out.println("Inside After Method");
		
	}
				
		@AfterTest
		public void AfterTestMethod() {
			
			System.out.println("Inside After Test");
		}
		
	
}
