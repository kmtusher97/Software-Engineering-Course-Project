package com.tracker.performance.sportprogramming.Preformance.Tracker.model;

public class ContestantHandle {

    private String uvaID;

    private String uvaUsername;

    private String codeforcesHandle;

    private String codechefHandle;

    private String lightOjID;

    private String vjudgeUsername;

    public ContestantHandle(String uvaID, String uvaUsername, String codeforcesHandle, String codechefHandle, String lightOjID, String vjudgeUsername) {
        this.uvaID = uvaID;
        this.uvaUsername = uvaUsername;
        this.codeforcesHandle = codeforcesHandle;
        this.codechefHandle = codechefHandle;
        this.lightOjID = lightOjID;
        this.vjudgeUsername = vjudgeUsername;
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
}
