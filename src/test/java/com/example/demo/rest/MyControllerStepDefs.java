package com.example.demo.rest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@CucumberContextConfiguration
public class MyControllerStepDefs {

    @Autowired
    private TestRestTemplate restTemplate;

    private String response;

    @When("client calls {string}")
    public void client_calls(String path) {
        response = restTemplate.getForObject(path, String.class);
    }

    @Then("the response should be {string}")
    public void the_response_should_be(String expectedResponse) {
        assertEquals(expectedResponse, response);
    }
}
