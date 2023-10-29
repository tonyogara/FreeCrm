package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	

	//Page Factory - OR
	@FindBy(name="email")
	WebElement emaiLogin;
	
	@FindBy(name="password")
	WebElement passwordLogin;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginBtn;
	
	
	
	//Initializing the Page Object
	public LoginPage() 
	{
		super(prop);
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public void login(String lgn,String pwd)
	{
		
	
	}
	
		
	
}
