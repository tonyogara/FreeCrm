package com.crm.qa.pages;

import static org.testng.AssertJUnit.assertTrue;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.support.ui.*;




import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.*;
public class HomePage extends TestBase {
	
	
	public HomePage() {
		super(prop);
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	//@FindBy(xpath="//b[contains(text(),'Adelphi')]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")
	//WebElement companyNameDisplay;
	
	WebDriverWait wait;
	
	
	
	//Check if companyNameDisplay element is displayed
	//public void checkCompanyNameDisplay(String expectedComyNme)
	public boolean checkCompanyNameDisplay()
	{
		
		System.out.println("Yooooopppeeee!!");
		
		WebElement companyNameDisplay = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]"));
		
		
		String comNam1 = companyNameDisplay.getText().toString();
		
		
		System.out.println(comNam1);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")));
		
		String comNam2 = companyNameDisplay.getText().toString();
		
		
		System.out.println(comNam2);
		System.out.println("Finished!!");
		
		//System.out.println(companyNameDisplay.getText());
		return (comNam2.equalsIgnoreCase("Adelphi"));
	}

}
