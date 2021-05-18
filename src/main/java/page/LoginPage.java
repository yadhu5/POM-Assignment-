package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		
	}
	@FindBy(how=How.XPATH,using="//input[@id='username']") WebElement USER_NAME_FIELD;
	@FindBy(how=How.XPATH,using = "//input[@id='password']") WebElement PASSWORD_FIELD;
	@FindBy(how=How.XPATH,using = "//button[@name='login']") WebElement SIGNIN_BUTTON;

	
	public void insertusername (String name) {
		USER_NAME_FIELD.sendKeys(name);		
	}
	public void insertpassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
		
	}
	public void clicksigninbutton() {
		
		SIGNIN_BUTTON.click();

		
	}
	
}
