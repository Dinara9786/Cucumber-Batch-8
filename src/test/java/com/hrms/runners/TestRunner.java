package com.hrms.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // we need to give a path for our feature file
        glue = "com/hrms/stepdefinitions",// we need to glue our step definitions- trying to connect all our implementation
        dryRun = false, // when set as TRUE, will run over the feature steps and reveal unimplemented steps in console
        tags = {"@pim"}, // adding tag
        strict = false, // when set as true it will run, but when finds unimplemented steps, it will fail
         plugin = {"pretty", // will print executed steps inside console
                 "html:target/cucumber-default-reports", // it will generate default html default report
                 "rerun:target/FailedTests.txt", // generates a txt file with failed tests only
                 "json:target/cucumber.json" // generates json reports

         }
)
public class TestRunner {
}
