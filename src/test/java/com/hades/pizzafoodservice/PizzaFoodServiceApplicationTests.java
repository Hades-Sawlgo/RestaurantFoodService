package com.hades.pizzafoodservice;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.hades.pizzafoodservice.models.User;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PizzaFoodServiceApplicationTests {

    @RegisterExtension
    static WireMockExtension wm1 = WireMockExtension.newInstance()
            .options(wireMockConfig().dynamicPort().port(8080))
            .configureStaticDsl(true)
            .build();

    @BeforeAll
    public static void initializeValues() {
        ResponseDefinitionBuilder mockResponse = new ResponseDefinitionBuilder();
        mockResponse.withStatus(201);
    }


    @Test
    void coverageTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        User user = new User("John","Murphy", 56, 120000, localDateTime);
        user.setAge(66);
        assertEquals(66, user.getAge());
    }

    @Test
    void wiremockTest() {
        stubFor(get("/test").willReturn(aResponse().withStatus(201).withBody("Hello World!")));
        Response response = RestAssured.given().get("http://localhost:8080/test").then().statusCode(201).extract().response();

        assertThat(response.getStatusCode(), CoreMatchers.is(CoreMatchers.equalTo(201)));
        assertThat(response.getBody().prettyPrint(), CoreMatchers.is("Hello World!"));

    }

}
