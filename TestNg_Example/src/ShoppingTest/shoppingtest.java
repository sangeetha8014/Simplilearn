package ShoppingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class shoppingtest {
	
	WebDriver driver;
	
	ExtentReports report;
	ExtentTest test;
	
	SoftAssert soft = new SoftAssert();
	
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		report = new ExtentReports("ExtentReport.html");
	}
	
	@Test

	public void Login() {
		
		
		test = report.startTest("Login Test Case");
		
		WebElement UserName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		
		UserName.sendKeys("standard_user");
		
		test.log(LogStatus.PASS, "Successfully entered the user name");
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		Password.sendKeys("secret_sauce");
		
		test.log(LogStatus.PASS, "Successfully entered the password");
		
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        Login.click();
        
        test.log(LogStatus.PASS, "Successfully clicked Login button");
        
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
        addToCart.click();
        
        test.log(LogStatus.PASS, "Successfully clicked addToCart button");
        
		WebElement shoppingcartbadge = driver.findElement(By.className("shopping_cart_badge"));
		Assert.assertTrue(shoppingcartbadge.isDisplayed());
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		
		report.endTest(test);
		report.flush();
		
		driver.quit();
		
		soft.assertAll();
	}

}

