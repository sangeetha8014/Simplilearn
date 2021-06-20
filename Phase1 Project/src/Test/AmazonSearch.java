package Test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.CallableStatement;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Category;
		String SearchVal;

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Amazon");
			
			WebElement AllCategoryDropdown = driver.findElement(By.xpath("//select[@title = 'Search in']"));
			Select category = new Select(AllCategoryDropdown);
			
			WebElement searchField = driver.findElement(By.xpath("//input[@name = 'field-keywords']"));
					
					

			while (rs.next()) {
				
				System.out.println(rs.getString(2) + "  " + rs.getString(3));
				
				Category = rs.getString(2);
				
				SearchVal = rs.getString(3);
				
				String cat = rs.getString(2);
				category.selectByVisibleText(cat);
				
				String searchValue = rs.getString(3);
				searchField.sendKeys(searchValue);
				WebElement submitValue = driver.findElement(By.xpath("//input[@type = 'submit']"));

				submitValue.click();
				
				List <WebElement> results = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));

				System.out.println("Total No of Mobiles are : " + results.size());
				
				for(WebElement e : results) {
					System.out.println(e.getText());
				}
				
				
		        
		        TakesScreenshot TsObj = (TakesScreenshot)driver;
		        
		        File myFile = TsObj.getScreenshotAs(OutputType.FILE);
		        
		        try {
		        
		        FileUtils.copyFile(myFile, new File("test.png"));
		      
		        }catch (IOException e) {
		        	// TODO Auto-generated catch block
		        	e.printStackTrace();
		        			        	
		        }
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found");
		} catch (SQLException e) {
			System.out.println("SQL Exception");
		}
		
		driver.close();
	}
	
	}
