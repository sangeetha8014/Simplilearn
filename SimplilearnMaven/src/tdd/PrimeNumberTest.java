package tdd;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class PrimeNumberTest {


	@Test
	public void PositiveTest() {
		
		Assert.assertTrue(PrimeNumberCheck.isPrime(13));

	}

		
	@Test
	public void NegativeTest() {
		
		Assert.assertFalse(PrimeNumberCheck.isPrime(10));
		
	}
}
	
