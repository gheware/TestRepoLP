package pageobjects;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Action;
import base.BaseClass;

public class SignInPage extends Action {
	
WebDriver driver;
	
	@FindBy (name="email")
	WebElement email;
	
	@FindBy (name="passwd")
	WebElement password;
	
	@FindBy (xpath="//input[@name='remember_me']")
	WebElement checkbox;
	
	@FindBy (xpath="//input[@value='Sign In']")
	WebElement signInbtn;
	
	
	public SignInPage(){
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void sendText() {
		selectBySendkeys("bddtester1@gmail.com", email);
		//email.sendKeys("bddtester1@gmail.com");
		selectBySendkeys("DearJindagi", password);
		//password.sendKeys("DearJindagi");
		
	}
	
	public void clickCheckBox(){
		
		if(checkbox.isSelected())
			checkbox.click();
		assertFalse(checkbox.isSelected());
	}
	
	public void clicksignInbutton(){
		signInbtn.click();
	}


}
