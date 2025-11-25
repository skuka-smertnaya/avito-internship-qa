package com.avito.tests.tests.items;

import com.avito.tests.BaseTest;
import com.avito.tests.client.ItemApi;
import com.avito.tests.model.ItemRequest;
import com.avito.tests.util.TestData;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateItemTests extends BaseTest {

    private final ItemApi api = new ItemApi();

    @Test
    void createValidItem() {
        ItemRequest req = TestData.validItem();
        Response response = api.createItem(req);

        assertEquals(200, response.statusCode());
        assertNotNull(response.jsonPath().getString("id"));
    }

    @Test
    void createItemMissingName() {
        ItemRequest req = TestData.validItem();
        req.name = null;

        Response response = api.createItem(req);

        assertEquals(400, response.statusCode());
    }
}
