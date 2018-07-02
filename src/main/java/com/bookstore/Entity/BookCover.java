package com.bookstore.Entity;

import javax.persistence.*;

public class BookCover{

    @Id
    public String id;

    public int bookid;
    public String cover;

    public BookCover() {}

    public BookCover(int bookid, String cover) {
        this.bookid = bookid;
        this.cover = cover;
    }
}
