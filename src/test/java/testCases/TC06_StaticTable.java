package testCases;

import org.testng.annotations.Test;

import pageObject.StaticWebTable;
import testBases.BaseClass;

public class TC06_StaticTable extends BaseClass{

	@Test
	public void handle_staticTable() {
	 StaticWebTable stable=new StaticWebTable(driver);
	int r=stable.getRowNumber();
	int c=stable.getColNumber();
	System.out.println("No of row: "+r);
	System.out.println("No of col: "+c);
	stable.getAlldata(r, c);
	 
	}
}
