package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public  HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@class='nav-link'])[2]") WebElement logoutlink;
	@FindBy(xpath="(//a[@class='dropdown-item'])[2]") WebElement logout;
	@FindBy(xpath="(//a[@class='dropdown-item'])[2]") WebElement dashboardlnk;
	@FindBy(xpath="//a[@class='small-box-footer'][1]") WebElement moreinfo;
	
	 public HomePage clickonuser()
	 {
		 logoutlink.click();
		 return this;
		
	 }
	 public HomePage clickonogout()
	 {
		 
		 logout.click();
		 return this;
	 }
	 public void dashboardpage()
	 {
		 dashboardlnk.click();	 }

		public createUserPage morebtn()
		{
			moreinfo.click();
			return new createUserPage(driver);
		}
		public CategoryInfo clickMoreInfo()
		{
			moreinfo.click();
			return new CategoryInfo(driver);
		}
	
}
