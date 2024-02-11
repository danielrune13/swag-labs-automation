package org.hashiro.maven.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
        glue = {"org.hashiro.maven.stepdefs"},
        tags = "@UI"
)
public class TestSuite {}
