package com.techinical.assessment.steps;

import com.techinical.assessment.services.ServicesHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Steps {

    private ServicesHelper service = new ServicesHelper();
//
//    public Steps(ServicesHelper service) {
//        service = service;
//    }


    @When("^I execute the get method on endpoint \"([^\"]*)\"$")
    public void i_execute_the_get_method_on_endpoint(String endpoint) {
        service.getRequest(endpoint);
    }

    @Then("^I should validate the status (\\d+)$")
    public void i_should_validate_the_status(int expectedStatus) {
        assertThat(service.getResponse().getStatusCode(), is(expectedStatus));
    }

    @Then("^I should see the empty response$")
    public void i_should_see_the_empty_response() {
        assertThat(service.getResponse().getBody().jsonPath().getList("."), is(empty()));
    }

    @Then("^I should see the response$")
    public void i_should_see_the_response() {
        JsonPath responseBody = service.getResponse().getBody().jsonPath();
        assertThat(responseBody, is(notNullValue()));
    }

    @And("^I should see the response id with (\\d+)$")
    public void iShouldSeeTheResponseIdWith(int id) {
        int responseBody = service.getResponse().getBody().jsonPath().get("id");
        assertThat(responseBody, is(id));
    }
}
