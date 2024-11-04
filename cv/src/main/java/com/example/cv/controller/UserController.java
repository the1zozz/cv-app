package com.example.cv.controller;

import com.example.cv.model.User;
import com.example.cv.servicesImplemention.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cv")
public class UserController {
    @Autowired
    private UserServicesImpl services ;


    @GetMapping("/users")
    public List<User> showAllUsers(){
        return services.showALL();
    }
    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return services.getUserById(id) ;
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        services.addUser(user);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        services.deleteUser(id);
    }
}
