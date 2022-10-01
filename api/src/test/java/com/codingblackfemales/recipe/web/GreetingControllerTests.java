package com.codingblackfemales.recipe.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@DisplayName("The greeting controller should")
public class GreetingControllerTests {

    private static final String GREETING_ENDPOINT = "/greeting";

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("return Hello World!")
    void receivesGreetingRequests() {
        final ResponseEntity<String> response = restTemplate.getForEntity(GREETING_ENDPOINT, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("Hello World!");
    }
}
