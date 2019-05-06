package com.tracker.performance.sportprogramming.Preformance.Tracker.controller;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.Contestant;
import com.tracker.performance.sportprogramming.Preformance.Tracker.model.User;
import com.tracker.performance.sportprogramming.Preformance.Tracker.services.ContestantServices;
import com.tracker.performance.sportprogramming.Preformance.Tracker.services.UserServices;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(value = "/contestant")
public class ContestantController {

    @Autowired
    UserServices userServices;

    @Autowired
    ContestantServices contestantServices;


    @GetMapping(value = "/home")
    public ModelAndView contestantHome() {
        ModelAndView contestantHomeModelAndView = new ModelAndView("ContestantHome");

        return contestantHomeModelAndView;
    }

    @GetMapping(value = "/ContestantRating")
    public ModelAndView viewAllContestantsRating() {
        ModelAndView viewAllContestantsRatingModelAndView = new ModelAndView("ContestantRating");
        List<Contestant> contestantList = contestantServices.getAllContestants();

        // Contestant contestant1, contestant2;
        Collections.sort(contestantList, (contestant1, contestant2) -> {
            return (int) (contestant2.getRating() - contestant1.getRating());
        });

        viewAllContestantsRatingModelAndView.addObject("contestantList", contestantList);

        return viewAllContestantsRatingModelAndView;
    }


    @GetMapping(value = "/PerformanceStatistics")
    public ModelAndView viewPerformanceStatistics() {
        ModelAndView viewPerformanceStatisticsModelAndView = new ModelAndView("PerformanceStatistics");
        List<Contestant> contestantList = contestantServices.getAllContestants();

        Collections.sort(contestantList, (contestant1, contestant2) -> {
            return (int) (contestant2.getAccepted() - contestant1.getAccepted());
        });

        viewPerformanceStatisticsModelAndView.addObject("contestantList", contestantList);

        return viewPerformanceStatisticsModelAndView;
    }


    @GetMapping(value = "/update/{id}/**")
    public ModelAndView updateContestantInformation(@PathVariable("id") Long id) {
        ModelAndView updateContestantInformationModelAndView = new ModelAndView("UpdateInformation");

        User user = userServices.getByUserId(id);
        Contestant contestant = contestantServices.getContestantById(id);

        updateContestantInformationModelAndView.addObject("user", user);
        updateContestantInformationModelAndView.addObject("contestant", contestant);

        return updateContestantInformationModelAndView;
    }


    @PostMapping("/save/{id}")
    public ModelAndView saveUpdatedInformation(@PathVariable("id") Long id,
                                               @ModelAttribute("user") User user,
                                               @ModelAttribute("contestant") Contestant contestant) {
        System.err.println(user);
        System.err.println(contestant);

        User user1 = userServices.getByUserId(id);

        if(!user1.getPassword().equals(user.getPassword())) {
            return new ModelAndView("redirect:/contestant/update/" + id + "/" + "error");
        }

        contestant.setUser(user1);

        contestantServices.saveContestant(contestant);

        return new ModelAndView("redirect:/contestant/home");
    }
}