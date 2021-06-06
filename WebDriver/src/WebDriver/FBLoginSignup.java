package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBLoginSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		
		driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        WebElement CreateAccount = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
        CreateAccount.click();
        
        WebElement firstName = driver.findElement(By.xpath("//input[@name ='firstname']"));
        firstName.sendKeys("abc");
        
        WebElement lastName = driver.findElement(By.xpath("//input[@name ='firstname'] //following::input[1]"));
        lastName.sendKeys("xyz");
        
        //WebElement MobileNo = driver.findElement(By.xpath("//input[@name ='firstname'] //following::input[2]"));
        //MobileNo.sendKeys("91234567");
        
        
        
        WebElement password = driver.findElement(By.xpath("//input[@name ='reg_passwd__'] "));
        password.sendKeys("Password@123");
        
        //select DOB
        
        WebElement month = driver.findElement(By.xpath("//select[@id ='month' ] "));
        Select DOBmonth = new Select(month);
        
        DOBmonth.selectByVisibleText("Jun");
        
        WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day' ] "));
        Select DOBbirthday = new Select(birthday);

        DOBbirthday.selectByVisibleText("14");
        
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year' ] "));
        Select DOByear = new Select(year);
        DOByear.selectByValue("1980");
        
        WebElement Gender = driver.findElement(By.xpath("//input[@name='sex' ] "));
        Gender.click();
        
        WebElement SignUp= driver.findElement(By.xpath("//button[@name='websubmit' ] "));
        SignUp.click();
        
     
        
              
        
	}

}
