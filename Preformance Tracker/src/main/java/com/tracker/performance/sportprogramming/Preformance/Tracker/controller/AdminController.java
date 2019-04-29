package com.tracker.performance.sportprogramming.Preformance.Tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @GetMapping(value = "/home")
    public ModelAndView adminHome() {
        ModelAndView adminHomeModelAndView = new ModelAndView("AdminHome");

        return adminHomeModelAndView;
    }
}
