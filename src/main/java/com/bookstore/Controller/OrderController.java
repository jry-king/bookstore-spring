package com.bookstore.Controller;

import com.bookstore.Entity.Order;
import com.bookstore.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/OrderManager")
    @ResponseBody
    public List<Order> getOrder()
    {
        List<Order> result = orderService.findAll();
        return result;
    }

    @PostMapping("/OrderManager")
    @ResponseBody
    public String addOrder(@RequestParam("userid")int userid, @RequestParam("date")String date, @RequestParam("totalprice")double totalprice)
    {
        orderService.addNewOrder(userid, date, totalprice);
        return "success";
    }
}
