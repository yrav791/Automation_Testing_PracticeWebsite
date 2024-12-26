package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DynamicElement extends BasePage{

	public DynamicElement(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//button[@onclick='toggleButton(this)']") WebElement dynamicButton;
	
	
	public void clickStart(){
		dynamicButton.click();
	}
	
	public void clickStop(){
		dynamicButton.click();
	}
}
