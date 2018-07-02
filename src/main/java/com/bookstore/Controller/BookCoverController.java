package com.bookstore.Controller;

import com.bookstore.Entity.BookCover;
import com.bookstore.Service.BookCoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookCoverController {
    @Autowired
    private BookCoverService bookCoverService;

    @GetMapping("/BookCover")
    @ResponseBody
    public BookCover getCover(int bookid)
    {
        return bookCoverService.findByBookid(bookid);
    }

    @PostMapping("/BookCover")
    @ResponseBody
    public String postCover(@RequestParam("bookid")int bookid, @RequestParam("cover")String cover)
    {
        bookCoverService.addNewCover(bookid, cover);
        return "success";
    }
}
