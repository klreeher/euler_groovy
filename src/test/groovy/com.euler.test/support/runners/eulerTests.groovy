package com.euler.test.support.runners

import cucumber.api.CucumberOptions
import cucumber.api.testng.AbstractTestNGCucumberTests
import org.testng.ITestContext
import org.testng.annotations.BeforeSuite

@CucumberOptions(
        monochrome = true,
        dryRun = false,
        features = "src/test/groovy/com.euler.test/feature",
        tags = "@euler",
        glue = ["src/test/groovy/com.euler.test/steps", "src/test/groovy/com.euler.test/support"],
        plugin = ['pretty']
)

class EulerTests extends AbstractTestNGCucumberTests {

    @BeforeSuite
    beforetestexecution(ITestContext arg0) {
        println('euler project: KLREEHER')
    }
}
