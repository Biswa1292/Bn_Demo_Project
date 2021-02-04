package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.TestBase;

public class LoginPage extends TestBase 
{
	//Page Factory - OR:
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login_btn;
	
	@FindBy(xpath="//img[@src='/logo.png']")
	WebElement gurulogo;
	
	//Initializing the Page Objects:
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

    //Actions Methods:
	public String Validate_LoginPage_title()
	{
		return driver.getTitle();
	}
	
	public boolean Validate_Logo()
	{
		return gurulogo.isDisplayed();
	}
	
	public Homepage Login(String usr,String pwd)
	{
		username.sendKeys(usr);
		password.sendKeys(pwd);
//		login_btn.click();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login_btn);
		
		return new Homepage();
	}
	
	
	

}
