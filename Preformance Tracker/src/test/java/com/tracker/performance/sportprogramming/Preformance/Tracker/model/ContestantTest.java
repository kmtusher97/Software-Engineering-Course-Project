package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContestantTest {

    @Test
    public void getId() {
        Contestant contestant = new Contestant();
        Long expected = null;
        assertEquals(expected, contestant.getId());
    }

    @Test
    public void getName() {
        Contestant contestant=new Contestant();
        String expected=null;
        assertEquals(expected,contestant.getName());
    }

    @Test
    public void getHandle() {
        Contestant contestant=new Contestant();
        String expected=null;
        assertEquals(expected,contestant.getHandle());
    }

    @Test
    public void getDepartment() {
        Contestant contestant=new Contestant();
        String expected=null;
        assertEquals(expected,contestant.getDepartment());
    }
}