package Testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.LoginPage;
import Pages.NewsCreate;

public class NewscreateTest extends BaseTest {
	@Test(dataProvider ="credentials" )
	public void newscreation(String input)
	{
		LoginPage login = new LoginPage(driver);
		  login.enterUsernameAndPassword("admin", "admin");
		  login.clickOnLoginButton();
		  NewsCreate nc=new NewsCreate(driver);
		  nc.morebutton();
		  nc.btnclick();
		  nc.createNews(input);
		  nc.save();
		  boolean isAlertMessage=nc.isAlertDisplayed();
		  Assert.assertTrue(isAlertMessage,Constant.ALERTMESSAGENEWS);
		  
	}
	@DataProvider(name="credentials")
	  public Object testdata()
	  {
		  Object data[][]= {{"Today's News"},{"Latest News"}};
		  return data;
	  }

}
