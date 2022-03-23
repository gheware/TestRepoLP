package pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Action;
import base.BaseClass;

public class HomePage extends Action{
	WebDriver driver;
	Action action= new Action();
	
	 @FindBy(xpath= "//a[text()='Sign In']")
     //@FindBy(linkText="SignIn")
	 WebElement signIn;
    
	 @FindBy(xpath="//a[text()='My Account']")
 // @FindBy(linkText="My Account")
    WebElement myAccount;
	 
	  @FindBy(xpath="//button[@class='btn btn-default']")
	  WebElement register;
	  
	  @FindBy (xpath="//h1[text()='Registration Form']")
	  WebElement heading;
	  
	 // @FindBy (className="site-logo")
	  @FindBy (xpath="//a[@class='site-logo']")
	  WebElement avactisLogo;
	  
	public HomePage(){
		//this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
//	public void clickOnSignIn() {
//		//action.fluentWait(driver, signIn, 20);
//		//Thread.sleep(3000);
//		signIn.click();
//		return SignInPage();
//		//		
//	}
	public SignInPage clickOnSignIn() {
		//action.fluentWait(driver, signIn, 20);
		//Thread.sleep(3000);
		signIn.click();
		return new SignInPage();
	}
	
	public RegistrationPage clickOnRegister(){
		
	 click2(register);
		
	return new RegistrationPage();
	
		//String expectedHeading="Registration Form";
		//WebElement heading;
		//String actheading=driver.findElement(By.xpath("//h1[text()='Registration Form']"));
	  //  assertEquals(heading, "Registration Form");
	}

//	public void clickOnmyAccount(){
//		//action.fluentWait(driver, myAccount, 10);
//		myAccount.click();
//	}
   // BaseTest bt;
//	public void clickOnSignIn() {
//		//bt.clickOnElement(signIn);
//		// TODO Auto-generated method stub
//		click2(signIn);
////		String expectedHeading="Sign in or create a new account";
////		WebElement actualHeading=driver.findElement(By.xpath("//h2[text()='Sign in or create a new account']"));
////		assertEquals(actualHeading,expectedHeading);
//		//return new SignInPage();
//	}
//	public SignInPage clickOnSignIn(){
//		action.click(driver, signIn);
//		return new SignInPage();
//		
//	}
//	public void clickOnmyAccount(){
//		click2(myAccount);
//	}
	
	
	public boolean validatelogo(){
		return isDisplayed(driver, avactisLogo);
		
	}
	
	public String getStoreTitle(){
		String storeTitle=driver.getTitle();
		return storeTitle;
	}
	


}
