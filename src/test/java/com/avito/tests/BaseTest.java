package com.avito.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void setup(){
        RestAssured.baseURI = "https://qa-internship.avito.com";
    }
}
