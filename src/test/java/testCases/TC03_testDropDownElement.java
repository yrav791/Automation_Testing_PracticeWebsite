package testCases;

import org.testng.annotations.Test;

import pageObject.DropDownElement;
import testBases.BaseClass;

public class TC03_testDropDownElement extends BaseClass{

	@Test
	public void verify_dropDownElement() {
		DropDownElement de=new DropDownElement(driver);
		de.setCountryName();
		de.setColorName();
		de.setAnimalsName();
}

}