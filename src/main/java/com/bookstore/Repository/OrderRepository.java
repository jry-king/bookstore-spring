package com.bookstore.Repository;

import com.bookstore.Entity.Order;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findAll();
}
