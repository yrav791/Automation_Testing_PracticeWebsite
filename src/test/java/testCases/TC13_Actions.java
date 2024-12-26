package testCases;

import org.testng.annotations.Test;

import pageObject.ActionsElement;
import testBases.BaseClass;

public class TC13_Actions extends BaseClass{

	@Test
	void handleActions() throws InterruptedException {
		ActionsElement action=new ActionsElement(driver);
		action.mouseHoverActions();
		Thread.sleep(3000);
		action.doubleClickActions();
		Thread.sleep(3000);
		action.dragAndDropActions();
		Thread.sleep(3000);
		action.sliderActions();
		Thread.sleep(3000);
	}
}
