package com.user.service.services.impl;
import com.user.service.entities.User;
import com.user.service.exceptions.ResourceNotFoundException;
import com.user.service.repositories.UserRepositories;
import com.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositories userRepositories;

    @Override
    public User saveUser(User user) {
        //generate unique user id in string
        String randomUserId=UUID.randomUUID().toString();
        user.setUserID(randomUserId);
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepositories.findAll();
    }

    @Override
    public User gerUser(String userId) {
        return userRepositories.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server !! :"+userId));
    }
}
