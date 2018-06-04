package com.bookstore.Controller;

import com.bookstore.Entity.Book;
import com.bookstore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooklistController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/Booklist")
    @ResponseBody
    public List<Book> getBook()
    {
        List<Book> res = bookRepository.findAll();
        return res;
    }
}
