package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/test/resources/features/FirstFeature.feature"},
				glue="com.steps",
				monochrome = false,
				dryRun = false
				//tags = "@Smoke"
				)


public class RunnerFile extends AbstractTestNGCucumberTests{

}
