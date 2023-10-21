package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	

	//Page Factory - OR
	@FindBy(name="email")
	WebElement emaiLogin;
	
	@FindBy(name="password")
	WebElement passwordLogin;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginBtn;
	
	//button[]
	
	//copy xpath
	//*[@id="ui"]/div/div/form/div/div[3]
	
	
	//Copy full xpath
	// /html/body/div[1]/div/div/form/div/div[3]
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String validateLoginPageTitle()
	{
		
		return driver.getTitle();
	}
	
	
	
}
