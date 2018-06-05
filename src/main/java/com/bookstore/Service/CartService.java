package com.bookstore.Service;

import com.bookstore.Entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findCartsByUser(int user);

    void addNewBook(int userid, String book, double price, int number);

    boolean addExistingBook(String book);

    void deleteAll();
}
