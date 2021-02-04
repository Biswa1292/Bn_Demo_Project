package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class Add_New_CustomerPage extends TestBase 
{
	@FindBy(name="name")
	WebElement txtCustomerName;
	
	@FindBy(name="rad1")
	WebElement rdGender;
	
	@FindBy(id="dob")
	WebElement txtdob;

	@FindBy(name="addr")
	WebElement txtaddress;

	@FindBy(name="city")
	WebElement txtcity;

	@FindBy(name="state")
	WebElement txtstate;
	
	@FindBy(name="pinno")
	WebElement pincode;
	
	@FindBy(name="telephoneno")
	WebElement telephone_no;
	
	@FindBy(name="emailid")
	WebElement emailid;
	
	@FindBy(name="sub")
	WebElement btnSubmit;
	
	
	
	public Add_New_CustomerPage()
	{
		PageFactory.initElements(driver,this);
	}

	public String Verify_NewCustomerEntryPageTitle(){
		return driver.getTitle();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}
	public void cupincode(String cpincode)
	{
		pincode.sendKeys(String.valueOf(cpincode));
	}
	public void cutelephone(String ctelep)
	{
		telephone_no.sendKeys(ctelep);
	}
	public void cusemail(String cemail)
	{
		emailid.sendKeys(cemail);
	}
	
	public void custsubmit() {
		btnSubmit.click();
	}
	
}
