package com.tracker.performance.sportprogramming.Preformance.Tracker.repository;

import com.tracker.performance.sportprogramming.Preformance.Tracker.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUsername() throws Exception {
// Given
        User user = new User();
        user.setUserId((long)1234);
        user.setEmail("abcd@gmail.com");
        user.setPassword("1234");

        testEntityManager.persist(user);
        testEntityManager.flush();
// When
        User actual = userRepository.getOne((long)1234);
// Then
        //assertThat(actual).isEqualTo(user);
        assertEquals(user.getUserId(), actual.getUserId());
        System.err.println(actual);
    }
}