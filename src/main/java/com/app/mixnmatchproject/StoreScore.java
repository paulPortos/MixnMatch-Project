package com.app.mixnmatchproject;

public class StoreScore {
    ClassroomGameController classroomGameController_EasyScore = new ClassroomGameController();
    String classroomScoreEasy;
    public StoreScore() {
        classroomScoreEasy = classroomGameController_EasyScore.getVariable();
    }
}
