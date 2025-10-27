package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class createUserPage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
WaitUtility waitutility=new WaitUtility();
	public  createUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='small-box-footer'][1]") WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbtn;
	@FindBy(xpath="//input[@id='username']") WebElement uname;
	@FindBy(xpath="//input[@id='password']") WebElement pwd;
	@FindBy(xpath="//select[@id='user_type']") WebElement slct;
	@FindBy(xpath="//button[@name='Create']") WebElement submit;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertsuccess;
	
	public void morebtn()
	{
		moreinfo.click();
	}
	public void btnclick()
	{
		newbtn.click();
	}
	public void select()
	{
		pageutility.selectByText(slct, "Admin");
		//Select select=new Select(slct);
		//select.selectByContainsVisibleText("Admin");
	}
	
	public void createuser(String username,String password)
	{
		
		
		uname.sendKeys(username);
		pwd.sendKeys(password);
		
		
	}
	public void save()
	{
		waitutility.waitForElementToClick(driver, submit);
		submit.click();	
	}
	public boolean isAlertDisplayed()
	{
		return alertsuccess.isDisplayed();
		
	}
}
