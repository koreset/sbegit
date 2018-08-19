package za.co.nedbank.nedbanksbe;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/output.json"},
        monochrome = true

)
public class RunCucumberTest {
}