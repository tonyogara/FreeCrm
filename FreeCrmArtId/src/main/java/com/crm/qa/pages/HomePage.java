package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	public HomePage(Properties prop) {
		super(prop);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")
	WebElement companyNameDisplay;
	
	
	
	
	
	
	//Check if companyNameDisplay element is displayed
	public boolean checkCompanyNameDisplay()
	{
		return companyNameDisplay.isDisplayed();
		
	}

}
