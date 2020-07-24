package stepdefinitions;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin  = { "pretty", "json:target/cucumber-reports/Cucumber.json",
						 "junit:target/cucumber-reports/Cucumber.xml",
						 "html:target/cucumber-reports"},
        monochrome =true,
        features = "src/test/resources/features/GENXolair/GENXolair_OrderAPI_Positive_Test.feature"

)
public class TestSuiteRunner {}
