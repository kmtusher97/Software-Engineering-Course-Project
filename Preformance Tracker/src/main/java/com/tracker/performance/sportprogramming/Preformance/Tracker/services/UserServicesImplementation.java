package com.tracker.performance.sportprogramming.Preformance.Tracker.services;


import com.tracker.performance.sportprogramming.Preformance.Tracker.model.User;
import com.tracker.performance.sportprogramming.Preformance.Tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServicesImplementation implements UserServices {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean isAdmin(Long userId) {
        return userId == 1001;
    }
}
