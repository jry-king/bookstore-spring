package com.bookstore.Controller;

import com.bookstore.Entity.User;
import com.bookstore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/UserManager")
    @ResponseBody
    public List<User> getBook()
    {
        List<User> res = userRepository.findAll();
        return res;
    }

    @PostMapping("/UserManager")
    @ResponseBody
    public String setcart(@RequestParam("username")String username, @RequestParam("password")String password, @RequestParam("email")String email, @RequestParam("phone")String phone)
    {
        User result = new User();
        result.setUsername(username);
        result.setEmail(email);
        result.setPassword(password);
        result.setPhone(phone);
        result.setRole("customer");
        userRepository.save(result);
        return "success";
    }
}
