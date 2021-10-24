package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class UserLoginTest extends TestBase {
	LoginPage loginObject;
	@Test()
	public void UserCanLoginSuccessfuly()
	{
		loginObject = new LoginPage(driver);
		loginObject.UserLogin("Admin", "admin123");
		Assert.assertTrue(loginObject.dashboard.isDisplayed());
		
	}
}
