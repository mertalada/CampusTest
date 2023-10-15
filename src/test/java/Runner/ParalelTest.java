package Runner;

import Utilities.DriverCenter;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class ParalelTest {

    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserName)
    {
        DriverCenter.threadBrowserName.set(browserName);
    }

    @AfterClass
    public  static void writeExtentReport(){

    }

}
