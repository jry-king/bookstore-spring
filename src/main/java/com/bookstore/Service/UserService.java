package com.bookstore.Service;

import com.bookstore.Entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findUserById(Long userid);

    void addNewUser(String username, String password, String email, String phone);

    void deleteAll();
}
