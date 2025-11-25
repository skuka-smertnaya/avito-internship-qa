package com.avito.tests.tests.items;

import com.avito.tests.client.ItemApi;
import com.avito.tests.model.ItemRequest;
import com.avito.tests.util.TestData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteItemTests {
    private final ItemApi api = new ItemApi();

    @Test
    void deleteItem() {
        ItemRequest req = TestData.validItem();
        String id = api.createItem(req).jsonPath().getString("id");

        Response del = api.deleteItem(id);
        assertEquals(200, del.statusCode());

        Response get = api.getItem(id);
        assertEquals(404, get.statusCode());
    }

}
