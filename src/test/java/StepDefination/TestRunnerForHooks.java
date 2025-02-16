package StepDefination;

import org.junit.runner.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "src/test/resources/HooksDemo/HooksDemo.feature" ,
//		glue = {"StepDefination"},
		
		features = "src/test/resources/HooksDemo", 
		glue = {"StepsForHooks"},
	
		monochrome = true, 
		plugin = { "pretty", "json:target/JSONReports/report.json",
							 "html:target/HTMLReports/report.html",
							 "junit:target/JUnitReports/report.xml" }
//		plugin = {"pretty"},
//		,tags ="@test"
		)


public class TestRunnerForHooks {

}
