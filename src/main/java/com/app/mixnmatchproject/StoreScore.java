package com.app.mixnmatchproject;

import java.io.Serializable;

public class StoreScore implements Serializable {
    private String score;
    String Score;
    public StoreScore(String myScore) {
        score = myScore;
    }
    public String getScore(){
        return score;
    }

}
