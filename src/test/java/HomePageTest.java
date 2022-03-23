import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

import pageobjects.HomePage;
import pageobjects.RegistrationPage;
import pageobjects.SignInPage;

public class HomePageTest extends BaseClass {
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	
	@Test
	public void TC_1verifySignIn() throws InterruptedException{
		
		HomePage obj=PageFactory.initElements(driver, HomePage.class);
		
		obj.clickOnSignIn();
		obj.clickOnRegister();
		
		RegistrationPage regpg=PageFactory.initElements(driver, RegistrationPage.class);
		regpg.enterTexttoEle();
	}
	
	
//	@Test
//	public void TC_2Registration(){
//		
//		RegistrationPage regpg=PageFactory.initElements(driver, RegistrationPage.class);
//		regpg.enterTexttoEle();
//		regpg.selectcountry();
//		regpg.selectstate();
//		regpg.clickRegister();
//		
//	}
	
	
	

	@AfterMethod
	public void tearDown(){
		
	}
}
