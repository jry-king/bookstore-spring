package com.bookstore.ServiceImplement;

import com.bookstore.Entity.BookCover;
import com.bookstore.Repository.BookCoverRepository;
import com.bookstore.Service.BookCoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCoverServiceImplement implements BookCoverService{
    @Autowired
    private BookCoverRepository bookCoverRepository;

    public BookCover findByBookid(int bookid) {
        return bookCoverRepository.findByBookid(bookid);
    }

    public void addNewCover(int bookid, String cover)
    {
        BookCover newcover = new BookCover(bookid, cover);
        bookCoverRepository.save(newcover);
        return;
    }
}
