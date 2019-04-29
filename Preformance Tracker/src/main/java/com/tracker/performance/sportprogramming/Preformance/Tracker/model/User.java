package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <h3>User Entity Class</h3>
 *
 * @author Kamrul Hasan
 * @version 1.0
 * @since April 29, 2019
 * @modified Meherunessa Tania
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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
