package com.crm.qa.stepdefinitions;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//import io.cucumber.junit.Cucumber;

//import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "Feature"
		features = "src/test/java/com/crm/qa/features"
		,glue={"stepDefinition"}
		)

public class TestRunner {

}
