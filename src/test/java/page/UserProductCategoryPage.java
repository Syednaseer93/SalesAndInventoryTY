package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProductCategoryPage {
	public UserProductCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='#monitor']")
	private WebElement monitor;
	
	@FindBy(xpath="//a[@href='#motherboard']")
	private WebElement motherBoard;
	
	@FindBy(xpath="//a[@href='#processor']")
	private WebElement processor;
	
	@FindBy(xpath="//a[@href='#powersupply']")
	private WebElement powerSupply;
	
}
