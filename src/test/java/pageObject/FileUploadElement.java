package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadElement extends BasePage{

	
	 public FileUploadElement(WebDriver driver){
		 super(driver);
	 }
	 
	 @FindBy(id="singleFileInput") WebElement fsingleFileUpload_field;
	 @FindBy(xpath="//button[normalize-space()='Upload Single File']") WebElement click_uploadfile1;
	 @FindBy(id="singleFileStatus")WebElement statusFild1;
	 @FindBy(id="multipleFilesInput") WebElement multipleFilesUpload_field2;
	 @FindBy(xpath="//button[normalize-space()='Upload Multiple Files']") WebElement click_uploadfile2;
	 @FindBy(id="multipleFilesStatus")WebElement statusFild2;
	 
	public  void setFile_filed1(String fpath) {
		 fsingleFileUpload_field.sendKeys(fpath);
	 }
	public void clickUploadSingleFile() {
		 click_uploadfile1.click();
	 }
	 
	public String getSinglefileStatus() {
		return statusFild1.getText();
	 }
	 
	public  void setFile_filed2(String f1,String f2) {
		 multipleFilesUpload_field2.sendKeys(f1+"\n"+f2);
	 }
	public  void clickUploadMultipleFile() {
		 click_uploadfile2.click();
	 }
	 
	public  String getMultiplefileStatus() {
		return statusFild2.getText();
	 }
}
