package com.tracker.performance.sportprogramming.Preformance.Tracker.services;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.User;

public interface UserServices {

    User findByEmail(String Email);

    boolean isAdmin(Long userId);
}
