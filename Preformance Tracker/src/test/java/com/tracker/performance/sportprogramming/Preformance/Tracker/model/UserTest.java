package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void setEmail() {
    }

    @Test
    public void getPassword() {
        User user = new User();

        user.setPassword("12345");

        assertEquals("12345", user.getPassword());
    }

    @Test
    public void setPassword() {
    }

    @Test
    public void getConfirmedPassword() {
        User user = new User();

        user.setConfirmedPassword("1234");

        assertEquals("12345", user.getConfirmedPassword());
    }

    @Test
    public void setConfirmedPassword() {

    }

    @Test
    public void getContestant() {
        User user = new User();

        user.setContestant(null);

        assertEquals(null, user.getContestant());
    }

    @Test
    public void setContestant() {
    }

    @Test
    public void toString1() {
    }
}