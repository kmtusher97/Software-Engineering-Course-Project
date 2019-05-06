package com.tracker.performance.sportprogramming.Preformance.Tracker.services;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.Contestant;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ContestantServicesImplementationTest {

    @Test
    public void getContestantById() {
    }

    @Test
    public void saveContestant() {
    }

    @Test
    public void getAllContestants() throws Exception {
        ContestantServicesImplementation contestantServices = new ContestantServicesImplementation();

        List<Contestant> contestantList = contestantServices.getAllContestants();

        System.err.println(contestantList.size());

        /*for(Contestant contestant : contestantList) {
            Assert.assertTrue(contestant.getId() == null);
            System.err.println(contestant.getId());
        }*/
    }
}

