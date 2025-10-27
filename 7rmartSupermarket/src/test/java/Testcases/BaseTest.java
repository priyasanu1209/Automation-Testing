package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod()
	  {
			  driver = new ChromeDriver();
			  driver.get("https://groceryapp.uniqassosiates.com/admin/login");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//waits for all elements
			  
			  
	  }
	  @AfterMethod
	  public void afterMethod() {
		  //driver.quit();
		  
	  }
}
