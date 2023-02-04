package Support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="Definitions",
        tags = "@test",
        plugin = {"json:target/cucumber-report/cucumber.json","html:target/cucumber-report/cucumber.html"}
)
public class runTest {
}
