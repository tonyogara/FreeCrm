package com.crm.qa.pages;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;


import com.crm.qa.pages.ContactsPage;

public class HomePage extends TestBase {
	
	
	public HomePage() {
		super(prop);
	}
	
	
	public ContactsPage selectContactsPage()
	{
	
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]")).click();
		
		return new ContactsPage();
	}
			
			
			
	//Check if companyNameDisplay element is displayed
	public boolean checkCompanyNameDisplay(String expectedCompany)
	{	
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")));
		WebElement companyNameDisplay = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]"));
																	
		
	
		return (companyNameDisplay.getText().toString().equalsIgnoreCase(expectedCompany));
		
		
	}

}
