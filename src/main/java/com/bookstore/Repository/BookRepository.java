package com.bookstore.Repository;

import com.bookstore.Entity.Book;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
