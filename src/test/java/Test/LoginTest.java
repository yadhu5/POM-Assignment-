package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
WebDriver driver;
	
@Test
public void verifyingtheloginTest() {
	
	driver = BrowserFactory.init();
	
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	//Now call the method from the loginpage
	loginpage.insertusername("demo@techfios.com");
	loginpage.insertpassword("abc123");
	loginpage.clicksigninbutton();
	
	BrowserFactory.teardown();
}
}
