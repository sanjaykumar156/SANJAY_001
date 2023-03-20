package testcases;

import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;



import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccPage;
import testbase.BaseClass;
import utilities.DataProviders;

public class TC_003ddtLogintest extends BaseClass{
	
	@Test(dataProvider= "nop", groups = {"regression"})
	public void test_login(String email , String pswd , String exp){
		try {
		HomePage hp = new HomePage(driver);
		hp.homesignin();
		
		LoginPage lp = new LoginPage(driver);
		lp.txtEMAIL(email);
		lp.txtPASSWORD(pswd);
		lp.loginbtn();
		
		
		MyaccPage mp = new MyaccPage(driver);
		boolean message = mp.logintext();
		
		
		
		if (exp.equals("valid")) {
			if (message == true) {
				mp.logout();
				mp.signout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}

		if (exp.equals("invalid")) {
			if (message == true) {
				
				mp.logout();
				mp.signout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e) {
			Assert.fail(); 
		}
		
		
	}
	
	
	@DataProvider(name= "nop")
	String [][] logindata(){
		String data[][] = { {"sanjayroyal20@gmail.com" , "virus@123" , "valid"},
		{"abc@gmail.com" ,"reeeach", "invalid"},
		{"xyx@gmail.com" ,"redyug", "invalid" },
		{"sdfv@gmail.com", "deuis", "invalid" },
		{"sdrtyh@gmail.com", "4545", "invalid"}
		
		};
		return data;
		
	}
	
	
		
	}


