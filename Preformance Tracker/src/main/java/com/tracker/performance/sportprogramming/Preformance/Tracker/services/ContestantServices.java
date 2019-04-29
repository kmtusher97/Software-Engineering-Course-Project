package com.tracker.performance.sportprogramming.Preformance.Tracker.services;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.Contestant;

public interface ContestantServices {

    Contestant getContestantById(Long id);

    void saveContestant(Contestant contestant);
}
