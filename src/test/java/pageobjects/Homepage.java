package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	
	//constructor
	
	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elements
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement Myaccount;
	
	@FindBy(xpath=" //a[@class='dropdown-item'][normalize-space()='Register']")
	
	WebElement Registerbuttn ; 
	
	
	//Actions
	
	public void clickaccount() {
		
		Myaccount.click();
	}
	
	public void clickregister()
	{
		Registerbuttn.click();
		
	}
	
	

	
}
