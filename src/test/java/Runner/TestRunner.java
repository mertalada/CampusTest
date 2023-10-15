package Runner;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
// aşağıdaki bütün testlerden @SmokeTest tag i olanları çalıştır. Tag kısmını kaldırdığımızda hepsi çalışır.
        tags = "@Smoke",
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}//rapor

)

public class TestRunner extends AbstractTestNGCucumberTests {
}
