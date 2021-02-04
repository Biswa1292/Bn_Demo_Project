package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Add_New_CustomerPage;
import pages.Homepage;
import pages.LoginPage;
import testbase.TestBase;

public class NewCustomerPage_Test extends TestBase
{
	LoginPage loginPage;
	Homepage hp;
	Add_New_CustomerPage adcustomer;
	
	public NewCustomerPage_Test()
	{
		super();
	}
	@BeforeMethod
	public void Setup()
	{
		initialization();
		adcustomer = new Add_New_CustomerPage();
		loginPage = new LoginPage();
		hp = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));	
		adcustomer = hp.clickAddNewCustomer();
	}
	@Test(priority=1)
	public void VerifyNewCustomerEntryPageTitle()
	{
		String CustomerpageTitle=adcustomer.Verify_NewCustomerEntryPageTitle();
		Assert.assertEquals(CustomerpageTitle,"Gtpl Bank New Customer Entry Page","Customer page title not matched");
	}
	@Test(priority=2)
	public void addNewCustomer_Details() throws InterruptedException
	{
		adcustomer.custName("Biswajeet");
		adcustomer.custgender("male");
		adcustomer.custdob("09","12","1993");
		Thread.sleep(3000);
		adcustomer.custaddress("INDIA");
		adcustomer.custcity("Berhampur");
		adcustomer.custstate("ODISHA");
		adcustomer.cupincode("760001");
		adcustomer.cutelephone("9777777777");
		adcustomer.cusemail("sam.biswa27@gmail.com");
		adcustomer.custsubmit();
		
		Thread.sleep(3000);
	boolean result = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(result == true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
}
