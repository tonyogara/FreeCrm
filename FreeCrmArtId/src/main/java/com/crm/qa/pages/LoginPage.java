package com.crm.qa.pages;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	WebElement activeElementIdentified = null;
	public LoginPage() 
	{
		super(prop);
	}
	
	
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage login(String lgn,String pwd) throws IOException
	{	
		
		
		driver.findElement(By.name("email")).sendKeys(lgn);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(pwd);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
		
		return new HomePage();
	}
	
		
	
}
