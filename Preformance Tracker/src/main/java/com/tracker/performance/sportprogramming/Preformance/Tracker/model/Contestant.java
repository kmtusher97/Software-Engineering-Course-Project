package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import javax.persistence.*;
import java.time.LocalDate;

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
    private Long id;

    @Column(name = "name", length = 70)
    private String name;

    @Column(name = "handle", unique = true, length = 40)
    private String handle;

    @Column(name = "department")
    private String department;

    @Column(name = "session")
    private String session;

    @Column(name = "batch")
    private String batch;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "roll")
    private Long roll;

    @Column(name = "mobileNo")
    private String mobileNo;

    @Column(name = "tshirtSize")
    private String tshirtSize;

    @Column(name = "country")
    private String country;

    @Column
    private Long rating;

    @Column
    private Long day;

    @Column
    private Long accepted;

    @Column
    private Long submissions;

    /**
     * has one to one relationship with user
     * have common primary key
     */
    @OneToOne
    @MapsId
    private User user;

    public Contestant() {
    }

    public Contestant(User user) {
        this.user = user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
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

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public Long getAccepted() {
        return accepted;
    }

    public void setAccepted(Long accepted) {
        this.accepted = accepted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getSubmissions() {
        return submissions;
    }

    public void setSubmissions(Long submissions) {
        this.submissions = submissions;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", handle='" + handle + '\'' +
                ", department='" + department + '\'' +
                ", session='" + session + '\'' +
                ", batch='" + batch + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", roll=" + roll +
                ", mobileNo='" + mobileNo + '\'' +
                ", tshirtSize='" + tshirtSize + '\'' +
                ", country='" + country + '\'' +
                ", rating=" + rating +
                ", day=" + day +
                ", accepted=" + accepted +
                ", user=" + user +
                '}';
    }
}
