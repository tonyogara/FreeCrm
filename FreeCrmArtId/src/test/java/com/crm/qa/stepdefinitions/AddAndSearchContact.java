package com.crm.qa.stepdefinitions;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	String firstName = new String();
	String surName = new String();
	
	
	
	
	public AddAndSearchContact()
	{
		super(prop);
	}
	
	
	@Given("I am on the Contacts page")
	public void i_am_on_the_Contacts_page() {
	  super.initialization();  
	  try {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//Check you are on the Contacts page
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	    
	}

	
	@When("I select the Create button")
	public void i_select_the_Create_button() {
		
		System.out.println("Start two");
		contactsPage = homePage.selectContactsPage();
	
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("End two");
	   // throw new cucumber.api.PendingException();
	}

	@When("Enter the First Name and Last Name")
	public void enter_the_First_Name_and_Last_Name() {
		
		//need to generate random string for fname
		firstName = this.givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect();
		//need to generate random string for sname
		surName = givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect();
		
		contactsPage.createContact(firstName, surName);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Save the contact details")
	public void save_the_contact_details() {
		
		System.out.println("Save the contact details");
	    
		
		
		
	}

	@Then("searching for the First name and Last Name returns the contact successfully")
	public void searching_for_the_First_name_and_Last_Name_returns_the_contact_successfully() {
		
		System.out.println("searching for the First name and Last Name returns the contact successfully");
		//body/div[@id='ui']/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]
		WebElement searchBox = driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));
		searchBox.sendKeys(firstName);
		searchBox.click();
		
		
		//tbody/tr[1]/td[2]
		///////NEED TO WAIT FOR ELEMENT TO BE DISPLAYED
		String searchResult = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]
		String searchResult2 = driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]")).getText();
		
		
		System.out.println(searchResult2);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
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
