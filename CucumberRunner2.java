package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/login2.feature", 
				 glue = "steps",
				 monochrome = true,
				 publish = true)
public class CucumberRunner2 extends AbstractTestNGCucumberTests {

}

