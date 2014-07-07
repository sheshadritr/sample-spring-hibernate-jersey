package com.hashedin.service;

import java.util.List;

import com.hashedin.model.User;

public interface UserService {

    User find(Long userId);
    List<User> findAll();
    User save(User user);
    User update(User user, Long userId);
    User delete(Long userId);
}
