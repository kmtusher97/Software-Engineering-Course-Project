package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import javax.persistence.*;

/**
 * Entity Class Contestant
 *
 * @author: Masum Bhuiyan
 * @since April 29, 2019
 */
@Entity
@Table(name = "Contestant")
public class Contestant {

    @Id
    private Long userId;

    private String handle;

    private String department;

    private String session;

    private String batch;

    private String dateOfBirth;

    private Long roll;

    private String mobileNo;

    private String tshirtSize;

    private String country;

    /**
     * has one to one relationship with user
     * have common primary key
     */
    @OneToOne
    @JoinColumn
    @MapsId
    private User user;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getRoll() {
        return roll;
    }

    public void setRoll(Long roll) {
        this.roll = roll;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getTshirtSize() {
        return tshirtSize;
    }

    public void setTshirtSize(String tshirtSize) {
        this.tshirtSize = tshirtSize;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
