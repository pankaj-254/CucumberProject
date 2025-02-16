package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
//		features="src/test/resources/FeaturesWithTags",
//		glue = {"StepDefination"},
		
		features = "src/test/resources/HooksDemo" ,
		glue = {"StepDefination"},
		
		
		monochrome = true ,
//		plugin = {"pretty", "json:target/JSONReports/report.json"}, // for json format
//		plugin = {"pretty", "html:target/HTMLreports/report.html"},// for html format
//		plugin = {"pretty", "junit:target/JUnitReports/report.xml"}, // for XML format
		plugin = {"pretty","json:target/JSONReports/report.json",
							"html:target/HTMLreports/report.html", 
							"junit:target/JUnitReports/report.xml"} // for XML format

//		tags  = "@Smoke" //test will run for only this tag 
//		tags  = "@Smoke or @regression"   //test will run for those scenarios or feature who have any of the tags
//		tags  = "@Smoke and @regression"  //test will run for those scenarios or feature who have both the tags
//		tags = "@Smoke or @regression and @important"
		
//		tags = "(@Smoke or @regression) and @important"
//		tags = "@Smoke or @regression or not @important "
//		tags = "@mustRun"
		)
public class TestRunner_RunWithSingleTag  
{
	

}
