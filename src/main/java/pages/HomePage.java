package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminTabTxt;
	
	@FindBy(id = "menu_admin_UserManagement")
	WebElement accountTabTxt;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement userTabTxt;
	
	@FindBy(id = "systemUser-information")
	public WebElement systemUserTxt;
	
	@FindBy(id = "btnAdd")
    WebElement addUserBtn;
	
	@FindBy(id = "UserHeading")
	public WebElement addUserTxt;
	
	@FindBy(id = "searchSystemUser_userName")
	public WebElement searchUserTxt;
	
	@FindBy(id = "searchBtn")
    WebElement searchBtn;
	
	@FindBy(linkText = "Dominic Chase")
    WebElement viewlink;
	
	public void UserPage()
	{
		clickButton(adminTabTxt);
		clickButton(adminTabTxt);
		clickButton(adminTabTxt);
	}
	
	public void AddUser()
	{
		clickButton(addUserBtn);
	}
		public void SearchByUserName(String userNameSearch)
	{
		setTextElementText(searchUserTxt, userNameSearch);
		clickButton(searchBtn);
	}
	
	public void ViewDataByuserName()
	{
		clickButton(viewlink);
	}

}
