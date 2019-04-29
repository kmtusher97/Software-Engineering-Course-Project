package com.tracker.performance.sportprogramming.Preformance.Tracker.services;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.Contestant;
import com.tracker.performance.sportprogramming.Preformance.Tracker.repository.ContestantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContestantServicesImplementation implements ContestantServices {

    @Autowired
    ContestantRepository contestantRepository;

    @Override
    public Contestant getContestantById(Long id) {
        return contestantRepository.getOne(id);
    }
}
