package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccPage;
import testbase.BaseClass;

public class Tc_002login extends BaseClass  {
	
	@Test(groups = {"functional"})
	public void loginvalid() {
		HomePage hp = new HomePage(driver);
		
		hp.homesignin();
		
		LoginPage lp = new LoginPage(driver);
		lp.txtEMAIL(rb.getString("Email"));
		lp.txtPASSWORD(rb.getString("password"));
		lp.loginbtn();
		
		MyaccPage mp = new MyaccPage(driver);
		boolean message = mp.logintext();
		Assert.assertEquals(message,true);
		mp.logout();
		mp.signout();
	}
	
	
	

}
