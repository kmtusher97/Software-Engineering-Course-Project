package com.tracker.performance.sportprogramming.Preformance.Tracker.controller;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.User;
import com.tracker.performance.sportprogramming.Preformance.Tracker.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserServices userServices;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView userLogin() {
        ModelAndView loginModelAndView = new ModelAndView("Login");

        User user = new User();
        loginModelAndView.addObject("user", user);

        return loginModelAndView;
    }


    @PostMapping(value = "/authenticate")
    public ModelAndView authenticate(@ModelAttribute("user") User user) {
        User authenticatedUser = userServices.findByEmail(user.getEmail());

        /**
         * if now such user having the email
         * or
         */
        if(authenticatedUser == null || !authenticatedUser.getPassword().equals(user.getPassword())) {
            return new ModelAndView("redirect:/login");
        }

        if(userServices.isAdmin(authenticatedUser.getUserId())) {
            return new ModelAndView("redirect:/admin/home");
        }
        else {
            return new ModelAndView("redirect:/contestant/home");
        }
    }
}
