package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetailPage extends PageBase {

	public UserDetailPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "systemUser_userType")
	public WebElement userRoleTxt;
	
	@FindBy(id = "systemUser_employeeName_empName") 
	public WebElement empNameTxt;
	
	@FindBy(id = "systemUser_userName")
	public WebElement userNameTxt;
	
	@FindBy(id = "systemUser_status")
	public WebElement statusTxt;

}
