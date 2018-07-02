package com.bookstore.ServiceImplement;

import com.bookstore.Entity.Book;
import com.bookstore.Service.BookService;
import com.bookstore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplement implements BookService{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll()
    {
        return bookRepository.findAll();
    }
}
