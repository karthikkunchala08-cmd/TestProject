package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.BaseClass;
import pageobjects.OrangeHRMLogin;

public class OrangeHRMLoginPage extends BaseClass{
	
			public OrangeHRMLoginPage(WebDriver driver){
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
	
			@FindBy(xpath=OrangeHRMLogin.USERNAME)
			private WebElement userName;
			@FindBy(xpath=OrangeHRMLogin.PASSWORD)
			private WebElement password;
			@FindBy(xpath=OrangeHRMLogin.SUBMIT_BUTTON)
			private WebElement submitButtton;
			@FindBy(xpath=OrangeHRMLogin.INVALID_CREDENTIALS_ERROR_MESSAGE)
			private WebElement invalidCredentialsErroressage;
			@FindBy(xpath=OrangeHRMLogin.DASHBOARD_HEADER)
			private WebElement dashboardHeader;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
//			@FindBy(xpath=OrangeHRMLogin.)
//			private WebElement ;
			
	
			public void loginMethodPositive() {
				waitInSeconds(10);
				if (driver == null) {
			        System.out.println("Driver is NULL! Check your @BeforeMethod setup.");
			    }
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OrangeHRMLogin.USERNAME)));
		        sendKeys(userName,"Admin");
		        sendKeys(password,"admin123");
		        submitButtton.click(); 
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OrangeHRMLogin.DASHBOARD_HEADER)));
		        if(dashboardHeader.isDisplayed()) {
		        	System.out.println("Positive Test Passed");
		        }
		        Assert.assertTrue(dashboardHeader.isDisplayed(),"Negative Test Failed");  
			}
			//Kirramaskiloriparrii
			public void loginMethodNegative() {
				waitInSeconds(10);
				if (driver == null) {
			        System.out.println("Driver is NULL! Check your @BeforeMethod setup.");
			    }
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OrangeHRMLogin.USERNAME)));
		        sendKeys(userName,"test");
		        sendKeys(password,"Test@123");
		        submitButtton.click();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OrangeHRMLogin.INVALID_CREDENTIALS_ERROR_MESSAGE)));
		        if(invalidCredentialsErroressage.isDisplayed()) {
		            System.out.println("Negative Test Passed");
		        }
		        Assert.assertTrue(invalidCredentialsErroressage.isDisplayed(),"Negative Test Failed");
			}
			
}
