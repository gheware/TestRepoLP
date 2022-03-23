package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import action.Action;
import base.BaseClass;

public class RegistrationPage extends Action{
WebDriver driver;
  // @FindBy (xpath="//div[@class='col-lg-4']/input[@name='customer_info[Customer][Email]']")
	@FindBy (name="customer_info[Customer][Email]")
	//@FindBy (xpath="//input[@name='customer_info[Customer][Email]']")
	WebElement email;
	
	@FindBy (name="customer_info[Customer][Password]")
	WebElement password;
	
	@FindBy (name="customer_info[Customer][RePassword]")
	WebElement rePassword;
	
	@FindBy (name="customer_info[Customer][FirstName]")
	WebElement firstName;
	
	@FindBy (name="customer_info[Customer][LastName]")
	WebElement lastName;
	
	@FindBy(xpath="//select[@name='customer_info[Customer][Country]']")
	WebElement country;
	
	@FindBy (xpath="//select[@id='customer_info_Customer_State']")
	WebElement state;
	
	 @FindBy (xpath="//input[@name='customer_info[Customer][ZipCode]']")
	 WebElement zipcode;
	 
	 @FindBy (name="customer_info[Customer][City]")
	 WebElement city;
	 
	 @FindBy (name="customer_info[Customer][Streetline1]")
	 WebElement address1;
	 
	 @FindBy (name="customer_info[Customer][Streetline2]")
	 WebElement address2;
	 
	 @FindBy (name="customer_info[Customer][Phone]")
	 WebElement contactNo;
	 
	@FindBy (xpath="//input[@value='Register']")
	WebElement register;
	
	
	
	public RegistrationPage(){
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	public void enterTexttoEle() {
		// TODO Auto-generated method stub
		//sendText(email, "bddtester1@gmail.com");
		email.sendKeys("bddtester1@gmail.com");
	//	sendText(password, "DearJindagi");
		password.sendKeys("DearJindagi");
		//sendText(rePassword, "DearJindagi");
		rePassword.sendKeys("DearJindagi");
	//	sendText(firstName, "");
		firstName.sendKeys("tester1");
		//sendText(lastName, "");
		lastName.sendKeys("testLast");
	//	sendText(zipcode, "");
		zipcode.sendKeys("411033");
	//	sendText(city, "");
		city.sendKeys("Pune");
	//	sendText(address1, "");
		address1.sendKeys("Thergaon");
	//	sendText(address2, "");
		address2.sendKeys("GujarNager");
	//	sendText(contactNo, "");
		contactNo.sendKeys("1234567890");
		selectElementFomDD(country, "100");
		selectByVisibleTextFromDD(state,"Maharashtra");
		//selectByVisibleTextFromDD(state,"Maharashtra");
		click2(register);
	}
	
	
	public void selectcountry() {
		// TODO Auto-generated method stub
//		Select select = new Select(country);
//		select.selectByVisibleText("India");
		selectElementFomDD(country, "India");
	}


	public void selectstate() {
		// TODO Auto-generated method stub
//		Select select = new Select(state);
//		select.selectByVisibleText("Maharashtra");
		selectElementFomDD(state,"Maharashtra");
	}


	public void clickRegister() {
		
		// TODO Auto-generated method stub
	//	register.click();
		click2(register);
	}
	

}
