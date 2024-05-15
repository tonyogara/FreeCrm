package com.crm.qa.pages;


//import static org.testng.AssertJUnit.assertTrue;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
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


import org.openqa.selenium.support.ui.*;
public class HomePage extends TestBase {
	
	
	public HomePage() {
		super(prop);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//Check if companyNameDisplay element is displayed
	public boolean checkCompanyNameDisplay()
	{	
		WebElement companyNameDisplay = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]"));

		try {
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")));
		
		//WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")));
		
			} catch (TimeoutException toe) {
				String toeMessage = toe.getMessage();
				System.out.println(toeMessage);
			}
		

		return (companyNameDisplay.getText().toString().equalsIgnoreCase("Adelphi"));
	}

}
