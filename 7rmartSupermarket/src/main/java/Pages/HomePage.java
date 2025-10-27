package Pages;

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
	
	 public void clickonuser()
	 {
		 logoutlink.click();
		
	 }
	 public void clickonogout() throws InterruptedException
	 {
		 
		 logout.click();
	 }
	 public void dashboardpage()
	 {
		 dashboardlnk.click();	 }
	
}
