package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.Optional;
import java.util.Set;

public interface UserService {

    void add(User user);

    void update(User user);

    void delete(Long id);

    Set<User> getAllUsers();

    Optional<User> findByLogin(String login);
}
