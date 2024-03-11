package com.fedoseev.marketplace;

public class Order {
    int id;
    int product_id;
    int count_product;
    String date;
    Order (int _id, int _product_id, int _count_product, String _date){
        id = _id;
        product_id = _product_id;
        count_product = _count_product;
        date = _date;
    }
}
