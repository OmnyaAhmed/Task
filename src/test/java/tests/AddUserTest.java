package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.AddUserPage;
import pages.HomePage;
import pages.UserDetailPage;

public class AddUserTest extends TestBase{
	AddUserPage addUserObject;
	HomePage homeObject;
	UserDetailPage userDetailObject;
	
	@DataProvider(name="ExcelData")
	public Object [][] userData() throws IOException
	{
		ExcelReader ER = new ExcelReader();
			return ER.getExcelData();
		
	}
	
	@Test(priority = 1,dataProvider="ExcelData")
	public void AddUserSuccessfully(String empName, String UsrName, String Password, String confirmPassword) 
	{
		addUserObject = new AddUserPage(driver);
		addUserObject.changeUserType();
		addUserObject.changeUserStatus();
		addUserObject.AddUser(empName, UsrName, Password, confirmPassword);
		//Assert.assertTrue(addUserObject.savedSuccessTxt.isDisplayed());
	}
	
	@Test(priority = 2,dataProvider="ExcelData")
	public void SearchByUserNameSuccessfully(String empName, String UsrName, String Password, String confirmPassword) 
	{
		homeObject = new HomePage(driver);
		homeObject.SearchByUserName(UsrName);
	
	}
	
	
	@Test(priority = 3,dataProvider="ExcelData")
	public void ViewDataSuccessfully(String empName, String UsrName, String Password, String confirmPassword) 
	{
		homeObject = new HomePage(driver);
		homeObject.ViewDataByuserName();
		userDetailObject = new UserDetailPage(driver);
		Assert.assertEquals(userDetailObject.empNameTxt.getAttribute("value").toString(),empName);
		Assert.assertEquals(userDetailObject.userNameTxt.getText().toString(),UsrName);
	}
	
}
