package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsCreate {
	public WebDriver driver;

	public NewsCreate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@class='small-box-footer'])[7]") WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbtn;
	@FindBy(xpath="//textarea[@id='news']") WebElement textarea;
	@FindBy(xpath="//button[@name='create']") WebElement submit;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertsuccess;
	public void morebutton()
	{
		moreinfo.click();
	}
	public void btnclick()
	{
		newbtn.click();
	}
	public void createNews(String input)
	{
		
		
		textarea.sendKeys(input);
		
		}
	public void save()
	{
		submit.click();
	}
	public boolean isAlertDisplayed()
	{
		return alertsuccess.isDisplayed();
		
	}
}
