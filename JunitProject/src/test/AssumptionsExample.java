package test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionsExample {
	
	@BeforeAll
	public static void setup() {
		
		System.setProperty("ENV", "DEV");
		
		
	}
	
	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(StringFunctions.isPalindrome("madam"));
	
	}
	
	
	@Test
	public void test2() {
		
		assumeFalse("PROD".equals(System.getProperty("ENV")));
		assertFalse(StringFunctions.isPalindrome("sangee"));
	}

}
