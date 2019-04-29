package com.tracker.performance.sportprogramming.Preformance.Tracker.validator;


import com.tracker.performance.sportprogramming.Preformance.Tracker.model.User;

public class UserDataValidator {

    public boolean matchPasswordAndConfirmedPassword(User user) {
        return user.getPassword().equals(user.getConfirmedPassword());
    }
}
