package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        Thread.sleep(3000);
        
        WebElement CusID = driver.findElement(By.xpath("//*[@name='cusid']"));
        
        CusID.sendKeys("1234");
        
        WebElement Submit = driver.findElement(By.xpath("//*[@name='submit']"));
        
        Submit.click();
        
        Alert alertObj = driver.switchTo().alert();
        
               
       alertObj.accept();
       alertObj.accept();
       
      // alertObj.dismiss();
       
      // driver.switchTo().defaultContent();
       
       

	}

}
