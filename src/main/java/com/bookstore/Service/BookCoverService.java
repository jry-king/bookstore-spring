package com.bookstore.Service;

import com.bookstore.Entity.BookCover;

public interface BookCoverService {
    BookCover findByBookid(int bookid);
    void addNewCover(int bookid, String cover);
}
