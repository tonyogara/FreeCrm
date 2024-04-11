package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	public HomePage() {
		super(prop);
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	//@FindBy(xpath="//b[contains(text(),'Adelphi')]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")
	//WebElement companyNameDisplay;
	
	
	
	
	
	//Check if companyNameDisplay element is displayed
	//public void checkCompanyNameDisplay(String expectedComyNme)
	public void checkCompanyNameDisplay()
	{
		
		System.out.println("Yooooopppeeee!!");
		
		WebElement companyNameDisplay = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]"));
		String comNam = companyNameDisplay.getText().toString();
		
		
		System.out.println(comNam);
		System.out.println("Finished!!");
		
		//System.out.println(companyNameDisplay.getText());
		//return (companyNameDisplay.getText().equalsIgnoreCase(expectedComyNme));
	}

}
