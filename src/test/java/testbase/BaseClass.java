package testbase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


    
public class BaseClass {
	public static WebDriver driver;
	public ResourceBundle rb;
	
	@BeforeClass(groups = {"sanity","functional","regression"})
	@Parameters({"Browser"})
	public void setup(String br) {
		rb= ResourceBundle.getBundle("config");
		
		
		if(br.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(rb.getString("appURL"));
	}
	
	@AfterClass(groups = {"sanity","functional","regression"})
	public void teardown() {
		driver.quit();
	}
	
	public String randomstring() {
		String GeneratedString = RandomStringUtils.randomAlphabetic(6);
		return (GeneratedString);
		
	}
	public String randomnumber() {
		String Generatednumber = RandomStringUtils.randomAlphabetic(6);
		return (Generatednumber);

}
}