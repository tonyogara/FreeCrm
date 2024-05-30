#Author: tony.ogara@
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add a Contact and search for a Contact
  I want to use this template for my feature file

  #@Working_On
  Scenario: Add a Contact and search for a Contact
    Given I am on the Contacts page
    When I select the Create button
    And Enter the First Name and Last Name 
    And Save the contact details 
    Then searching for the First name and Last Name returns the contact successfully