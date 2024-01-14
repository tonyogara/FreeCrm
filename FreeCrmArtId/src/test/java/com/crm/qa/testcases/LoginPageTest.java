package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginPageTest()
	{
	super(prop);

	}
	
	
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		super.initialization();
		loginPage = new LoginPage();
		
	}
	
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	
	
	@Test
	public void loginTest()
	{
		loginPage.login(prop.getProperty("uesername"), prop.getProperty("password"));
		
		
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
