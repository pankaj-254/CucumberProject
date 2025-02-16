package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/test/resources/Features",
		glue = {"StepDefination"},
		monochrome = true ,
//		plugin = {"pretty", "json:target/JSONReports/report.json"}, // for json format
//		plugin = {"pretty", "html:target/HTMLreports/report.html"},// for html format
//		plugin = {"pretty", "junit:target/JUnitReports/report.xml"}, // for XML format
		plugin = {"pretty","json:target/JSONReports/report.json","html:target/HTMLreports/report.html" ,"junit:target/JUnitReports/report.xml"}, // for XML format

//		tags = "@googleSearch" 
//		tags = "@SmokeTest"
		
		tags = "@POMwithDataTable"
		)
public class TestRunner  
{
	

}
