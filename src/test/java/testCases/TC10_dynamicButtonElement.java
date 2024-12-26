package testCases;

import org.testng.annotations.Test;

import pageObject.DynamicElement;
import testBases.BaseClass;

public class TC10_dynamicButtonElement extends BaseClass{

	@Test
	void checkDyanmaicButtton() throws InterruptedException {
		DynamicElement db=new DynamicElement(driver);
		db.clickStart();
		Thread.sleep(3000);
		db.clickStop();
	}
}
