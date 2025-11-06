package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUpload;
import utilities.WaitUtility;

public class CategoryInfo {
	public WebDriver driver;
	FileUpload fileupload=new FileUpload();
	WaitUtility waitutility=new WaitUtility();

	public  CategoryInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@class='small-box-footer'])[9]") WebElement moreinfo;	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbtn;
	@FindBy(xpath="//input[@id='category']") WebElement categoryname;
	@FindBy(xpath="//input[@id='main_img']") WebElement uploadbutton;
	@FindBy(xpath="(//span[text()='discount'])[1]") WebElement dicount;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement submitbutton;
	
	public CategoryInfo newButtonClick()
	{
		newbtn.click();
		return this;
	}
	public CategoryInfo categoryNameGiven(String input)
	{
		categoryname.sendKeys(input);
		return this;
	}
	public CategoryInfo discount()
	{
		dicount.click();
		return this;
	}
	public CategoryInfo fileupload()
	{
		fileupload.sendKeyforFileUpload(uploadbutton, Constant.IMAGEPATH);
		return this;
	}
	public CategoryInfo submit()
	{
		waitutility.waitForElementToClick(driver, submitbutton);
	    try {
	        submitbutton.click();
	    } catch (org.openqa.selenium.ElementClickInterceptedException e) {
	        ((org.openqa.selenium.JavascriptExecutor) driver)
	                .executeScript("arguments[0].scrollIntoView(true);", submitbutton);
	        ((org.openqa.selenium.JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", submitbutton);
	    }
		return this;
	}
	
}
