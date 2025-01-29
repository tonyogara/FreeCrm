package com.crm.qa.stepdefinitions;


 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.crm.qa.base.*;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CheckCompanyName extends TestBase
{
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	public CheckCompanyName()
	{
		super(prop);
		//PageFactory.initElements(driver, this);
	}
	
	
	
	
	@Given("^I have just logged on$")
	public void i_have_just_logged_on() throws Throwable {
		super.initialization();
		String user = prop.getProperty("username");
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
	}

	@When("^The home page is displayed$")
	public void the_home_page_is_displayed() throws Throwable {		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM", null);

	}

	@Then("^I am seeing the correct company name$")
	public void i_am_seeing_the_correct_company_name() throws Throwable {
		
		Boolean checkVal = homePage.checkCompanyNameDisplay("Adelphi");
		
		Assert.assertEquals(true, checkVal);
		driver.close();
		
	}
	
	

}
