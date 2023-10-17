package testRunner;
import cucumber. api.*;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {""}, glue= {""},
		
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		plugin= {
				"html;target/cucumber-reports"
				},
				tags= "@task"
		)
public class Runner {

}
