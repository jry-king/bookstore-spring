package com.bookstore.ServiceImplement;

import com.bookstore.Entity.OrderItem;
import com.bookstore.Repository.OrderItemRepository;
import com.bookstore.Service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImplement implements OrderItemService{
    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> findOrderItemsByOrderid(Long orderid)
    {
        return orderItemRepository.findOrderItemsByOrderid(orderid);
    }

    public void addNewItem(Long orderid, String book, double price, int number)
    {
        OrderItem neworderitem = new OrderItem();
        neworderitem.setOrderId(orderid);
        neworderitem.setBook(book);
        neworderitem.setPrice(price);
        neworderitem.setNumber(number);
        orderItemRepository.save(neworderitem);
        return;
    }
}
