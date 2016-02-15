package com.xvitcoder.angualrspringapp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 10.02.2016.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
List <String> userList = new ArrayList();

    public void addUser(String userName) {
        userList.add(userName);
    }

    public List getAllUsers() {
        return userList;
    }
}
