package com.bookstore.Controller;

import com.bookstore.Entity.OrderItem;
import com.bookstore.Service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @PostMapping("/OrderItemManager")
    @ResponseBody
    public String addItem(@RequestParam("orderid")int orderid, @RequestParam("book")String book, @RequestParam("price")double price, @RequestParam("number")int number)
    {
        orderItemService.addNewItem(orderid, book, price, number);
        return "success";
    }
}
