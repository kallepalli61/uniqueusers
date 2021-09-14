package com.project.uniqueusers.controller;

import com.project.uniqueusers.model.User;
import com.project.uniqueusers.model.UserRequest;
import com.project.uniqueusers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/unique/users")
    public List<User> add(@RequestBody UserRequest userRequest) {
       List<User> usersList= new ArrayList<>();
        usersList.addAll(userRequest.getUsersList1());
        usersList.addAll(userRequest.getUsersList2());
        return userService.getAllUsers(usersList);

    }

}
