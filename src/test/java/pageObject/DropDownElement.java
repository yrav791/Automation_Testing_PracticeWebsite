package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownElement extends BasePage{

	public DropDownElement(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="country") WebElement countryName;
	@FindBy(id="colors") WebElement colorName;
	@FindBy(id="animals") WebElement animalsName;
	
	public void setCountryName() {
		Select sel=new Select(countryName) ;
		sel.selectByIndex(9);
		System.out.println("Country Name List");
	    String cName=countryName.getText();
	    System.out.println(cName);
	}
	
	public void setColorName() {
		Select sel=new Select(colorName) ;
		sel.selectByValue("red");;
		System.out.println("Color Name List");
	    String cName=countryName.getText();
	    System.out.println(cName);
	}
	
	public void setAnimalsName() {
		Select sel=new Select(animalsName) ;
		sel.selectByVisibleText("Elephant");
		System.out.println("animals Name List");
	    String aName=countryName.getText();
	    System.out.println(aName);
	}
	
}
