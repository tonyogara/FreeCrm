package com.crm.qa.stepdefinitions;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/crm/qa/features"
		,glue={"stepdefinitions"} 
		//,glue={"src/test/java/com/crm/qa/stepdefinitions"}
		,plugin = {"pretty","json:target/json/report.json"})

public class TestRunner {

}
