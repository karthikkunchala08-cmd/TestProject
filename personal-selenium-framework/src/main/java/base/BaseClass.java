package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseClass extends PageInitializer{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void setup() {
		ConfigReader.loadConfig();
		String browserName = ConfigReader.getProperty("browser");
		String url = ConfigReader.getProperty("URL");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		initializeAllPages(driver);
	    driver.manage().window().maximize();
	    driver.get(url);
	    System.out.println("Before Method Executed");
	}
	
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void waitInSeconds(int time) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	}
	
	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
