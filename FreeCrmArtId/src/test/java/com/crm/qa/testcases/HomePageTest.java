package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;



public class HomePageTest extends TestBase {

	HomePage homePage = new HomePage();
	LoginPage loginPage;
	
	
	public HomePageTest()
	{
	super(prop);

	}
	
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		super.initialization();
		loginPage = new LoginPage();
		
	}
	
	
	
	@Test
	public void companyNameDisplayTest()
	{
		//homePage.checkCompanyNameDisplay();
		loginPage.login(prop.getProperty("uesername"), prop.getProperty("password"));
		
		
		if (homePage.checkCompanyNameDisplay())
		{
			System.out.println("True was returned");
		}
		else {
			System.out.println("False was returned");
		 }
	
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
}
