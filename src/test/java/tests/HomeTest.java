package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;


public class HomeTest extends TestBase{
	HomePage homeObject;
	
	@Test(priority = 1)
	public void UserPageOpenSuccessfully()
	{
		homeObject = new HomePage(driver);
		homeObject.UserPage();
		Assert.assertTrue(homeObject.systemUserTxt.isDisplayed());	
		
	}
	
	@Test(priority = 2)
	public void AddUserPageOpenSuccessfully()
	{
		homeObject = new HomePage(driver);
		homeObject.AddUser();
		Assert.assertTrue(homeObject.addUserTxt.isDisplayed());
	}
	
	
}
