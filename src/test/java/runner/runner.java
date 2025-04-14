package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureFiles",
        glue = "stepDefinition",
        //

       // dryRun = true,
      //  monochrome = true,
        //strict = true,
        //

        //tags = "@PasswordHidden",
        plugin = {"pretty", "json:target/cucumber-reports/CucumberTestReport5.json",
                "html:target/cucumber-reports/CucumberHtmlReport.html"
        })


public class runner {
}
