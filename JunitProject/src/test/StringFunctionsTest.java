package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringFunctionsTest {
	
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		
		assertFalse(StringFunctions.isPalindrome("sangee"));
		
		
		}

}
