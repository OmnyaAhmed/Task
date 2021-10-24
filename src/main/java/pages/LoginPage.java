package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "txtUsername")
	WebElement userNameTxtBox;
	
	@FindBy(id = "txtPassword")
	WebElement passwordTxtBox;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(id = "menu_dashboard_index")
	public WebElement dashboard;
	
	public void UserLogin(String userName, String password) 
	{
		setTextElementText(userNameTxtBox, userName);
		setTextElementText(passwordTxtBox, password);
		clickButton(loginBtn);
	}

}
