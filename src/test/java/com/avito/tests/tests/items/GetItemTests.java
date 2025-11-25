package com.avito.tests.tests.items;

import com.avito.tests.BaseTest;
import com.avito.tests.client.ItemApi;
import com.avito.tests.model.ItemRequest;
import com.avito.tests.model.Statistics;
import com.avito.tests.util.TestData;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetItemTests extends BaseTest {

    private final ItemApi api = new ItemApi();

    @Test
    void getExistingItem() {
        String id = "1fc77cea-3be2-4922-85a5-3113ec0535e9";

        Response resp = api.getItem(id);

        assertEquals(200, resp.statusCode());
    }

    @Test
    void getNotExistingItem() {
        Response resp = api.getItem("non-existing-id");
        assertEquals(400, resp.statusCode());
    }

    @Test
    void getItemsForSeller() {
        int seller = TestData.randomSellerId();
        api.createItem(new ItemRequest(seller, "A", 10, new Statistics(1,1,1)));
        api.createItem(new ItemRequest(seller, "B", 20, new Statistics(2,2,2)));

        Response resp = api.getItemsBySeller(seller);

        assertEquals(200, resp.statusCode());
        assertTrue(resp.jsonPath().getList("$").size() >= 2);
    }

}
