package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //this line will force this class to run with Cucumber
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
     features = "src/test/resources/features",
     glue = "step_def",
     tags = "@forgotPasswordOHRM",
     dryRun = true
)
public class CukesRunner {



}
