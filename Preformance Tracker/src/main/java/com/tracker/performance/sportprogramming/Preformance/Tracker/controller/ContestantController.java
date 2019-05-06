package com.tracker.performance.sportprogramming.Preformance.Tracker.controller;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.Contestant;
import com.tracker.performance.sportprogramming.Preformance.Tracker.services.ContestantServices;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(value = "/contestant")
public class ContestantController {

    @Autowired
    ContestantServices contestantServices;

    @GetMapping(value = "/home")
    public ModelAndView contestantHome() {
        ModelAndView contestantHomeModelAndView = new ModelAndView("ContestantHome");

        return contestantHomeModelAndView;
    }

    @GetMapping(value = "/ContestantRating")
    public ModelAndView viewAllContestantsRating() {
        ModelAndView modelAndView = new ModelAndView("ContestantRating");
        List<Contestant> contestantList = contestantServices.getAllContestants();

        // Contestant contestant1, contestant2;
        Collections.sort(contestantList, (contestant1, contestant2) -> {
            return (int) (contestant2.getRating() - contestant1.getRating());
        });

        modelAndView.addObject("contestantList", contestantList);
        return modelAndView;
    }

    @GetMapping(value = "/PerformanceStatistics")
    public ModelAndView viewPerformanceStatistics() {
        ModelAndView modelAndView = new ModelAndView("PerformanceStatistics");
        List<Contestant> contestantList = contestantServices.getAllContestants();
        Collections.sort(contestantList, (contestant1, contestant2) -> {
            return (int) (contestant2.getAccepted() - contestant1.getAccepted());
        });
        modelAndView.addObject("contestantList", contestantList);
        return modelAndView;
    }
}