package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollingDropDown extends BasePage{

	public ScrollingDropDown(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id=("comboBox")) WebElement clickDropDownBox;
	@FindBy(xpath=("//div[@class='option']")) List<WebElement> dropDownElement;
	
	
	public void clickDropDownComboBox() {
		clickDropDownBox.click();
	}
	
	public void getDropDownElement(String option) {

		for(WebElement Element:dropDownElement) {
			if(Element.getText().equals(option)) {
				Element.click();
			}
	}
	
	}
}
