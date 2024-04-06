package com.app.mixnmatchproject;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Objects;


@SuppressWarnings("CallToPrintStackTrace")
public class ClassroomGameController {

    @FXML
    Button classroomGame_btn1;
    @FXML
    Button classroomGame_btn2;
    @FXML
    Button classroomGame_btn3;
    @FXML
    Button classroomGame_btn4;
    @FXML
    Button classroomGame_btn5;
    @FXML
    Button classroomGame_btn6;
    @FXML
    Button classroomGame_btn7;
    @FXML
    Button classroomGame_btn8;
    @FXML
    Button classroomGame_btn9;
    @FXML
    Button classroomGame_btn10;
    @FXML
    Button classroomGame_btn11;
    @FXML
    Button classroomGame_btn12;
    @FXML
    Button classroomGame_btn13;
    @FXML
    Button classroomGame_btn14;
    @FXML
    Button classroomGame_btn15;
    @FXML
    Button classroomGame_btn16;
    @FXML
    Button classroomGame_btn17;
    @FXML
    Button classroomGame_btn18;
    @FXML
    Button classroomGame_btn20;
    @FXML
    Button classroomGame_btn19;
    private boolean isImageShown = false;
    private Button lastClickedButton = null;
    private boolean thirdButtonClicked = false;
    private Button thirdButton = null;

    ImageView btn1_classroom;
    ImageView btn2_classroom;
    ImageView btn3_classroom;
    ImageView btn4_classroom;
    ImageView btn5_classroom;
    ImageView btn6_classroom;
    ImageView btn7_classroom;
    ImageView btn8_classroom;
    ImageView btn9_classroom;
    ImageView btn10_classroom;
    ImageView btn11_classroom;
    ImageView btn12_classroom;
    ImageView btn13_classroom;
    ImageView btn14_classroom;
    ImageView btn15_classroom;
    ImageView btn16_classroom;
    ImageView btn17_classroom;
    ImageView btn18_classroom;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private static String btn1ImageName;
    private static String btn2ImageName;

    @FXML
    private Label timerLabel;
    private Timeline timeline;

    private int secondsElapsed = 0;
    public void initialize() {
        // Create a Timeline to update the timerLabel every second
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            secondsElapsed++;
            updateTimerLabel();
            if (secondsElapsed == 10) {
                try {
                    switchToStartMenu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }));
        timeline.setCycleCount(Animation.INDEFINITE); // Run the timeline indefinitely
        timeline.play(); // Start the timeline
    }

    private void updateTimerLabel() {
        timerLabel.setText("Time: " + secondsElapsed + " seconds");
    }

    private void switchToStartMenu() throws Exception {
        // Stop the timeline
        timeline.stop();

        // Load StartMenu.fxml
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartMenu.fxml")));
        // Get the current stage
        Stage stage = (Stage) timerLabel.getScene().getWindow();
        // Create a new scene with StartMenu.fxml
        Scene scene = new Scene(root);
        // Set the scene to the stage
        stage.setScene(scene);
        // Show the stage
        stage.show();
    }


    public void showContentBtn1_classroom(){
        String imageName = btn1ImageName;

        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg");
        btn1_classroom = new ImageView(backgroundImage);
        btn1_classroom.setFitWidth(70);
        btn1_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn1.setGraphic(btn1_classroom);
        ClassroomGameController.setBtn1ImageName(imageName);
        // Remove the ellipsis
        classroomGame_btn1.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn1.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn1.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn1.setText("");
            classroomGame_btn1.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn1.setGraphic(btn1_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn1);
    }
    public static void setBtn1ImageName(String imageName) {
        btn1ImageName = imageName;
    }
    public void showContentBtn2_classroom() {
        // Set the image name using the previously declared field
        String imageName = btn2ImageName;

        // Check if imageName is not null before proceeding

            // Add the rest of your logic here
            // For example:
            Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Books.jpg");
            btn2_classroom = new ImageView(backgroundImage);
            btn2_classroom.setFitWidth(70);
            btn2_classroom.setFitHeight(70);

            // Set the button's graphic to be the ImageView
            classroomGame_btn2.setGraphic(btn2_classroom);
            ClassroomGameController.setBtn2ImageName(imageName);
            // Remove the ellipsis
            classroomGame_btn2.setContentDisplay(ContentDisplay.TOP);

            if (isImageShown) {
                classroomGame_btn2.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
                classroomGame_btn2.setGraphic(null); // Remove the image from the button
            } else {
                classroomGame_btn2.setText("");
                classroomGame_btn2.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
                classroomGame_btn2.setGraphic(btn2_classroom); // Set the image background
            }
            // Toggle the flag to indicate the button's state
            isImageShown = !isImageShown;
            buttonClicked(classroomGame_btn2);

    }
    public static void setBtn2ImageName(String imageName) {
        btn2ImageName = imageName;
    }
    public void showContentBtn3_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn3_classroom = new ImageView(backgroundImage);
        btn3_classroom.setFitWidth(70);
        btn3_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn3.setGraphic(btn3_classroom);

        // Remove the ellipsis
        classroomGame_btn3.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn3.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn3.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn3.setText("");
            classroomGame_btn3.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn3.setGraphic(btn3_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn3);
    }
    public void showContentBtn4_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn4_classroom = new ImageView(backgroundImage);
        btn4_classroom.setFitWidth(70);
        btn4_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn4.setGraphic(btn4_classroom);

        // Remove the ellipsis
        classroomGame_btn4.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn4.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn4.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn4.setText("");
            classroomGame_btn4.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn4.setGraphic(btn4_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn4);
    }
    public void showContentBtn5_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn5_classroom = new ImageView(backgroundImage);
        btn5_classroom.setFitWidth(70);
        btn5_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn5.setGraphic(btn5_classroom);

        // Remove the ellipsis
        classroomGame_btn5.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn5.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn5.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn5.setText("");
            classroomGame_btn5.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn5.setGraphic(btn5_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn5);
    }
    public void showContentBtn6_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn6_classroom = new ImageView(backgroundImage);
        btn6_classroom.setFitWidth(70);
        btn6_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn6.setGraphic(btn6_classroom);

        // Remove the ellipsis
        classroomGame_btn6.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn6.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn6.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn6.setText("");
            classroomGame_btn6.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn6.setGraphic(btn6_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn6);
    }
    public void showContentBtn7_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn7_classroom = new ImageView(backgroundImage);
        btn7_classroom.setFitWidth(70);
        btn7_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn7.setGraphic(btn7_classroom);

        // Remove the ellipsis
        classroomGame_btn7.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn7.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn7.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn7.setText("");
            classroomGame_btn7.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn7.setGraphic(btn7_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn7);
    }
    public void showContentBtn8_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn8_classroom = new ImageView(backgroundImage);
        btn8_classroom.setFitWidth(70);
        btn8_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn8.setGraphic(btn8_classroom);

        // Remove the ellipsis
        classroomGame_btn8.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn8.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn8.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn8.setText("");
            classroomGame_btn8.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn8.setGraphic(btn8_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn8);
    }
    public void showContentBtn9_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn9_classroom = new ImageView(backgroundImage);
        btn9_classroom.setFitWidth(70);
        btn9_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn9.setGraphic(btn9_classroom);

        // Remove the ellipsis
        classroomGame_btn9.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn9.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn9.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn9.setText("");
            classroomGame_btn9.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn9.setGraphic(btn9_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn9);
    }
    public void showContentBtn10_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn10_classroom = new ImageView(backgroundImage);
        btn10_classroom.setFitWidth(70);
        btn10_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn10.setGraphic(btn10_classroom);

        // Remove the ellipsis
        classroomGame_btn10.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn10.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn10.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn10.setText("");
            classroomGame_btn10.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn10.setGraphic(btn10_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn10);
    }

    public void showContentBtn11_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn11_classroom = new ImageView(backgroundImage);
        btn11_classroom.setFitWidth(70);
        btn11_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn11.setGraphic(btn11_classroom);

        // Remove the ellipsis
        classroomGame_btn11.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn11.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn11.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn11.setText("");
            classroomGame_btn11.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn11.setGraphic(btn11_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn11);
    }
    public void showContentBtn12_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn12_classroom = new ImageView(backgroundImage);
        btn12_classroom.setFitWidth(70);
        btn12_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn12.setGraphic(btn12_classroom);

        // Remove the ellipsis
        classroomGame_btn12.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn12.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn12.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn12.setText("");
            classroomGame_btn12.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn12.setGraphic(btn12_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn12);
    }

    public void showContentBtn13_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn13_classroom = new ImageView(backgroundImage);
        btn13_classroom.setFitWidth(70);
        btn13_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn13.setGraphic(btn13_classroom);

        // Remove the ellipsis
        classroomGame_btn13.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn13.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn13.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn13.setText("");
            classroomGame_btn13.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn13.setGraphic(btn13_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn13);
    }

    public void showContentBtn14_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn14_classroom = new ImageView(backgroundImage);
        btn14_classroom.setFitWidth(70);
        btn14_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn14.setGraphic(btn14_classroom);

        // Remove the ellipsis
        classroomGame_btn14.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn14.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn14.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn14.setText("");
            classroomGame_btn14.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn14.setGraphic(btn14_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn14);
    }

    public void showContentBtn15_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn15_classroom = new ImageView(backgroundImage);
        btn15_classroom.setFitWidth(70);
        btn15_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn15.setGraphic(btn15_classroom);

        // Remove the ellipsis
        classroomGame_btn15.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn15.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn15.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn15.setText("");
            classroomGame_btn15.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn15.setGraphic(btn15_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn15);
    }

    public void showContentBtn16_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn16_classroom = new ImageView(backgroundImage);
        btn16_classroom.setFitWidth(70);
        btn16_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn16.setGraphic(btn16_classroom);

        // Remove the ellipsis
        classroomGame_btn16.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn16.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn16.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn16.setText("");
            classroomGame_btn16.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn16.setGraphic(btn16_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn16);
    }

    public void showContentBtn17_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn17_classroom = new ImageView(backgroundImage);
        btn17_classroom.setFitWidth(70);
        btn17_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn17.setGraphic(btn17_classroom);

        // Remove the ellipsis
        classroomGame_btn17.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn17.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn17.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn17.setText("");
            classroomGame_btn17.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn17.setGraphic(btn17_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn17);
    }

    public void showContentBtn18_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg");
        btn18_classroom = new ImageView(backgroundImage);
        btn18_classroom.setFitWidth(70);
        btn18_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn18.setGraphic(btn18_classroom);

        // Remove the ellipsis
        classroomGame_btn18.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn18.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn18.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn18.setText("");
            classroomGame_btn18.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn18.setGraphic(btn18_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn18);
    }

    public void buttonClicked(Button button) {
        // Check if lastClickedButton is not null and not the same as the current button
        if (lastClickedButton != null && !lastClickedButton.equals(button)) {
            // If there are already two buttons clicked, do nothing
            if (thirdButtonClicked) {
                return;
            }
            // Show the image for 2 seconds
            showImageForTwoSeconds(lastClickedButton, button);
            // Reset lastClickedButton
            lastClickedButton = null;
        } else if (!thirdButtonClicked) {
            // If the current button is the same as lastClickedButton, update lastClickedButton
            lastClickedButton = button;
            // Toggle the flag to indicate the button's state
            isImageShown = !isImageShown;
        }
    }

    private void showImageForTwoSeconds(Button button1, Button button2) {
        // Assuming you have a method getImageName(Button button) which returns the image name associated with the button
        String imageName1 = getImageName(button1);
        String imageName2 = getImageName(button2);

        if (imageName1 != null && imageName2 != null && imageName1.equals(imageName2)) {
            // If the images match, show a popup saying "matched!"
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Matched!", ButtonType.OK);
            alert.showAndWait();
        }

        // Show the image on both buttons
        showImage(button1);
        showImage(button2);

        // Revert the buttons to normal state after a delay
        PauseTransition pause = new PauseTransition(Duration.seconds(1.5));
        pause.setOnFinished(event -> {
            if (thirdButtonClicked) {
                // Show the image on the third button
                showImage(thirdButton);
                thirdButtonClicked = false;
                thirdButton = null;
            }
            revertToNormal(button1);
            revertToNormal(button2);
        });
        pause.play();
    }

    private String getImageName(Button button) {
        // Assuming the image name is stored as a property of the button
        Object propertyName = button.getProperties().get("imageName");
        if (propertyName != null) {
            return propertyName.toString();
        } else {
            return null; // Return null if the image name property is not set
        }
    }

    private void showImage(Button button) {
        // Your logic to show the image on the button
        // For example, setting the graphic of the button to an ImageView
    }

    private void revertToNormal(Button button) {
        // Revert the button to its normal state
        button.setText("");
        button.setStyle("");
        button.setGraphic(null);
        isImageShown = false;
    }
    public void showPopupWindow() {
        try {
            // Load the FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PopupWindow.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new stage for the pop-up window
            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL);
            popupStage.setTitle("Popup Window");

            // Set the stage style to undecorated
            popupStage.initStyle(StageStyle.UNDECORATED);

            // Set the scene with the FXML layout
            popupStage.setScene(new Scene(root));

            // Show the pop-up window
            popupStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}