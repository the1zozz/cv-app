package com.example.cv.services;

import com.example.cv.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    public  List<User> showALL();

    public void addUser(User user);

    public void deleteUser(Long id);


    void updateUser(User user);


    public Optional<User> getUserById(Long id) ;

}
