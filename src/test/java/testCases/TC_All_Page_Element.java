package testCases;

import org.testng.annotations.Test;

import pageObject.DropDownElement;
import pageObject.RadioCheckBoxElement;
import pageObject.TextElement;
import testBases.BaseClass;

public class TC_All_Page_Element extends BaseClass{
	@Test
	public void verify_All_Page_Element() {
	TextElement text=new TextElement(driver);
	text.setName("Pawan Yadav");
	text.setEmail("pawanYadav@email.com");
	text.setPhone("76546578");
	text.setAddress("Jagatdal @ to you say");
	
	RadioCheckBoxElement rce=new RadioCheckBoxElement(driver);
	rce.clickMaleRadioButton();
	//rce.clickFemaleRadioButton();
	rce.clickCheckBoxes();
	
	DropDownElement de=new DropDownElement(driver);
	de.setCountryName();
	de.setColorName();
	de.setAnimalsName();
	
	
	
	}
}
