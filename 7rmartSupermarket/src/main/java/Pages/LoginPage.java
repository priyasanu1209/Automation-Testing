package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;

	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;

	@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	

	public void enterUsernameAndPassword(String usernameField, String passwordField)
	{
		username.sendKeys(usernameField);
		password.sendKeys(passwordField);
	}

	public void clickOnLoginButton()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}
	public boolean isHomepageIsDisplayed()
	{
		return dashboard.isDisplayed();
		
	}

}
