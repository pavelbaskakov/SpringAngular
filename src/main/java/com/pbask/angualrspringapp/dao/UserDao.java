package com.pbask.angualrspringapp.dao;

import com.pbask.angualrspringapp.beans.User;
import com.pbask.angualrspringapp.daoentities.UsersEntity;

import java.util.List;

/**
 * Created by Pavel on 15.02.2016.
 */
public interface UserDao {
    List<User> getAllUsers();
    void addUser(UsersEntity user);
}
