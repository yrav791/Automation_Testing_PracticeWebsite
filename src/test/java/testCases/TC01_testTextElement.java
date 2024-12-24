package testCases;

import org.testng.annotations.Test;

import pageObject.TextElement;
import testBases.BaseClass;

public class TC01_testTextElement extends BaseClass{

	@Test
	public void verify_testTextElement() {
		TextElement text=new TextElement(driver);
		text.setName("Pawan Yadav");
		text.setEmail("pawanYadav@email.com");
		text.setPhone("76546578");
		text.setAddress("Jagatdal @ to you say");
	}
}
