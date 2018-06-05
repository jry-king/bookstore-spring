package com.bookstore.Controller;

import com.bookstore.Entity.Book;
import com.bookstore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooklistController {
    @Autowired
    private BookService bookService;

    @GetMapping("/Booklist")
    @ResponseBody
    public List<Book> getBook()
    {
        List<Book> res = bookService.findAll();
        return res;
    }
}
