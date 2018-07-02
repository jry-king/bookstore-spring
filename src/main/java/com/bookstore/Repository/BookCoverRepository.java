package com.bookstore.Repository;

import com.bookstore.Entity.BookCover;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookCoverRepository extends MongoRepository<BookCover, String> {
    public BookCover findByBookid(int bookid);
}
