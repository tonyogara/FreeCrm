package com.crm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	
	

	//Page Factory - OR
	//@FindBy(name="email")
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement emaiLogin;
	
	
	/*
	//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]
	
	@FindBy(xpath = "//div[contains(@class,'gallery_grid_image_caption gallery_grid_image_caption_padding')]")
	public WebElement yourElement;
	*/
	
	
	//@FindBy(name="password")
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement passwordLogin;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement loginBtn;
	
	
	
	@FindBy(xpath ="//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]")
	WebElement firstLoginBtn;
	
	//Initializing the Page Object
	public LoginPage() 
	{
		super(prop);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]
	//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]
	
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public HomePage login(String lgn,String pwd)
	{
		System.out.println("In first page");
		
		firstLoginBtn.click();
		System.out.println("In login page");
		
		emaiLogin.sendKeys(lgn);
		passwordLogin.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}
	
		
	
}
