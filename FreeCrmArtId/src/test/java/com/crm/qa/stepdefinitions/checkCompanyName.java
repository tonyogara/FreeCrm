package com.crm.qa.stepdefinitions;


import java.io.IOException;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

//import cucumber.annotation.en.Given; 
//import cucumber.annotation.en.Then; 
//import cucumber.annotation.en.When; 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




//import com.crm.qa.pages.LoginPage;
//import com.crm.qa.pages.HomePage;
import com.crm.qa.base.*;
import com.crm.qa.pages.LoginPage;

public class CheckCompanyName extends TestBase
{
	
	LoginPage loginPage = new LoginPage();
	//HomePage homePage = new HomePage();
	
	public CheckCompanyName()
	{
		super(prop);
		//PageFactory.initElements(driver, this);
	}
	
	
	
	
	@Given("^I have just logged on$")
	public void i_have_just_logged_on() throws Throwable {
		System.out.println("I have just logged on");
		//super(prop);
		
		super.initialization();
		
		//loginPage.initialization();
		//loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		//super.initialization();
		//loginPage = new LoginPage();
		
		//loginPage.login(prop.getProperty("uesername"), prop.getProperty("password"));
		
		
		//super.initialization();
		//@BeforeMethod
		
		/**
		loginPage.login(prop.getProperty("uesername"), prop.getProperty("password"));
		System.out.println("login complete");
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	    **/
		
	}

	@When("^The home page is displayed$")
	public void the_home_page_is_displayed() throws Throwable {
		
		System.out.println("In the homepage hopefully..the.not sure what else to put here");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I am seeing the correct company name$")
	public void i_am_seeing_the_correct_company_name() throws Throwable {
		
		System.out.println("Last step I am seeing the correct company name");
		/**
		if (homePage.checkCompanyNameDisplay())
		{
			System.out.println("True was returned");
		}
		else 
		{
			System.out.println("False was returned");
		}
		**/
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	

}
