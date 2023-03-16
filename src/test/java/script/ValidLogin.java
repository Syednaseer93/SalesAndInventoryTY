package script;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.BaseTest;
import generic.Excel;

import page.UserHomePage;
import page.UserLoginPage;

public class ValidLogin extends BaseTest
{
	@Test(priority = 1)
	public void testValidLogin() {
		String un=Excel.getCellData(INPUTXL_PATH, "Sheet1",1, 0);
		String pw=Excel.getCellData(INPUTXL_PATH, "Sheet1",1, 1);
		
//		1. Enter valid user name
		UserLoginPage loginPage=new UserLoginPage(driver);
		loginPage.setUserName(un);
		extentTest.log(Status.INFO, "Enter valid user name:"+un);
		
//		2. Enter valid password
		loginPage.setPassword(pw);
		extentTest.log(Status.INFO, "Enter valid password:"+pw);
		
//		3. click on login button
		loginPage.clickLoginButton();
		extentTest.log(Status.INFO, "Click on login Button");
		
//		4. verify that home page is displayed
		UserHomePage ettPage=new UserHomePage(driver);
		boolean result = ettPage.verifyLogoutIsDisplayed(wait);
		Assert.assertTrue(result,"Home Page is not Displayed");
		extentTest.log(Status.INFO, "Verify Home Page is displyed");
		
	}
}