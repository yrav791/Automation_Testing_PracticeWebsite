package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class ActionsElement extends BasePage{

	public ActionsElement(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='Point Me']")WebElement mh;
	@FindBy(xpath="//button[normalize-space()='Copy Text']")WebElement doubleClick;
	@FindBy(xpath="//p[normalize-space()='Drag me to my target']")WebElement drag;
	@FindBy(xpath="//div[@id='droppable']")WebElement drop;
	@FindBy(xpath="//div[@id='HTML7']//span[1]")WebElement sliderElement;
	
	public void mouseHoverActions() {
		Actions act=new Actions(driver);
		Action a=act.moveToElement(mh).build();
		a.perform();
	}
	
	public void doubleClickActions() {
		Actions act=new Actions(driver);
		Action a=act.doubleClick(doubleClick).build();
		a.perform();
	}
	
	public void dragAndDropActions() {
		Actions act=new Actions(driver);
		Action a=act.dragAndDrop(drag,drop).build();
		a.perform();
	}
	public void sliderActions() {
		Actions act=new Actions(driver);
		int yaxis=sliderElement.getLocation().getY();
		Action a=act.dragAndDropBy(sliderElement, 50, 0).build();
		a.perform();
	}
}
