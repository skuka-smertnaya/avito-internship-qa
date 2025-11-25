package com.avito.tests.model;

public class ItemRequest {
    public int sellerID;
    public String name;
    public int price;
    public Statistics statistics;

    public ItemRequest(int sellerID, String name, int price, Statistics statistics) {
        this.sellerID = sellerID;
        this.name = name;
        this.price = price;
        this.statistics = statistics;
    }
}
