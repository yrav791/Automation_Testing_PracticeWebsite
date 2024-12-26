package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoSuggestionElement extends BasePage{

	public AutoSuggestionElement(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='Wikipedia1_wikipedia-search-input']") WebElement textArea;
	@FindBy(xpath="//input[@type='submit']") WebElement clickSearch;
	@FindBy(xpath="//div[@class='wikipedia-search-results']") WebElement wekiResult;
	
	public void setSearchKey(String data) {
		textArea.sendKeys(data);
	}
	
	public void clickSearchLogo() {
		clickSearch.click();
	}
	
	public void clickSearchOption() {
		int noOfResult=wekiResult.findElements(By.xpath(".//div")).size();
		List<WebElement> searchLink=wekiResult.findElements(By.xpath(".//div//a"));
		for(int i=0;i<noOfResult;i++) {
			searchLink.get(i).click();
		}
	}
}
