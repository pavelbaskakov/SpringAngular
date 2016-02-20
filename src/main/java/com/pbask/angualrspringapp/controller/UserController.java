package com.pbask.angualrspringapp.controller;


import com.pbask.angualrspringapp.beans.User;
import com.pbask.angualrspringapp.dao.UserDao;
import com.pbask.angualrspringapp.daoentities.UsersEntity;
import com.pbask.angualrspringapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Pavel on 11.02.2016.
 */

@Controller
@RequestMapping("/cars")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    private UserService userService; 

//    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
//    @ResponseBody
//    public List <String> hello() {
//        return userService.getAllUsers();
//    }

    @RequestMapping(value = "/userlist", method = RequestMethod.GET)
    public @ResponseBody List <User> getUserList() {
        return userDao.getAllUsers();
    }

    @RequestMapping(value = "/adduser/", method = RequestMethod.POST)
    public @ResponseBody void addUser(@RequestBody UsersEntity user) {
        userDao.addUser(user);
    }

    @RequestMapping("/layout")
    public String getCarPartialPage() {
        return "cars/layout";
    }
}
