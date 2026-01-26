package base;

import org.openqa.selenium.WebDriver;

import webpages.OrangeHRMLoginPage;

public class PageInitializer{
	
	public static OrangeHRMLoginPage loginPage;
	
	public static void initializeAllPages(WebDriver driver) {
		loginPage = new OrangeHRMLoginPage(driver);
	}
}
