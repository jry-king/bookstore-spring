package com.bookstore.ServiceImplement;

import com.bookstore.Entity.Order;
import com.bookstore.Service.OrderService;
import com.bookstore.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplement implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll()
    {
        return orderRepository.findAll();
    }

    public void addNewOrder(int userid, String date, double totalprice)
    {
        Order neworder = new Order();
        neworder.setUser(userid);
        neworder.setDate(date);
        neworder.setTotalPrice(totalprice);
        orderRepository.save(neworder);
        return;
    };
}