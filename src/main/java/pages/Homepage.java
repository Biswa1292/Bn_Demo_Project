package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class Homepage extends TestBase 
{
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement lnk_AddNewCustomer;
	
	@FindBy(xpath="//a[contains(text(),'Edit Customer')]")
	WebElement lnk_EditCustomer;
	
	@FindBy(xpath="//a[contains(text(),'Delete Customer')]")
	WebElement lnk_DelCustomer;
	
	@FindBy(xpath="//a[contains(text(),'New Account')]")
	WebElement lnk_NewAccount;
	
	@FindBy(xpath="//a[contains(text(),'Edit Account')]")
	WebElement lnk_EditAccount;
	
	
	public  Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	public Add_New_CustomerPage clickAddNewCustomer()
	{
		lnk_AddNewCustomer.click();
		return new Add_New_CustomerPage();
	}
	public Edit_CustomerForm clickEditCustomer()
	{
		lnk_EditCustomer.click();
		return new Edit_CustomerForm();
		
	}
	public Del_CustomerForm clickDelCustomer()
	{
		lnk_DelCustomer.click();
		return new Del_CustomerForm();
	}
	public Add_NewAccountForm clickNewAccount()
	{
		lnk_NewAccount.click();
		return new Add_NewAccountForm();
	}
	public Edit_AccountForm clickEditAccount()
	{
		lnk_EditAccount.click();
		return new Edit_AccountForm();
	}

	
	
	

}
