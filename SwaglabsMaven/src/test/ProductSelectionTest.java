package test;


import org.testng.annotations.Test;


import Pages.CartPage;
import Pages.Loginpage;
import Pages.ProductPage;

public class ProductSelectionTest extends Baseclass {
	
	@Test
	public void testcase1() {
		
		Loginpage objLogin = new Loginpage();
		ProductPage ObjProduct = new ProductPage();
		CartPage objCart = new CartPage();
		
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		String product = sheet.getRow(1).getCell(2).getStringCellValue();
		
		objLogin.Login(uname,  pass);
		ObjProduct.SelectProduct(product);
		ObjProduct.GotoCart();
		objCart.verifyProduct(product);
		
		
		
	}
	

}
