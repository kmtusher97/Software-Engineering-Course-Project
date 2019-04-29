package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <h3>User Entity Class</h3>
 *
 * @author Kamrul Hasan
 * @version 1.0
 * @since April 29, 2019
 */
@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @Column(name = "password", length = 20)
    private String password;

    @Transient
    private String confirmedPassword;


}
