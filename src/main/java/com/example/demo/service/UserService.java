package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Thinkpad on 2018/10/21.
 */

public interface UserService {
    User getUserById(long id);
    long saveUser(User user);
    void updateUser(User user);
}
