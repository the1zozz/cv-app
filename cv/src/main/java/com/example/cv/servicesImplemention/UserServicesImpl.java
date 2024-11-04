package com.example.cv.servicesImplemention;

import com.example.cv.model.User;
import com.example.cv.repository.UserRepository;
import com.example.cv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserService {
    @Autowired
    private UserRepository userRepo ;

    @Override
    public List<User> showALL() {
       return userRepo.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user) ;
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepo.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
       return userRepo.findById(id);

    }
}
