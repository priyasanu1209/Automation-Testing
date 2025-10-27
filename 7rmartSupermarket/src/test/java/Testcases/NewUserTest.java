package Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.createUserPage;

public class NewUserTest extends BaseTest{
	@Test
	@Parameters({"username","password"})
public void loginNewUser(String username,String Password)
{
	LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  login.clickOnLoginButton();
	createUserPage dp=new createUserPage(driver);
	dp.morebtn();
	dp.btnclick();
	dp.select();
	dp.createuser(username, Password);
	dp.save();
	boolean isAlertMessage=dp.isAlertDisplayed();
	  Assert.assertTrue(isAlertMessage,Constant.ALERTMESSAGE);
}
}
