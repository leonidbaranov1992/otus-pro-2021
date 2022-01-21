package com.otus.cucumber.lesson1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/lesson1", "src/test/resources/feature2"},
        tags = "@FirstScenario",
        plugin = {"html:target/cucumber/html", "json:target/cucumber/json/cucumber.json", "pretty"},
        monochrome = true,
        glue = {"com.otus.cucumber.lesson1"}

)
public class CucumberTest {
}
