package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginationTable extends BasePage{

	public PaginationTable(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//ul[@id='pagination']") WebElement pagination;
	@FindBy(xpath="//table[@id='productTable']") WebElement table;
	
	public int getRowNumber() {
		return table.findElements(By.xpath(".//tr")).size();
		
	}
	
	public int getColNumber() {
		return table.findElements(By.xpath(".//th")).size();
		
	}
	
	public int getPageNumber() {
		return pagination.findElements(By.xpath(".//li")).size();
	}
	
	public void getTableData(int pNumber,int rowNumber,int colNumber) {
		String data="";
		for(int i=1;i<=pNumber;i++) {
			if(i>=2) {
				pagination.findElement(By.xpath(".//li["+i+"]")).click();
			}
			for(int j=1;j<=rowNumber-1;j++) {
				for(int k=1;k<=colNumber-1;k++) {
					 data=table.findElement(By.xpath(".//tr["+j+"]//td["+k+"]")).getText();
					 System.out.print(data+" ");
				}
				System.out.println();
			}
			
			for(int m=1;m<=rowNumber-1;m++) {
				table.findElement(By.xpath(".//tr["+m+"]//td[4]//input[@type='checkbox']")).click();
			}
			
		}
		
	}
}
