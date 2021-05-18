package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.List_Customer_Page;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;

	@Test
	public void ValadatingAddcustomerpage() {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		// now call the method from the loginpage
		loginpage.insertusername("demo@techfios.com");
		loginpage.insertpassword("abc123");
		loginpage.clicksigninbutton();
		
		DashboardPage dashbpardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashbpardpage.validatingthedashboardpage();
		dashbpardpage.clickcustomerpage();
		dashbpardpage.clickaddcustomerpage();

		AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.insertfullname("lMNO Enterprise");
		addcustomerpage.insertcompanyname("Google");
		addcustomerpage.insertemail("lmo@gmail.com");
		addcustomerpage.insertphonenumber("6825556555");
		addcustomerpage.insertaddress("254 Alona drive");
		addcustomerpage.insertcity("Columbus");
		addcustomerpage.insertstate("Ohio");
		addcustomerpage.insertzipcode("43001");
		addcustomerpage.insertcountry("Viet Nam");
		addcustomerpage.clicksavebutton();
		addcustomerpage.validatingcustomerinfo();
		
		List_Customer_Page listcustomerpage = PageFactory.initElements(driver, List_Customer_Page.class);
		listcustomerpage.clicklistcustomers();
		listcustomerpage.searchcustomer("Enterprise");
	//	BrowserFactory.teardown();

	}
}
