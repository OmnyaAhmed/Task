package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUserPage extends PageBase{

	public AddUserPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "systemUser_userType")
	WebElement userType;
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement empNameTxt;
	
	@FindBy(id = "systemUser_userName")
	WebElement userTxt;
	
	@FindBy(id = "systemUser_status")
	WebElement userStatus;
	
	@FindBy(id = "systemUser_password")
	WebElement passwordTxt;
	
	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmPasswordTxt;
	
	@FindBy(id ="btnSave")
	WebElement saveBtn;
	
	@FindBy(id = "successBodyEdit")
	public WebElement savedSuccessTxt;
	
	public void changeUserType()
	{
		select = new Select(userType);
		select.selectByVisibleText("ESS");
	}
	
	public void changeUserStatus()
	{
		select = new Select(userStatus);
		select.selectByVisibleText("Enabled");
	}
	
	
	public void AddUser(String empName, String userName, String password, String ConfirmPassword) 
	{
		setTextElementText(empNameTxt, empName);
		setTextElementText(userTxt, userName);
		setTextElementText(passwordTxt, password);
		setTextElementText(confirmPasswordTxt, ConfirmPassword);
		//WebElement first = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
	    //first.findElement(By.id("btnSave")).click();
		clickButton(saveBtn);
	}

}
