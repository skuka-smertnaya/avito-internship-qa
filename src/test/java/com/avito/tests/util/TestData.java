package com.avito.tests.util;

import com.avito.tests.model.ItemRequest;
import com.avito.tests.model.Statistics;

import java.util.concurrent.ThreadLocalRandom;

public class TestData {

    public static int randomSellerId() {
        return ThreadLocalRandom.current().nextInt(111111, 999999);
    }

    public static ItemRequest validItem() {
        return new ItemRequest(
                randomSellerId(),
                ""+System.currentTimeMillis(),
                100,
                new Statistics(5, 10, 1)
        );
    }
}
