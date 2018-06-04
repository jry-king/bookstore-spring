package com.bookstore.Controller;

import com.bookstore.Entity.Cart;
import com.bookstore.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/CartManager")
    @ResponseBody
    public List<Cart> getCart()
    {
        List<Cart> res = cartRepository.findCartsByUser(1);
        return res;
    }

    @PostMapping("/CartManager")
    @ResponseBody
    public String printCart(@RequestParam("operation")String operation, @RequestParam("userid")int userid, @RequestParam("book")String book, @RequestParam("price")double price)
    {
        if(operation.equals("add"))
        {
            List<Cart> res = cartRepository.findCartsByUser(1);
            Iterator<Cart> it = res.iterator();
            boolean exist = false;
            while(it.hasNext())
            {
                Cart cart = it.next();
                if(book.equals(cart.getBook()))
                {
                    exist = true;
                    int number = cart.getNumber() + 1;
                    cart.setNumber(number);
                    cartRepository.save(cart);
                }
            }
            if(!exist)
            {
                Cart newcart = new Cart();
                newcart.setUser(userid);
                newcart.setBook(book);
                newcart.setPrice(price);
                newcart.setNumber(1);
                cartRepository.save(newcart);
            }
        }
        else if(operation.equals("removeall"))
        {
            cartRepository.deleteAll();
        }
        else
        {
            return "invalid operation";
        }
        return "success";
    }
}
