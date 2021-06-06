package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		
		driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        Thread.sleep(3000);
        
        WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
                
        UserName.sendKeys("xyz@abc.com");
        
                   
		WebElement Passowrd = driver.findElement(By.xpath("//input[@id='pass']"));
		
		Passowrd.sendKeys("san123");
        
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		LoginButton.click();  
		
		        
        driver.close();

}

}
