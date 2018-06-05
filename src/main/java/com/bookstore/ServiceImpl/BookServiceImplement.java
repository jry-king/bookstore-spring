package com.bookstore.ServiceImpl;

import com.bookstore.Entity.Book;
import com.bookstore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplement implements com.bookstore.Service.BookService{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll()
    {
        return bookRepository.findAll();
    }
}
