package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.Accountregistrationpage;
import pageobjects.Homepage;
import testBase.Baseclass;

public class TC001_Accountregister extends Baseclass {

	
	
	@Test
	void test_acc_register() {
		
		try
		{
		Homepage hp = new Homepage(driver);
		
		hp.clickregister();
		hp.clickaccount();
	
	
	Accountregistrationpage AP = new Accountregistrationpage(driver);
	
	AP.setfirstname("abc");
	AP.setlaststname(null);
	AP.setEmail(null);
	
	String confrmsg = AP.getConfirmationmessage();
	Assert.assertEquals(confrmsg,"account has been created");
	}
	
	
	catch (Exception e)	{
		
		Assert.fail();
	}
}
}

