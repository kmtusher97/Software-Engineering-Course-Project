package com.tracker.performance.sportprogramming.Preformance.Tracker.services;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.Contestant;

import java.util.List;

public interface ContestantServices {

    Contestant getContestantById(Long id);

    void saveContestant(Contestant contestant);

    List<Contestant> getAllContestants();
}
