package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base.BaseClass;


public class ParallelTesting{
	WebDriver driver;
	@Test
	public void test1() {
		driver = new ChromeDriver();
		System.out.println("Test 1");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void test2() {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Test 2");
	}

}
