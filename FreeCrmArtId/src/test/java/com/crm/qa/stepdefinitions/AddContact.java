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
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.base.TestBase;;


public class AddContact extends TestBase {

	
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ContactsPage contactsPage = new ContactsPage();
	
	
	public AddContact()
	{
		super(prop);
	}
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		super.initialization();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	

	@When("I am on the contacts page")
	public void i_am_on_the_contacts_page() {
		
		contactsPage = homePage.selectContactsPage();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assert.assertEquals(title, "Cogmento CRM", null);
	}
	
	
	@Then("I can add first name {string} and surname {string}")
	public void i_can_add_first_name_and_surname(String string1, String string2) {    
	    contactsPage.createContact(string1, string2);
	}

	
	
	
	
	
	
	
	
	
	
	
}
