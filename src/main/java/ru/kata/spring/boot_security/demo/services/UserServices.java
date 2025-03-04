package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserServices {

    User saveUser(User user);

    User updateUser(User user, Long userId);

    List<User> userList();

    User show(Long userId);

    User showByEmail(String email);

    void deleteUserById(Long userId);
}
