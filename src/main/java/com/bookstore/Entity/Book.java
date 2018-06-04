package com.bookstore.Entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="bookid")
    private Long id;

    @Column(name="bookname")
    private String bookname;

    @Column(name="author")
    private String author;

    @Column(name="booklanguage")
    private String language;

    @Column(name="published")
    private String published;

    @Column(name="sales")
    private String sales;

    @Column(name="price")
    private double price;

    public Book(){}

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
