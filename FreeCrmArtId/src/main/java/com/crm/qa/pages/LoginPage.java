package com.crm.qa.pages;

import org.openqa.selenium.By;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	public LoginPage() 
	{
		super(prop);
	}
	
	
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage login(String lgn,String pwd)
	{	
		driver.findElement(By.xpath("//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(lgn);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(pwd);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
		
		return new HomePage();
	}
	
		
	
}
