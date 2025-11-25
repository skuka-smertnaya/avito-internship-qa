package com.avito.tests.client;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiClient {
    public Response post(String path, Object body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .post(path)
                .thenReturn();
    }
    public Response get(String path) {
        return given()
                .get(path)
                .thenReturn();
    }

    public Response delete(String path) {
        return given()
                .delete(path)
                .thenReturn();
    }
}
