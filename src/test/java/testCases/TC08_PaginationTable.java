package testCases;

import org.testng.annotations.Test;

import pageObject.PaginationTable;
import testBases.BaseClass;

public class TC08_PaginationTable extends BaseClass{

	@Test
	void checkPaginationTable() {
		PaginationTable pt=new PaginationTable(driver);
		int rNo=pt.getRowNumber();
		int cNo=pt.getColNumber();
		int pNo=pt.getPageNumber();
		System.out.println(rNo);
		System.out.println(cNo);
		System.out.println(pNo);
		pt.getTableData(pNo, rNo, cNo);
	
	}
}
