package testCases;

import org.testng.annotations.Test;

import pageObject.RadioCheckBoxElement;
import pageObject.TextElement;
import testBases.BaseClass;

public class TC02_testRadioCheckBox extends BaseClass{
	
	@Test
	public void verify_testRadioCheckBoxElement() {
		
		RadioCheckBoxElement rce=new RadioCheckBoxElement(driver);
		rce.clickMaleRadioButton();
		//rce.clickFemaleRadioButton();
		rce.clickCheckBoxes();
	}
}
