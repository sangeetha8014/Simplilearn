package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(ParameterProvideExample.class)

public class ChromeDriverParameterEx {
	
	@Test
	public void  LoginTest(ChromeDriver driver) {
		
		driver.get("https://www.simplilearn.com/");
	}

}
