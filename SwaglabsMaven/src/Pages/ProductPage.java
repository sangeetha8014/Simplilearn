package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class ProductPage {
	
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addCart;
	
	@FindBy(xpath= "//a[@class='shopping_cart_link']")
	WebElement goToCart;

	
	
	public ProductPage() {
		
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		
		PageFactory.initElements(driver,  this);
	}
	
	public void SelectProduct(String Product) {
		
		//*[text()='Sauce Labs Bike Light']//following::button[1]
				
		WebElement btnProductSelect = driver.findElement(By.xpath("//*[text()='" + Product + "']//following::button[1]"));
		btnProductSelect.click();
	
	}
	
	public void GotoCart() {
		
		goToCart.click();
		
		
	}
	
}
