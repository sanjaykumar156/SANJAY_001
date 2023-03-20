package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccPage extends BasePage {

	public MyaccPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h2[normalize-space()='Products']")
	WebElement text; 
	
	@FindBy(xpath="//button[normalize-space()='sanjay k']")
	WebElement accdrp;
	
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	WebElement accsignout;
	
	
	
	public boolean logintext() {
		try {
		return (text.isDisplayed());	
		}catch (Exception e){
			return (false);
		}
			
		
		
	}
	
	public void logout() {
		accdrp.click();
	}
	
	public void signout() {
		accsignout.click();
	
	}

}
