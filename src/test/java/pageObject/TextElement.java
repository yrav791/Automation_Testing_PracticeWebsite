package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextElement extends BasePage {

	
	public TextElement(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="name") WebElement text_Name;
	@FindBy(id="email") WebElement text_Email;
	@FindBy(id="phone") WebElement text_Phone;
	@FindBy(id="textarea") WebElement text_Address;
	
	public void setName(String name) {
		text_Name.sendKeys(name);
	}
	public void setEmail(String email) {
		text_Email.sendKeys(email);
	}
	public void setPhone(String phone) {
		text_Phone.sendKeys(phone);
	}
	public void setAddress(String address) {
		text_Address.sendKeys(address);
	}
	
}
