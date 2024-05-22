package com.crm.qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	
	

	//Page Factory - OR
	//@FindBy(name="email")
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement emaiLogin;
	
	
	
	//@FindBy(name="password")
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement passwordLogin;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement loginBtn;
	
					//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]
					//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]
	@FindBy(xpath ="//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]")
	WebElement firstLoginBtn;
	
	/**
	/html[1]/body[1]/iframe[2]
	**/
	
	
			
	@FindBy(xpath="//body/iframe[2]")		
	WebElement cookiesIframe;
	
	/**
	Full xPath
	/html/body/div[3]//dialog
	**/
	
	@FindBy(xpath="/html/body/div[3]//dialog")		
	WebElement cookiesModal;
	
	
	
	
	//@FindBy(id="cf_consent-buttons__accept-all")
	//WebElement acceptAllBtn;
	
	
	
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
	
	
	
	@SuppressWarnings("deprecation")
	public HomePage login(String lgn,String pwd)
	{	
		
		
		System.out.println("Before firstLoginBtn");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")));		
				//WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]")));
		
		
		
		System.out.println("After wait");
		
		// ------- This one works -- not sure why firstLoginBtn.click(); is not working ----------- 
		driver.findElement(By.xpath("//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]")).click();
									
		
		
		//firstLoginBtn.click();
		//System.out.println("After");
		
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(lgn);
		//emaiLogin.sendKeys(lgn);
		
		
		
		
		//passwordLogin.sendKeys(pwd);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(pwd);
		
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
		//loginBtn.click();
		return new HomePage();
	}
	
		
	
}
