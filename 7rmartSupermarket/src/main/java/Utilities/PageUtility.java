package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
public void selectByText(WebElement element,String text)
{
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
public void selectByValue(WebElement element,String value)
{
	Select select=new Select(element);
	select.selectByValue(value);
}
public void selectByIndex(WebElement element,int index)
{
	Select select=new Select(element);
	select.selectByIndex(index);
}
public void draganddrop(WebElement source,WebElement destination)
{
	
}

}
