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

    /**
     * Has one to one relationship with Contestant
     */
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Contestant contestant;

    /**
     * Has one to one relationship with Contestant Handles
     */
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ContestantHandle contestantHandle;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public Contestant getContestant() {
        return contestant;
    }

    public void setContestant(Contestant contestant) {
        this.contestant = contestant;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
