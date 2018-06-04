package com.bookstore.Repository;

import com.bookstore.Entity.Cart;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends CrudRepository<Cart, Long> {
    List<Cart> findCartsByUser(int user);
}