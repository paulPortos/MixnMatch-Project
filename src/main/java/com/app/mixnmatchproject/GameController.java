package com.app.mixnmatchproject;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class GameController {

    private boolean isImageShown = false;
    @FXML
    Button classroomGame_btn1;
    ImageView btn1_classroom;

    public void showContentBtn1_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg");
        btn1_classroom = new ImageView(backgroundImage);
        classroomGame_btn1.setStyle("-fx-background-color: lightblue");
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(1), classroomGame_btn1);
        btn1_classroom.setFitWidth(classroomGame_btn1.getWidth());
        btn1_classroom.setFitHeight(classroomGame_btn1.getHeight());
        rotateTransition.setByAngle(360);

        if (isImageShown) {
            // Button is flipped, so flip it back to its original state
            rotateTransition.setByAngle(-360); // Negative angle for counter-clockwise rotation
            rotateTransition.play();
            classroomGame_btn1.setGraphic(null); // Remove the image from the button
        } else {
            // Button is not flipped, so flip it and show the image background
            rotateTransition.setByAngle(360); // Positive angle for clockwise rotation
            rotateTransition.play();
            classroomGame_btn1.setGraphic(btn1_classroom); // Set the image background
        }

        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
    }

    public void showContentBtn2_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg");
        btn1_classroom = new ImageView(backgroundImage);
        classroomGame_btn1.setStyle("-fx-background-color: lightblue");
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(1), classroomGame_btn1);

        rotateTransition.setByAngle(180);

        if (classroomGame_btn1.getBackground() != null) {
            // Button is flipped, so flip it back to its original state
            rotateTransition.setRate(-1);
            rotateTransition.play();
            classroomGame_btn1.setBackground(null); // Remove the image background
        } else {
            // Button is not flipped, so flip it and show the image background
            rotateTransition.setRate(1);
            rotateTransition.play();
            classroomGame_btn1.setGraphic(btn1_classroom); // Set the image background
        }
    }

}