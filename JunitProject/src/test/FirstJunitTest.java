package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunitTest {
	
	@BeforeAll
	public static void beforeAllMethod() {
		
		System.out.println("Inside beforeAll");
	}
	
	
	@BeforeEach
	public void beforeEachMethod() {
		
		System.out.println("Inside before of each TC");
	}
	
	@Test
	public void testcase1() {
		
        boolean flag = false;
        
        Assertions.assertTrue(flag);
	}
	
	@AfterEach
	public void afterEachMethod() {
		
		System.out.println("Inside after each TC");
	}
	
	@AfterAll
	public static void afterAllMethod() {
		
		System.out.println("Inside AfterALl");
	}

}