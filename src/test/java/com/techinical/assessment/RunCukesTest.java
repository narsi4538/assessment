package com.techinical.assessment;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        strict = true,
        plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"
        }
)
public class RunCukesTest {

    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = System.getProperty("uri") == null ? "http://bpdts-test-app-v2.herokuapp.com/" : System.getProperty("uri");
    }
}
