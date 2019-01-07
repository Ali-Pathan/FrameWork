package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/rajive/Documents/Automation/workspace/TestCucumber/Feature/login.feature",
		glue={"StepDefinitions"},
		//format= {"pretty"},
		plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"}
)


public class TestRunner {

}
