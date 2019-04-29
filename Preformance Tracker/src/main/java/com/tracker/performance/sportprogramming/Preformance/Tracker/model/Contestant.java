package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

/**
 * Entity Class Contestant
 *
 * @author: Masum Bhuiyan
 * @since April 29, 2019
 */
public class Contestant {

    private Long userID;

    private String handle;

    private String department;

    private String session;

    private String batch;

    private String dateOfBirth;

    private Long roll;

    private String mobileNo;

    private String tshirtSize;

    private String country;

    public Contestant(Long userID, String handle, String department, String session, String batch, String dateOfBirth, Long roll, String mobileNo, String tshirtSize, String country) {
        this.userID = userID;
        this.handle = handle;
        this.department = department;
        this.session = session;
        this.batch = batch;
        this.dateOfBirth = dateOfBirth;
        this.roll = roll;
        this.mobileNo = mobileNo;
        this.tshirtSize = tshirtSize;
        this.country = country;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
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
}
