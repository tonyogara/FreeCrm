package com.crm.qa.stepdefinitions;

import org.apache.commons.lang.RandomStringUtils;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAndSearchContact extends TestBase{

	
	LoginPage loginPage = new LoginPage();
	ContactsPage contactsPage = new ContactsPage();
	HomePage homePage = new HomePage();
	
	
	public AddAndSearchContact()
	{
		super(prop);
	}
	
	
	@Given("I am on the Contacts page")
	public void i_am_on_the_Contacts_page() {
	  super.initialization();  
	  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    throw new cucumber.api.PendingException();
	}

	
	@When("I select the Create button")
	public void i_select_the_Create_button() {
		contactsPage = homePage.selectContactsPage();
	
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Enter the First Name and Last Name")
	public void enter_the_First_Name_and_Last_Name() {
		
		//need to generate random string for fname
		String firstName = this.givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect();
		//need to generate random string for sname
		String surName = givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect();
		
		contactsPage.createContact(firstName, surName);
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Save the contact details")
	public void save_the_contact_details() {
		
		System.out.println("Save the contact details");
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("searching for the First name and Last Name returns the contact successfully")
	public void searching_for_the_First_name_and_Last_Name_returns_the_contact_successfully() {
		
		System.out.println("searching for the First name and Last Name returns the contact successfully");
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	/**
	public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
	    byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));

	    System.out.println(generatedString);
	}
	**/
	
	
	
	public String givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect() {
	 
	    int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = false;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

	    System.out.println(generatedString);
	    return generatedString;
	}
	
	
	
}
