package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	
	
	@FindBy(id="user[first_name]")
	WebElement fname;
	
	@FindBy(id="user[last_name]")
	WebElement txtlname;
	
	@FindBy(id="user[email]")
	WebElement txtemail;
	
	@FindBy(id="user[password]")
	WebElement password;
	
	@FindBy(id="user[terms]")
	WebElement userterms;
	
	@FindBy(xpath="//button[normalize-space()='Sign up']")
	WebElement signupbtn;
	
	
	
	
	
	
	
	public void firstname(String Fname) {
		fname.sendKeys(Fname);
	}
	
	public void lastname(String Lname) {
		txtlname.sendKeys(Lname);
	}
	public void email(String Email) {
		txtemail.sendKeys(Email);
	}
	
	
	public void password(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void terms() {
		userterms.click();
	}
	public void signup() {
		signupbtn.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
