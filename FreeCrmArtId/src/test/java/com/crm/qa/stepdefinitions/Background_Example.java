package com.crm.qa.stepdefinitions;

import java.io.IOException;

import com.crm.qa.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background_Example extends TestBase {
	
	
	public Background_Example()
	{
		super(prop);
	}
	
	
	@Given("I am starting given")
	public void i_am_starting_given()
	{
		System.out.println("Background_Example This is in I am starting given");
	//    throw new cucumber.api.PendingException();
	}

	@When("I am starting when")
	public void i_am_starting_when() 
	{
		System.out.println("Background_Example This is in I am starting when");
	//    throw new cucumber.api.PendingException();
	}

	@Then("I am starting then")
	public void i_am_starting_then()
	{
		System.out.println("Background_Example This is in I am starting then");
	//    throw new cucumber.api.PendingException();
	}


}
