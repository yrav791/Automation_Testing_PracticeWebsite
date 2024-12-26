package testCases;

import org.testng.annotations.Test;

import pageObject.ScrollingDropDown;
import testBases.BaseClass;

public class TC14_handleScrollinDropDown extends BaseClass{

	@Test
	void handleDropDownElement() {
		ScrollingDropDown sdd=new ScrollingDropDown(driver);
		sdd.clickDropDownComboBox();
		sdd.getDropDownElement("Item 74");
	}
	
	
}
