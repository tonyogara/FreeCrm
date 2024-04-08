package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	public HomePage() {
		super(prop);
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")
	WebElement companyNameDisplay;
	
	
	
	
	
	
	//Check if companyNameDisplay element is displayed
	public boolean checkCompanyNameDisplay(String expectedComyNme)
	{
		return (companyNameDisplay.getText().equalsIgnoreCase(expectedComyNme));
	}

}
