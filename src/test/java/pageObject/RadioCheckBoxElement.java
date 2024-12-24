package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class RadioCheckBoxElement extends BasePage{

	public RadioCheckBoxElement(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="male") WebElement clk_male;
	@FindBy(id="female") WebElement clk_female;
	@FindBy(xpath="//div[@class='form-check form-check-inline']//input[@type='checkbox']")
	List<WebElement> clk_checkbox;
	
	public void clickMaleRadioButton() {
		clk_male.click();
	}
	
	public void clickFemaleRadioButton() {
		clk_female.click();
	}
	
	public void clickCheckBoxes() {
		for(int i=0;i<clk_checkbox.size();i++) {
			clk_checkbox.get(i).click();
		}
	}
}
