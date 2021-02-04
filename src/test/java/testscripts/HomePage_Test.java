// author:-Bunty

package testscripts;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Add_New_CustomerPage;
import pages.Homepage;
import pages.LoginPage;
import testbase.TestBase;

public class HomePage_Test extends TestBase
{
	LoginPage loginPage;
	Homepage hp;
	Add_New_CustomerPage adcustomer;
	public HomePage_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		adcustomer = new Add_New_CustomerPage();
		loginPage = new LoginPage();
		hp = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));	
		
	}
	
	@Test(priority=1)
	public void VerifyHomePageTitleTest()
	{
		String homepageTitle=hp.verifyHomePageTitle();
		Assert.assertEquals(homepageTitle,"GTPL Bank Manager HomePage","Home page title not matched");
	}
	
	@Test(priority=2)
	public void VerifyAddCustomerLnkTest()
	{
		adcustomer = hp.clickAddNewCustomer();
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
