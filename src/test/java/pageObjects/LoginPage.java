package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="user[email]")
	WebElement loginemail;
	
	@FindBy(id="user[password]")
	WebElement loginpassword;
	
	@FindBy(xpath ="//button[normalize-space()='Sign in']")
	WebElement btnclick;
	
	
	public void txtEMAIL(String e) {
		loginemail.sendKeys(e);
	}
	public void txtPASSWORD(String p) {
		loginpassword.sendKeys(p);
	}
	
	public void loginbtn() {
		btnclick.click();
	}

}
