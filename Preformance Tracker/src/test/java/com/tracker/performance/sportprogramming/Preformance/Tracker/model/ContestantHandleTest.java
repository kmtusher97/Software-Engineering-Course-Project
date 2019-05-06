package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContestantHandleTest {

    @Test
    public void getUserId() {
    }


    @Test
    public void getUvaID() {
        ContestantHandle contestantHandle = new ContestantHandle();

        Long expected = null;

        assertEquals(expected, contestantHandle.getUvaID());
    }

    @Test
    public void getUvaUsername() {
        ContestantHandle contestantHandle = new ContestantHandle();

        String expected = null;

        assertEquals(expected, contestantHandle.getUvaUsername());
    }


    @Test
    public void getCodeforcesHandle() {

        ContestantHandle contestantHandle = new ContestantHandle();

        String expected = null;

        assertEquals(expected, contestantHandle.getCodeforcesHandle());
    }
}