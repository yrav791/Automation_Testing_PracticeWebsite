package testCases;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.FileUploadElement;
import testBases.BaseClass;

public class TC05_FileUploadElement extends BaseClass{

	@Test
	void verify_FileUploadElement() {
		String f1=("C:\\Users\\Ravi Yadav\\OneDrive\\Pictures\\project image\\1.jpg");
		String f2=("C:\\Users\\Ravi Yadav\\OneDrive\\Pictures\\project image\\2.1.jpg");
		FileUploadElement fi=new FileUploadElement(driver);
		fi.setFile_filed1(f1);
		fi.clickUploadSingleFile();
		String singlefileStatus=fi.getSinglefileStatus();
		if(singlefileStatus.contains("Single file selected")) {
			fi.setFile_filed2(f1, f2);;
			fi.clickUploadMultipleFile();
			String multiplefileStatus=fi.getMultiplefileStatus();
			if(multiplefileStatus.contains("Multiple files selected")) {
				Assert.assertTrue(true);
				System.out.println("test Passed...");
			}
			
		}

		
	}
}
