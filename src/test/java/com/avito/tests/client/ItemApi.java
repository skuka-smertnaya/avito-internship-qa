package com.avito.tests.client;

import io.restassured.response.Response;

public class ItemApi {

    private final ApiClient client = new ApiClient();

    public Response createItem(Object body) {
        return client.post("/api/1/item", body);
    }

    public Response getItem(String id) {
        return client.get("/api/1/item/" + id);
    }

    public Response getItemsBySeller(int sellerId) {
        return client.get("/api/1/" + sellerId + "/item");
    }

    public Response getStatistic(String id) {
        return client.get("/api/1/statistic/" + id);
    }

    public Response deleteItem(String id) {
        return client.delete("/api/2/item/" + id);
    }
}
