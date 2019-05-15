package support.runners

import cucumber.api.CucumberOptions
import cucumber.api.testng.*
import org.testng.annotations.BeforeSuite

@CucumberOptions(
        monochrome = true,
        dryRun = false,
        features = "src/test/groovy/features/",
        tags = "@build",
        glue = ["src/test/groovy/steps", "src/test/groovy/support"]
)

class EulerSuite extends AbstractTestNGCucumberTests {

}