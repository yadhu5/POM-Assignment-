package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import util.BrowserFactory;
import static org.testng.Assert.assertEquals;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage() 	{
		this.driver = driver;		
		
	}
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_PAGE;
	@FindBy(how=How.XPATH,using = "//*[@id=\"side-menu\"]/li[3]/a") WebElement CUSTOMER_PAGE_ELEMENT;
	@FindBy(how=How.XPATH,using ="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_PAGE;
	
	
	public void validatingthedashboardpage() {
		
		Assert.assertEquals(DASHBOARD_PAGE.getText(),"Dashboard");
	}
	public void clickcustomerpage() {
		
		CUSTOMER_PAGE_ELEMENT.click();
		
	}
	public void clickaddcustomerpage() {
		ADD_CUSTOMER_PAGE.click();
	}
}
