package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.createUserPage;
import utilities.FakerUtility;

public class NewUserTest extends BaseTest{
	HomePage homepage;
	createUserPage usercreate;
	@Test
	//@Parameters({"username","password"})
public void loginNewUser()
{
	LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  homepage=login.clickOnLoginButton();
	  usercreate=homepage.morebtn();
	  String Username1=FakerUtility.getFirstName();
	  String Password2=FakerUtility.getPassword();
	  
	  usercreate.btnclick().createuser(Username1, Password2).select().save();
//	  login.clickOnLoginButton();
//	createUserPage dp=new createUserPage(driver);
//	dp.morebtn();
//	dp.btnclick();
//	dp.select();
//	dp.createuser(username, Password);
//	dp.save();
	boolean isAlertMessage=usercreate.isAlertDisplayed();
	  Assert.assertTrue(isAlertMessage,Constant.ALERTMESSAGE);
}
}
