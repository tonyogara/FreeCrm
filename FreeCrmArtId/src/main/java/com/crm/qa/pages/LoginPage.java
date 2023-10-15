package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	

	public LoginPage(Properties prop) {
		super(prop);
		// TODO Auto-generated constructor stub
	}

	//Page Factory - OR
	@FindBy(name="email")
	WebElement emailDetails;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="password")
	WebElement password;
	
	//button[]
	
	//copy xpath
	//*[@id="ui"]/div/div/form/div/div[3]
	
	
	//Copy full xpath
	// /html/body/div[1]/div/div/form/div/div[3]
	
}
