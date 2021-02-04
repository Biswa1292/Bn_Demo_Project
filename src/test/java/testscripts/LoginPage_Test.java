package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.Homepage;
import pages.LoginPage;
import testbase.TestBase;

public class LoginPage_Test extends TestBase
{
	LoginPage loginPage;
	Homepage hp;
	
	public LoginPage_Test()
	{
		
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void Loginpage_Title_Test()
	{
		String title = loginPage.Validate_LoginPage_title();
	    Assert.assertEquals(title, "GTPL Bank Home Page","LoginPage title not matched");	
	}
	
	@Test(priority=2)
	public void Loginpage_Logo_Test()
	{
		boolean logo = loginPage.Validate_Logo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=3)
	public void Login_Test()
	{
		hp = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	

}
