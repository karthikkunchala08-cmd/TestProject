package TestClass;
import org.testng.annotations.Test;

import base.BaseClass;

public class OrangeHRMTest extends BaseClass{ 
	
	@Test
	public void loginTestPositive() {
		loginPage.loginMethodPositive();
	}
	
	@Test
	public void loginTestNegative() {
		loginPage.loginMethodNegative();
	}
}
