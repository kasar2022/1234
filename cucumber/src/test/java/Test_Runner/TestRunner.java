package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\hp\\eclipse-workspace\\cucumber\\src\\test\\java\\Feature\\Login2Features.feature",
		glue= {"stepDefinations"},
//		dryRun=false,
//		monochrome=true,
	plugin= {"pretty","html:test-output"}
//		
		)


public class TestRunner {

	
}
