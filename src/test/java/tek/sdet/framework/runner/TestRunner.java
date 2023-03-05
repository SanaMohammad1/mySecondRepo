package tek.sdet.framework.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@smokeTest",
		features = ("classpath:features"),
		glue = "tek.sdet.framework",
		//check missing steps with stepDef and feature file
		dryRun =false, // after done with dry run set the value to false
		plugin = {
				"pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"
		},
		snippets = CAMELCASE, // public void clickOnLoginButton  public void click_On_Login_Button
		monochrome = true// to make the cnsole readable/false not readable
		
		)// in feature file on top of any scenario we provide @test annotation, will run only that scenario


public class TestRunner {

}
//