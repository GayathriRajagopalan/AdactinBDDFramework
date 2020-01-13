package testRunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//features="C:\\Users\\gay3v\\eclipse-workspaceNew1\\adactinBDDframework\\src\\main\\java\\features",
		features="C:\\Users\\gay3v\\eclipse-workspaceNew1\\adactinBDDframework\\src\\main\\java\\features\\BookHotelPageMap.feature",
		glue= {"stepDefinitions"},
		
		dryRun=false, //without execution it displays if there is any mismatch in mapping
		monochrome=true,//displays the output in readability mode
		strict=true,//it will execute the tc and let us know if there is any mismatch in mapping
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
	//it will generate reports in html,xml,json format
	)

public class TestRunner {
	
	

}
