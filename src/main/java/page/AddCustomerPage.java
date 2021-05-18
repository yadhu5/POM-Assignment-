package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_NO_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_CODE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SAVE_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"application_ajaxrender\"]/table[1]/tbody/tr[1]/td[1]")
	WebElement TOTAL_INCOME_TEXT;

	public void insertfullname(String fullname) {
		waitForElement(driver, 4, FULL_NAME_LOCATOR);
		int generatenumber = RandomGenerator(999);
		FULL_NAME_LOCATOR.sendKeys(fullname + generatenumber);

	}

	public void insertcompanyname(String company) {
		SelectDropdown(COMPANY_NAME_LOCATOR, company);

	}

	public void insertemail(String email) {
		int generatenumber = RandomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(generatenumber + email);
	}

	public void insertphonenumber(String phone) {
		int generatenumber = RandomGenerator(999);
		PHONE_NO_LOCATOR.sendKeys(phone + generatenumber);
	}

	public void insertaddress(String address) {
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}

	public void insertcity(String city) {
		CITY_FIELD_LOCATOR.sendKeys(city);
	}

	public void insertstate(String state) {
		STATE_FIELD_LOCATOR.sendKeys(state);
	}

	public void insertzipcode(String zipcode) {
		ZIP_CODE_LOCATOR.sendKeys(zipcode);
	}

	public void insertcountry(String country) {

		SelectDropdown(COUNTRY_FIELD_LOCATOR, country);

	}

	public void clicksavebutton() {
		SAVE_BUTTON.click();

	}
	public void validatingcustomerinfo() {
		Assert.assertEquals(TOTAL_INCOME_TEXT.getText(), "Total Income");
	}
}
