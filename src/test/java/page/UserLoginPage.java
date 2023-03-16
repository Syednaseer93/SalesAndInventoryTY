package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLoginPage{
	
	
	@FindBy(name="user")				 
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(name="btnlogin")
	private WebElement loginBTN;
	
	//@FindBy(xpath="//div[@class='error-message-container error']")
	//private WebElement errMsg;
	
	public UserLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
/*	public boolean verifyErrMsgDisplayed(WebDriverWait wait) {
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			return true;
		}
		catch (Exception e) 
		{
			return false;
		}
	}*/


	public void setUserName(String un) {
		unTB.sendKeys(un);
		
	}

	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
		
	}

	public void clickLoginButton() {
		loginBTN.click();
		
	}


}
