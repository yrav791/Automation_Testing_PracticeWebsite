package testCases;

import org.testng.annotations.Test;

import pageObject.AutoSuggestionElement;
import testBases.BaseClass;

public class TC09_AutoSuggestionElement extends BaseClass{

	@Test
	void checkAutoSuggestionPage() {
		AutoSuggestionElement asp=new AutoSuggestionElement(driver);
		asp.setSearchKey("Auromation");
		asp.clickSearchLogo();
		asp.clickSearchOption();
	}
	
}
