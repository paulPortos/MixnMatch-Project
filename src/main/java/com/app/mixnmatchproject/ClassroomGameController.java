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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import java.util.Objects;

@SuppressWarnings("CallToPrintStackTrace")
public class ClassroomGameController {
    @FXML
    public Pane borderPane;
    public Button startButton;
    public Pane menuPane;
    public VBox menuVbox;
    public Button resumeButton;
    public Button newGameButton;
    public Button soundsButton;
    public Button exitButton;
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
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private boolean isImageShown = false;
    public Button lastClickedButton = null;
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
    ImageView btn19_classroom;
    ImageView btn20_classroom;
    private static String btn1ImageName;
    private static String btn2ImageName;
    @FXML
    private Label timerLabel;
    private Timeline timeline;
    private int secondsElapsed = 0;
    public boolean menuClicked = false;

    @FXML
    public void pressStart(){
        restrictions(true);
        startTime();
        startButton.setDisable(true);
        startButton.setVisible(false);
        // ...
    }
    public void restrictions(boolean x){
        borderPane.setDisable(x);
        menuPane.setDisable(x);
    }
    public void startTime(){
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            secondsElapsed++;
            updateTimerLabel();
            if (secondsElapsed == 1000) {
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
        int minutes = secondsElapsed / 60;
        int seconds = secondsElapsed % 60;
        String formattedTime = String.format("%02d:%02d", minutes, seconds);
        timerLabel.setText("Time: " + formattedTime);
    }
    public void openGameMenu(){

        if(menuClicked){
            timeline.play();
            restrictions(true);
            menuClicked = false;
            setButtonsInvisible();
        } else {
            timeline.stop();
            restrictions(false);
            menuClicked = true;
            setButtonsVisible();
        }
    }
    public void setButtonsInvisible(){
        menuVbox.setStyle("-fx-background-color: transparent; ");
        resumeButton.setStyle("-fx-background-color: transparent; " + "-fx-text: \"\"; ");
    }
    public void setButtonsVisible(){
        menuVbox.setStyle("-fx-background-color: #c481a7; ");
        resumeButton.setStyle("-fx-background-color: #ffccd5; " + "-fx-text: \"Resume\"; ");
    }
    public void switchToDifficultySelectionWindow(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DifficultySelectionWindow.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goBackToMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartMenu.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/TV.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/White board.png");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Notebooks.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Bag.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Pencil.png");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Desk.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Notebooks.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Desk.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/TV.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Teacher's Desk.jpg");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/White board.png");
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
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Pencil.png");
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
Image backgroundImage18= new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Books.jpg");
    public void showContentBtn18_classroom(){
        btn18_classroom = new ImageView(backgroundImage18);
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
    Image backgroundImage19 = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Bag.Jpg");
    public void showContentBtn19_classroom(){
        btn19_classroom = new ImageView(backgroundImage19);
        btn19_classroom.setFitWidth(70);
        btn19_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn19.setGraphic(btn19_classroom);

        // Remove the ellipsis
        classroomGame_btn19.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn19.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn19.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn19.setText("");
            classroomGame_btn19.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn19.setGraphic(btn19_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn19);
    }

    public void showContentBtn20_classroom(){
        Image backgroundImage = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/Teacher’s Desk.jpg");
        btn20_classroom = new ImageView(backgroundImage);
        btn20_classroom.setFitWidth(70);
        btn20_classroom.setFitHeight(70);

        // Set the button's graphic to be the ImageView
        classroomGame_btn20.setGraphic(btn20_classroom);

        // Remove the ellipsis
        classroomGame_btn20.setContentDisplay(ContentDisplay.TOP);

        if (isImageShown) {

            classroomGame_btn20.setStyle("-fx-background-color: grey; -fx-border-color: black; -fx-border-width: 2px;");
            classroomGame_btn20.setGraphic(null); // Remove the image from the button
        } else {
            classroomGame_btn20.setText("");
            classroomGame_btn20.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
            classroomGame_btn20.setGraphic(btn20_classroom); // Set the image background
        }
        // Toggle the flag to indicate the button's state
        isImageShown = !isImageShown;
        buttonClicked(classroomGame_btn20);
    }

    private String getImageName(Button button) {
        // Add your logic to retrieve the image name associated with the button
        // For example, you could use the button's ID or properties to determine the image name
        if (button.equals(classroomGame_btn1)) {
            return btn1ImageName;
        } else if (button.equals(classroomGame_btn2)) {
            return btn2ImageName;
        }
        // Add similar logic for other buttons if needed
        return null; // Return null if image name is not found
    }

    private final boolean[][] matchedButtons = new boolean[20][20]; // 2D array to keep track of matched buttons

    public void buttonClicked(Button button) {
        int buttonIndex = getButtonIndex(button);
        int row = buttonIndex / 20;
        int col = buttonIndex % 20;

        // Check if the button has already been matched
        if (matchedButtons[row][col]) {
            return; // Do nothing if the button has already been matched
        }

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

            // Remove the gray background color from the button
            button.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
        }

        // Check if the button has been matched
        if (matchedButtons[row][col]) {
            // Disable the button if matched
            button.setDisable(true);
            return; // Return if the button has been matched
        }

        // If there are already two buttons clicked, do nothing
        if (thirdButtonClicked) {
            return;
        }

        // Check if two buttons are clicked and they don't match
        if (lastClickedButton != null && !lastClickedButton.equals(button)) {
            String imageName1 = getImageName(lastClickedButton);
            String imageName2 = getImageName(button);

            if (imageName1 != null && imageName2 != null && !imageName1.equals(imageName2)) {
                // If the images don't match, show a popup saying "Not matched!"
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Not matched!", ButtonType.OK);
                alert.showAndWait();

                // Flip back the buttons after a delay
                PauseTransition pause = new PauseTransition(Duration.seconds(1.5));
                pause.setOnFinished(event -> {
                    revertToNormal(lastClickedButton);
                    revertToNormal(button);
                });
                pause.play();

                // Reset lastClickedButton and thirdButtonClicked
                lastClickedButton = null;
                thirdButtonClicked = false;
            } else {
                // Mark the buttons as matched
                int index1 = getButtonIndex(lastClickedButton);
                int index2 = getButtonIndex(button);

                int row1 = index1 / 20;
                int col1 = index1 % 20;
                int row2 = index2 / 20;
                int col2 = index2 % 20;

                matchedButtons[row1][col1] = true;
                matchedButtons[row2][col2] = true;

                // Disable the buttons
                lastClickedButton.setDisable(true);
                button.setDisable(true);

                // Reset lastClickedButton and thirdButtonClicked
                lastClickedButton = null;
                thirdButtonClicked = false;
            }
        }
    }

    private void showImageForTwoSeconds(Button button1, Button button2) {
        String imageName1 = getImageName(button1);
        String imageName2 = getImageName(button2);
        if (imageName1 != null && imageName1.equals(imageName2)) {
            // If the images match, show a popup saying "matched!" and mark the buttons as matched
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Matched!", ButtonType.OK);
            alert.showAndWait();
            int index1 = getButtonIndex(button1);
            int index2 = getButtonIndex(button2);
            int row1 = index1 / 20;
            int col1 = index1 % 20;
            int row2 = index2 / 20;
            int col2 = index2 % 20;
            // Mark the matched buttons in the 2D array
            matchedButtons[row1][col1] = true;
            matchedButtons[row2][col2] = true;
        }
        // Show the image on both buttons
        showImage(button1);
        showImage(button2);
        // Revert the buttons to normal state after a delay
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> {
            if (thirdButtonClicked) {
                // Show the image on the third button
                showImage(thirdButton);
                thirdButtonClicked = false;
                thirdButton = null;
            }

            // Revert the buttons to normal state, unless they are matched
            int index1 = getButtonIndex(button1);
            int index2 = getButtonIndex(button2);
            int row1 = index1 / 20;
            int col1 = index1 % 20;
            int row2 = index2 / 20;
            int col2 = index2 % 20;
            if (!matchedButtons[row1][col1]) {
                revertToNormal(button1);
            }
            if (!matchedButtons[row2][col2]) {
                revertToNormal(button2);
            }
        });
        pause.play();
    }

    private int getButtonIndex(Button button) {
        // Implement this method to get the index of the button in the button array
        // This will be used to access the matchedButtons 2D array
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (button == getButtonAt(i, j)) {
                    return i * 20 + j;
                }
            }
        }
        return -1; // Return -1 if the button is not found
    }

    private Button getButtonAt(int row, int col) {
        // Implement this method to get the button at the specified row and column
        // For example, you could use an array or a Map to store the buttons
        // and retrieve the button based on the row and column indices
        switch (row * 20 + col) {
            case 0:
                return classroomGame_btn1;
            case 1:
                return classroomGame_btn2;
            case 2:
                return classroomGame_btn3;
            case 3:
                return classroomGame_btn4;
            case 4:
                return classroomGame_btn5;
            case 5:
                return classroomGame_btn6;
            case 6:
                return classroomGame_btn7;
            case 7:
                return classroomGame_btn8;
            case 8:
                return classroomGame_btn9;
            case 9:
                return classroomGame_btn10;
            case 10:
                return classroomGame_btn11;
            case 11:
                return classroomGame_btn12;
            case 12:
                return classroomGame_btn13;
            case 13:
                return classroomGame_btn14;
            case 14:
                return classroomGame_btn15;
            case 15:
                return classroomGame_btn16;
            case 16:
                return classroomGame_btn17;
            case 17:
                return classroomGame_btn18;
            case 18:
                return classroomGame_btn19;
            case 19:
                return classroomGame_btn20;
            // Add cases for the remaining buttons
            default:
                return null;
        }
    }

    private void showImage(Button button) {
        // Get the image name associated with the button
        String imageName = getImageName(button);
        if (imageName != null) {
            // Load the image
            Image image = new Image("com/app/mixnmatchproject/images/CategoryPictures/Classroom/" + imageName);
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(70);
            imageView.setFitHeight(70);

            // Set the button's graphic to the image
            button.setGraphic(imageView);
            button.setContentDisplay(ContentDisplay.TOP);
            button.setText("");
            button.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
        }
    }

    private void revertToNormal(Button button) {
        button.setGraphic(null);
        button.setText("");
        button.setStyle("");
        isImageShown = false;
    }

}