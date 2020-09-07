package com.techinical.assessment.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ServicesHelper {

    private Response response;

    public void getRequest(String endpoint) {
        setResponse(
                given().contentType(ContentType.JSON).
                        when()
                        .log().ifValidationFails()
                        .get(RestAssured.baseURI + endpoint));
    }

    public Response getResponse() {
        return response;
    }

    /**
     * Set the response after API CRUD operations
     *
     * @param response
     */
    private void setResponse(Response response) {
        this.response = response;
    }
}
