package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.LoginPage;
import Utilities.ExcelUtility;

public class LoginPageTest extends BaseTest{
	@Test
	 @Parameters({"username","password"})
	public void verifyValidCredentials(String username,String password) 
	  {
		  LoginPage login = new LoginPage(driver);
		  login.enterUsernameAndPassword(username, password);
		  login.clickOnLoginButton();
		  boolean isHomePage=login.isHomepageIsDisplayed();
		  Assert.assertTrue(isHomePage,Constant.ERRORMESSAGEFORLOGIN);
	  }
	@Test
	public void validUsernamePassword()
	{
		LoginPage login = new LoginPage(driver);
		  login.enterUsernameAndPassword("admin", "admin");
		  login.clickOnLoginButton();
	}
	@Test
	public void incorretUsernamePassword() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		String username=ExcelUtility.readStringData(1, 0,"loginPageTest");
		String password=ExcelUtility.readStringData(1, 1,"loginPageTest");
		  login.enterUsernameAndPassword(username,password);
		  login.clickOnLoginButton();
	}
	@Test(dataProvider ="credentials" )
	  public void verifyCredentialsWithCorrectUsername(String username,String password) 
	  {
		  LoginPage login = new LoginPage(driver);
		  login.enterUsernameAndPassword(username, password);
		  login.clickOnLoginButton();
	  }
	  @DataProvider(name="credentials")
	  public Object testdata()
	  {
		  Object data[][]= {{"admin","admin"},{"admin123","admin123"}};
		  return data;
	  }

}
//we use hard assertions commonly

