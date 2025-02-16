package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "src/test/resources/HooksDemo/HooksDemo.feature" ,
//		glue = {"StepDefination"},
		
		features = "src/test/resources/BackgroundDemo/BackgroundDemo.feature", 
		glue = {"StepForBackGround"},
	
		monochrome = true, 
		plugin = { "pretty", "json:target/JSONReports/report.json",
							 "html:target/HTMLReports/report.html",
							 "junit:target/JUnitReports/report.xml" }
//		plugin = {"pretty"},
//		,tags ="@test"
		)




public class TestRunnerForBackGroundDemo {

}
