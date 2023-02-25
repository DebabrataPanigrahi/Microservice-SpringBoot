package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {
    //user oporation
    //Create user
    User saveUser(User user);
    //get all user
    List<User> getAllUser();
    //get single user of given userID
    User gerUser(String userId);

}
