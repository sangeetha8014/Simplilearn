package packageA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassATest {
	
	
	@Tag("Sanity")
	@DisplayName("First Junitin Class A")
	@Test
	public void Test1() {
		
		System.out.println("Inside Test1");
		
	}

}
