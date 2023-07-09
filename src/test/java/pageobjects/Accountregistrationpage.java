package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregistrationpage extends Basepage{

	public Accountregistrationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;

	@FindBy(xpath= "//input[@id='input-firstname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="")
	WebElement msgconfirmation;
	
	
	//Actions
	
	public void setfirstname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void setlaststname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String Email) {
		email.sendKeys(Email);
	}
	
	
	//validation of message
	
	public String getConfirmationmessage() {
		try{
			return(msgconfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}

}

