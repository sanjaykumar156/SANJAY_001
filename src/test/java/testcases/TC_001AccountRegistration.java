package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import org.testng.Assert;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testbase.BaseClass;

public class TC_001AccountRegistration extends BaseClass {
	
	
	
	@Test(priority = 1)
	public void test_acc_registration () throws InterruptedException{
		HomePage hp = new HomePage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		hp.homesignin();
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,900);");
//		hp.createbtn();
//		
		
		
//		hp.loginbtn();
		
		
		AccountRegistrationPage reg = new AccountRegistrationPage(driver);
		
		
		reg.firstname(randomstring());
		reg.lastname(randomstring());
		reg.email(randomstring()+"@gmail.com");
		reg.password(randomstring()+"@123");
		reg.terms();
		reg.signup();
		
	}

}
