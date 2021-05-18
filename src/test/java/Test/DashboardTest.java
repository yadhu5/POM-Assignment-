package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class DashboardTest {
WebDriver driver;

@Test
	public void validatingdashboardpage() {
		
		driver= BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertusername("demo@techfios.com");
		loginpage.insertpassword("abc123");	
		loginpage.clicksigninbutton();
		
		DashboardPage dashbpardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashbpardpage.validatingthedashboardpage();
		dashbpardpage.clickcustomerpage();
		dashbpardpage.clickaddcustomerpage();
		
		// call the method browserFactory to close
		BrowserFactory.teardown();
	}
}
