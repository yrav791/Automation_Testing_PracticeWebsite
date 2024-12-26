package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertHandleElement extends BasePage{

	JavascriptExecutor js;
	public AlertHandleElement(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="alertBtn") WebElement simpleAlert;
	@FindBy(id="confirmBtn") WebElement confirmationAlert;
	@FindBy(id="promptBtn") WebElement propmtAlert;
	
	public Alert handleSimpleAlert() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", simpleAlert);
	     Alert alt=driver.switchTo().alert();
	     return alt;
	}
	
	public Alert handleConfirmationAlert() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", confirmationAlert);
	     Alert alt=driver.switchTo().alert();
	     return alt;
	}
	
	public Alert handlepropmtAlert() {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", propmtAlert);
	     Alert alt=driver.switchTo().alert();
	     return alt;
	}
}
