package com.project.uniqueusers.model;

import java.util.List;

public class UserRequest {
    List<User> usersList1;
    List<User> usersList2;

    public List<User> getUsersList1() {
        return usersList1;
    }

    public void setUsersList1(List<User> usersList1) {
        this.usersList1 = usersList1;
    }

    public List<User> getUsersList2() {
        return usersList2;
    }

    public void setUsersList2(List<User> usersList2) {
        this.usersList2 = usersList2;
    }
}
