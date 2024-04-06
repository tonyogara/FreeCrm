package com.crm.qa.testcases;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;


HomePage homePage;

public class HomePageTest extends TestBase {

	
	public HomePageTest()
	{
	super(prop);

	}
	
	
	
	//HomePage homePage;
	
	
	
	@Test
	public void companyNameDisplayTest()
	{
		System.out.println("companyNameDisplayTest() start");
		
		if (homePage.checkCompanyNameDisplay() = true)
		{	
			System.out.println("companyNameDisplayTest() worked");
		}
	}
	
	
	
}
