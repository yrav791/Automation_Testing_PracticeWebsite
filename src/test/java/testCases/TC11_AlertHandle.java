package testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObject.AlertHandleElement;
import testBases.BaseClass;

public class TC11_AlertHandle extends BaseClass{

	@Test
	void handleAlert() throws InterruptedException {
		AlertHandleElement alertH=new AlertHandleElement(driver);
		Alert simpleAlert=alertH.handleSimpleAlert();
		System.out.println(simpleAlert.getText()+" : Handle");
		simpleAlert.accept();
		Thread.sleep(3000);
		
		Alert confirmAlert=alertH.handleConfirmationAlert();
		System.out.println(confirmAlert.getText()+" : Handle");
		confirmAlert.accept();
		//confirmAlert.dismiss();
		Thread.sleep(3000);
	
		
		Alert promptAlert=alertH.handlepropmtAlert();
		System.out.println(promptAlert.getText()+" : Handle");
		promptAlert.sendKeys("Good Day");
		promptAlert.accept();
		//promptAlert.dismiss();
		Thread.sleep(3000);
		
		
	}
}
