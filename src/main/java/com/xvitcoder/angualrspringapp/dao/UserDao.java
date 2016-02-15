package com.xvitcoder.angualrspringapp.dao;

import com.xvitcoder.angualrspringapp.beans.User;

import java.util.List;

/**
 * Created by Pavel on 15.02.2016.
 */
public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
}
