package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user = new User();

    @Test
    public void testUserId() {
        Long expected = null;
        assertEquals("Error in getUserId",expected,user.getUserId());

        expected = 5L;
        user.setUserId(expected);//expected += 1;
        assertEquals("Error in setUserId",expected,user.getUserId());
    }


    @Test
    public void testEmail() {
        String expected = null;
        assertEquals("Error in getEmail",expected,user.getEmail());

        expected = "test";
        user.setEmail(expected);
        assertEquals("Error in setEmail",expected,user.getEmail());
    }


    @Test
    public void testPassword() {
        String expected = null;
        assertEquals("Error in getPassword",expected,user.getPassword());

        expected = "test";
        user.setPassword(expected);
        assertEquals("Error in setPassword",expected,user.getPassword());
    }


    @Test
    public void testConfirmedPassword() {
        String expected = null;
        assertEquals("Error in getConfirmedPassword",expected,user.getConfirmedPassword());

        expected = "test";
        user.setConfirmedPassword(expected);
        assertEquals("Error in setConfirmedPassword",expected,user.getConfirmedPassword());

    }

}