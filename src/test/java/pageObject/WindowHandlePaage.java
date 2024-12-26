package pageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowHandlePaage extends BasePage{

	public WindowHandlePaage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='New Tab']") WebElement btn_Newtab;
	@FindBy(id="PopUp") WebElement btn_popwindows;
	
	public void newWindowHandle() {
		btn_Newtab.click();
		Set<String> winId=driver.getWindowHandles();
		List<String > wid=new ArrayList<String>(winId);
		String pid=wid.get(0);
		String cid=wid.get(1);
		driver.switchTo().window(pid);
		driver.close();
	}
	
	public void popWindows() {
		btn_popwindows.click();
		Set<String> wid=driver.getWindowHandles();
		for(String id:wid) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Selenium")) {
				driver.findElement(By.xpath("//a[normalize-space()='Register now!']")).click();
			}else {
				driver.close();
			}
		}
	}
	
	
}
