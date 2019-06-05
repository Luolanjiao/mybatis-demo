package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Thinkpad on 2018/10/21.
 */
@Service
public class UserServiceImpl implements UserService {
   @Autowired
    private UserDAO userDAO;
    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }
    @Override
    public long saveUser(User user){
      return userDAO.saveUser(user);
    }
    @Override
    public void updateUser(User user){
        userDAO.updateUser(user);
    }
}
