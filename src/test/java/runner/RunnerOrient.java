package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefile/openweb.feature" , glue = "StepDefinition", stepNotifications = true ,monochrome = false,dryRun = false
)

public class RunnerOrient {

}
