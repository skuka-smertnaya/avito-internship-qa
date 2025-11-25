package com.avito.tests.tests.items;

import com.avito.tests.client.ItemApi;
import com.avito.tests.model.ItemRequest;
import com.avito.tests.util.TestData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetStatisticTests {

    private final ItemApi api = new ItemApi();

    @Test
    void getStatisticsForItem() {
        ItemRequest req = TestData.validItem();
        String id = "1fc77cea-3be2-4922-85a5-3113ec0535e9";

        Response resp = api.getStatistic(id);

        assertNotEquals(400, resp.statusCode());
    }

}
