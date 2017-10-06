package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by arianapaz on 10/5/17.
 */

@CucumberOptions(features = {"src/test/java/features"} , format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "StepDefinitions")

public class TestRunner extends AbstractTestNGCucumberTests {


}
