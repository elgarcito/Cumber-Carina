package com.solvd.carina_cucumber_example;

import com.zebrunner.carina.cucumber.CucumberBaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Login.feature",
        glue = "src/main/java/com/solvd/carina_cucumber_example/cucumber/Steps.java",
        plugin = {"pretty",
                "html:target/cucumber-core-test-report",
                "pretty:target/cucumber-core-test-report.txt",
                "json:target/cucumber-core-test-report.json",
                "junit:target/cucumber-core-test-report.xml"}
)
public class CucumberMyTest extends CucumberBaseTest {}
