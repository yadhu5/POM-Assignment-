package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class List_Customer_Page {
WebDriver driver;

	public List_Customer_Page(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMER_PAGE;
	@FindBy(how=How.XPATH,using = "//*[@id=\"foo_filter\"]") WebElement SEARCH_CUSTOMER;
	
	
	public void clicklistcustomers() {		
		LIST_CUSTOMER_PAGE.click();
	}
	public void searchcustomer(String customername) {
		SEARCH_CUSTOMER.sendKeys(customername);
	}
}
