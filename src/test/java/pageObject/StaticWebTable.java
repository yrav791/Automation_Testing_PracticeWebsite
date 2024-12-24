package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaticWebTable extends BasePage{


	public StaticWebTable(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//table[@name='BookTable']//tr") List<WebElement> rowNumber;
	@FindBy(xpath="//table[@name='BookTable']//th") List<WebElement>  colNumber;
	@FindBy(xpath="//table[@name='BookTable']") WebElement table;
	
	public int getRowNumber() {
		int r=rowNumber.size();
		return r;
	}
	public int getColNumber() {
		int c=colNumber.size();
		return c;
	}
	
	public void getAlldata(int r,int c) {
		for(int i=2;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				String cellData=table.findElement(By.xpath(".//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(cellData+" ");
			}
			System.out.println();
			
		}
		
		
	}
	
}
