package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CategoryInfo;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class CategoryTest extends BaseTest{
	HomePage homepage;
	CategoryInfo category;
	@Test
public void categoryFileUpload() throws IOException
{
	LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  homepage=login.clickOnLoginButton();
	  category=homepage.clickMoreInfo();
	  String catgoryname=ExcelUtility.readStringData(0, 0,"categorytest");
	  category.newButtonClick().categoryNameGiven(catgoryname).discount().fileupload().submit();
//	  login.clickOnLoginButton();
//	  CategoryInfo categoryinfo=new CategoryInfo(driver);
//	  categoryinfo.clickMoreInfo();
//	  categoryinfo.newButtonClick();
	  
//	  categoryinfo.categoryNameGiven(catgoryname);
//	  categoryinfo.discount();
//	  categoryinfo.fileupload();
//	  categoryinfo.submit();
	  
}
}
