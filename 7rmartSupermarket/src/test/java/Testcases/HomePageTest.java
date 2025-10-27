package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends BaseTest{
	@Test
public void verifyLogout() throws InterruptedException
{
	LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  login.clickOnLoginButton();
	  
	  HomePage home=new HomePage(driver);
	  home.clickonuser();
	  home.clickonogout();
	  String expected="Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual, expected,Constant.ERRORMESSAGEFORLOGOUT);
}
}
