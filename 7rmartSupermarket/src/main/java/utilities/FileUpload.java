package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUpload {
	
		//method 1 with send keys--if this doesn't work use robot class method
		public void sendKeyforFileUpload(WebElement element, String path)
		{	
			element.sendKeys(path);
			
		}
	
		public void robotClass(WebElement element, String path) throws AWTException
		{
			StringSelection stringselection=new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);//getDefaultToolkit,getSystemClipboard to copy the content into clipboard and in setcontents we provide the path to be copied
			Robot robot=new Robot();//created a object for robot class 
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);//pressing the control key
			robot.keyPress(KeyEvent.VK_V);//pressing the V key to paste
			robot.keyRelease(KeyEvent.VK_CONTROL);//pressing to release the control key
			robot.keyRelease(KeyEvent.VK_V);//pressing to release the V key to paste
			robot.keyPress(KeyEvent.VK_ENTER);//pressing the enter key
			robot.keyRelease(KeyEvent.VK_ENTER);//releasing the enter key
		}

}
