package com.project.uniqueusers.service;

import com.project.uniqueusers.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {

private  UserService userService;

@BeforeEach
public  void setUp(){
    userService=new UserService();
}

@Test
public void testUniqueUsers(){
    List<User> response = userService.getAllUniqueUsers(buildUsersData());
    Assertions.assertEquals(2 , response.size());

}

    private List<User> buildUsersData() {
        User user1 = new User("Rama", "dev", "emp");
        User user2 = new User("Magna","hr", "emp");
        User user3 = new User("Rama","dev", "emp");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }

}
