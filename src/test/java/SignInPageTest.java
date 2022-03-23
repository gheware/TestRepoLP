import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.SignInPage;

public class SignInPageTest extends BaseClass{
	SignInPage signpg;
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	@Test
	public void VerifyLoggin(){
		signpg.sendText();
		signpg.clickCheckBox();
		signpg.clicksignInbutton();
		
	}
	@AfterMethod
	public void tearDown(){
		
	}
}
