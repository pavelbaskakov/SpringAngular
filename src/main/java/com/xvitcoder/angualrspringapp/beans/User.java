package com.xvitcoder.angualrspringapp.beans;

/**
 * Created by Pavel on 10.02.2016.
 */
public class User {
    private String name;
    public User(){};
    public User(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
