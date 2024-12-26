package testCases;

import pageObject.WindowHandlePaage;
import testBases.BaseClass;

public class TC12_handleWindowById extends BaseClass{

	
	
	void handleWindowById() throws InterruptedException {
		WindowHandlePaage wpage=new WindowHandlePaage(driver);
		wpage.newWindowHandle();
		Thread.sleep(3000);
		wpage.popWindows();
	}
}
