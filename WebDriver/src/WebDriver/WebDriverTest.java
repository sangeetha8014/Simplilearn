package WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
        
       // driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
       
       Thread.sleep(3000);
       
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        
        LoginLink.click();
        
                
        WebElement UserName = driver.findElement(By.name("user_login"));
        
        WebDriverWait wait = new WebDriverWait(driver,30);
        
        wait.until(ExpectedConditions.elementToBeClickable(UserName));
        
        UserName.sendKeys("xyz@abc.com");
                
        WebElement Password = driver.findElement(By.name("user_pwd"));
        
        Password.sendKeys("San123");
        
        WebElement Rememberme = driver.findElement(By.className("rememberMe"));
        
        Rememberme.click();
        
        WebElement Login = driver.findElement(By.name("btn_login"));
        
        Login.click();
        
        WebElement Error = driver.findElement(By.id("msg_box"));

        String ActMsg = Error.getText();
        
        String ClassName = Error.getAttribute("class");
        String TagName = Error.getTagName();
        
        System.out.println("Class Name is " + ClassName);
        System.out.println("Tag Name is " + TagName);
        
        String ExpMsg = "The email or password you have entered is invalid.";
        
        if(ActMsg.contentEquals(ExpMsg)) {
        	System.out.println("Test Passed");
        }else {
        	System.out.println("Test Failed");
        	
        }
        	
         List<WebElement> InPutTag = driver.findElements(By.tagName("input"));
         
         System.out.println("Total Input Tags are " + InPutTag.size());
         
         List<WebElement> HyperLink = driver.findElements(By.tagName("button"));
         
         System.out.println("Total HyperLink Tags are " + HyperLink.size());
         
         for(int index=0;index<HyperLink.size();index++){
        	 
        	 System.out.println("Hyperlink Text" + HyperLink.get(index).getText());
         }
        	    	       	
         
        
        driver.close();
        
        
	}

	private static String getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
