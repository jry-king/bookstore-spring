package com.bookstore.ServiceImplement;

import com.bookstore.Entity.Cart;
import com.bookstore.Repository.CartRepository;
import com.bookstore.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class CartServiceImplement implements CartService{
    @Autowired
    private CartRepository cartRepository;

    public List<Cart> findCartsByUser(int user)
    {
        return cartRepository.findCartsByUser(user);
    }

    public void addNewBook(int userid, String book, double price, int number)
    {
        Cart newcart = new Cart();
        newcart.setUser(userid);
        newcart.setBook(book);
        newcart.setPrice(price);
        newcart.setNumber(1);
        cartRepository.save(newcart);
        return;
    }

    public boolean addExistingBook(String book)
    {
        List<Cart> res = cartRepository.findCartsByUser(1);
        Iterator<Cart> it = res.iterator();
        while(it.hasNext())
        {
            Cart cart = it.next();
            if(book.equals(cart.getBook()))
            {
                int number = cart.getNumber() + 1;
                cart.setNumber(number);
                cartRepository.save(cart);
                return true;
            }
        }
        return false;
    }

    public void deleteAll()
    {
        cartRepository.deleteAll();
        return;
    }
}
