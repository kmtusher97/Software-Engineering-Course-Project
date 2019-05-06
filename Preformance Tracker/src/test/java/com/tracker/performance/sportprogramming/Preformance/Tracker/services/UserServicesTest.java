package com.tracker.performance.sportprogramming.Preformance.Tracker.services;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.User;
import com.tracker.performance.sportprogramming.Preformance.Tracker.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static javafx.beans.binding.Bindings.when;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class UserServicesTest {

    @MockBean
    private UserRepository userRepository;

    private UserServices userServices;

   /* @Before
    public void setUp() {
        User user = new User();

        user.setUserId((long)1234);
        user.setEmail("a@gmail.com");
        user.setPassword("1234");

        Mockito.when(userRepository.getOne((long)1234)).thenReturn(user);
    }*/

    @Test
    public void testGetByUserId() throws Exception {
        User user = new User();

        user.setUserId((long)1234);
        user.setEmail("a@gmail.com");
        user.setPassword("1234");

        Mockito.when(userRepository.getOne((long)1234)).thenReturn(user);

        User user1 = userRepository.getOne((long)1234);

        //Assert.assertEquals(null, user1.getUserId());
        Assert.assertNotEquals(null, user1.getUserId());
        System.err.println(user1);
    }
}