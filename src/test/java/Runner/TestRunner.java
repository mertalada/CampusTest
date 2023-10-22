package Runner;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //İstenilen test ler tag in içine yazılabilir.
        tags = "@Smoke",
        features = {"src/test/java/FeaturesFile"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
