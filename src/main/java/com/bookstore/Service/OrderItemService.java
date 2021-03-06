package com.bookstore.Service;

import com.bookstore.Entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    List<OrderItem> findOrderItemsByOrderid(Long orderid);

    void addNewItem(Long orderid, String book, double price, int number);
}
