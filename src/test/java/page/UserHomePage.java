package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHomePage{
	
	//CacheLookup - find element only once and reuse same address every time-better performace
	
	@FindBy(xpath="//ul[@class='navbar-nav ml-auto']/li/a[@id='userDropdown']/span")
	private WebElement profileIcon;
	
	@FindBy(xpath="//a[@data-target='#logoutModal']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//a[@data-target='#mouse']")
	private WebElement mouse;
	
	@FindBy(xpath="//a[@href='#headset']")
	private WebElement headset;
	
	@FindBy(xpath="//a[@href='#cpu']")
	private WebElement cpu;
	
	@FindBy(xpath="//a[@href='#monitor']")
	private WebElement monitor;
	
	@FindBy(xpath="//a[@href='#motherboard']")
	private WebElement motherBoard;
	
	@FindBy(xpath="//a[@href='#processor']")
	private WebElement processor;
	
	@FindBy(xpath="//a[@href='#powersupply']")
	private WebElement powerSupply;
	
	@FindBy(xpath="//a[@href='#others']")
	private WebElement others;
	
	@FindBy(xpath="//span[.='POS']")
	private WebElement POS;
	
	@FindBy(xpath="//a[@data-target='#settingsModal']")
	private WebElement settingsButton;
	
	@FindBy(xpath="//div[@aria-labelledby='userDropdown']/button")
	private WebElement profileButton;
	public UserHomePage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout() {
		dashboardIcon.click();
		logoutLink.click();
	}
	public boolean verifyLogoutIsDisplayed(WebDriverWait wait) {
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(logoutLink));
			return true;
		}
		catch (Exception e) 
		{
			return false;
		}
	}
	


	
}
