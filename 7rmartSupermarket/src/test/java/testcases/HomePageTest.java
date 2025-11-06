package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends BaseTest{
	HomePage homepagetest;
	
	@Test(retryAnalyzer=retry.Retry.class,description="Verified failed scenario")
public void verifyLogout() throws InterruptedException
{
	LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("admin", "admin1");
	  homepagetest=login.clickOnLoginButton();
	  homepagetest.clickonuser().clickonogout();
	  
//	  login.clickOnLoginButton();
//	  
//	  HomePage home=new HomePage(driver);
//	  home.clickonuser();
//	  home.clickonogout();
	  String expected="Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual, expected,Constant.ERRORMESSAGEFORLOGOUT);
}
	@Test
	public void verifythroughexcel() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		String username=ExcelUtility.readStringData(3, 0,"loginPageTest");
		String password=ExcelUtility.readStringData(3, 1,"loginPageTest");
		 login.enterUsernameAndPassword(username,password);
		  login.clickOnLoginButton();
	}
}
