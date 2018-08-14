import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utilities.WebConnector;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber" },tags = {"@run"}) 



public class AsdaRunner extends WebConnector{
	
}
