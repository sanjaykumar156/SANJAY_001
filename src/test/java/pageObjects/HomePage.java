package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}



	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement btnsignin;
	
	@FindBy(xpath = "//a[normalize-space()='Create a new account']")
	WebElement btncreate;
	
	
	
	public void homesignin() {
		btnsignin.click();
	}
	
	public void createbtn() {
		btncreate.click();
		
		
		
		
		
		
	}

}
