package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by Thinkpad on 2018/10/21.
 */
@Component
public interface UserDAO {
    User getUserById(long id);
    long saveUser(User user);
    void updateUser(User user);
}
