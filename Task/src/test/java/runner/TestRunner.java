package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "./src/test/resources/Features/Login.feature",
		glue = "stepDefinition",
		dryRun = false,
		monochrome = true, 
		plugin = {"html:HTML_OP/op.htlm", "junit:JUNIT_OP/op.xml", "json:JSON_OP/op.json"}
	)


public class TestRunner {
	
	

}
