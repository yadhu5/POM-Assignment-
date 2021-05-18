package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	static String browser = null;
	static String url = null;
	
	public static void readConfig() {
		
		Properties prop = new Properties();
	// use try catch method for importing the config file 
		
		try { 
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			prop.load(input);
			browser =  prop.getProperty("browser");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static WebDriver init() {
		readConfig() ;
		
		
		if(browser.equalsIgnoreCase(" chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
		
	}
	public static void teardown() {
		
		driver.close();
		driver.quit();
	}
}
