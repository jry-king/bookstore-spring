package com.bookstore.Service;

import com.bookstore.Entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void addNewUser(String username, String password, String email, String phone);

    void deleteAll();
}
