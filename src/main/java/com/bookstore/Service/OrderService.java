package com.bookstore.Service;

import com.bookstore.Entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();

    void addNewOrder(int userid, String date, double totalprice);
}
