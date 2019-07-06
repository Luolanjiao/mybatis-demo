package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;

/**
 * Created by luolanjiao on 2018/10/21.
 *
 * @author luolanjiao
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable(name = "id") long id) {
        return userServiceImpl.getUserById(id);
    }

    @ResponseBody
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public User saveUser(@ModelAttribute User user) {
        long userId = userServiceImpl.saveUser(user);
        return user;
    }
}