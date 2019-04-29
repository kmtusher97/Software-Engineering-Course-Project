package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

import javax.persistence.*;

/**
 * Entity Class Contestant Handle
 *
 * @author: Masum Bhuiyan
 * @since April 29, 2019
 */ 
@Entity
@Table(name = "ContestantHandle")
public class ContestantHandle {

    @Id
    private Long userId;

    private String uvaID;

    private String uvaUsername;

    private String codeforcesHandle;

    private String codechefHandle;

    private String lightOjID;

    private String vjudgeUsername;

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

    public String getUvaID() {
        return uvaID;
    }

    public void setUvaID(String uvaID) {
        this.uvaID = uvaID;
    }

    public String getUvaUsername() {
        return uvaUsername;
    }

    public void setUvaUsername(String uvaUsername) {
        this.uvaUsername = uvaUsername;
    }

    public String getCodeforcesHandle() {
        return codeforcesHandle;
    }

    public void setCodeforcesHandle(String codeforcesHandle) {
        this.codeforcesHandle = codeforcesHandle;
    }

    public String getCodechefHandle() {
        return codechefHandle;
    }

    public void setCodechefHandle(String codechefHandle) {
        this.codechefHandle = codechefHandle;
    }

    public String getLightOjID() {
        return lightOjID;
    }

    public void setLightOjID(String lightOjID) {
        this.lightOjID = lightOjID;
    }

    public String getVjudgeUsername() {
        return vjudgeUsername;
    }

    public void setVjudgeUsername(String vjudgeUsername) {
        this.vjudgeUsername = vjudgeUsername;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
