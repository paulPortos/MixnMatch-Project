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
import java.util.Random;

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
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btn17;
    public Button btn18;
    public Button btn19;
    public Button btn20;
    public ImageView btn1_imageView;
    public ImageView btn2_imageView;
    public ImageView btn3_imageView;
    public ImageView btn4_imageView;
    public ImageView btn5_imageView;
    public ImageView btn6_imageView;
    public ImageView btn7_imageView;
    public ImageView btn8_imageView;
    public ImageView btn9_imageView;
    public ImageView btn10_imageView;
    public ImageView btn11_imageView;
    public ImageView btn12_imageView;
    public ImageView btn13_imageView;
    public ImageView btn14_imageView;
    public ImageView btn15_imageView;
    public ImageView btn16_imageView;
    public ImageView btn17_imageView;
    public ImageView btn18_imageView;
    public ImageView btn19_imageView;
    public ImageView btn20_imageView;

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label timerLabel;
    private Timeline timeline;
    private int secondsElapsed = 0;
    public boolean menuClicked = false;
    boolean [] buttonsOpen = new boolean[20];
    String [] picturesUrl = new String[20];
    String [] url0 = {
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/TV.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Books.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Teacher’s Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Books.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Bag.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Bag.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/TV.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Notebooks.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Notebooks.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Pencil.png",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Teacher’s Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/White board.png",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Pencil.png",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/White board.png",
    };
    String [] url1 = {
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/TV.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Notebooks.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Correction tape.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Notebooks.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Pencil.png",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Teacher’s Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/White board.png",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Pencil.png",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/White board.png",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/TV.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Books.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Teacher’s Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Books.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Bag.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Ballpen.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Desk.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Classroom/Bag.jpg",

    };
    @FXML
    public void pressStart(){
        restrictions(true);
        startTime();
        startButton.setDisable(true);
        startButton.setVisible(false);
        falseAllButton();
        getUrlNumber();
    }
    public void getUrlNumber(){
        Random random = new Random();

        // Generate a random number between 0 and 2 (inclusive)
        int randomNumber = random.nextInt(2); // 3 specifies the upper bound (exclusive)
        if (randomNumber == 0){
            for (int i = 0; i < picturesUrl.length; i++){
                picturesUrl[i] = url0[i];
            }
        } else {
            for (int i = 0; i < picturesUrl.length; i++){
                picturesUrl[i] = url1[i];
            }
        }

        System.out.println(randomNumber);
        rndNumber = randomNumber;
    }
    int rndNumber;
    int totalMatched = 0;
    boolean [] matched = new boolean[10];
    public void match_Checker() throws Exception {
        if (rndNumber == 0){
            if(buttonsOpen[0] && buttonsOpen[6]){
                btn1.setDisable(true);
                btn7.setDisable(true);
                buttonsOpen[0] = !buttonsOpen[0];
                buttonsOpen[6] = !buttonsOpen[6];
                totalMatched++;
                matched[0] = true;
            } else if (buttonsOpen[1] && buttonsOpen[10]){
                btn2.setDisable(true);
                btn11.setDisable(true);
                buttonsOpen[1] = !buttonsOpen[1];
                buttonsOpen[10] = !buttonsOpen[10];
                totalMatched++;
                matched[1] = true;
            } else if (buttonsOpen[2] && buttonsOpen[4]){
                btn3.setDisable(true);
                btn5.setDisable(true);
                buttonsOpen[2] = !buttonsOpen[2];
                buttonsOpen[4] = !buttonsOpen[4];
                totalMatched++;
                matched[2] = true;
            } else if (buttonsOpen[3] && buttonsOpen[16]){
                btn4.setDisable(true);
                btn17.setDisable(true);
                buttonsOpen[3] = !buttonsOpen[3];
                buttonsOpen[16] = !buttonsOpen[16];
                totalMatched++;
                matched[3] = true;
            } else if (buttonsOpen[5] && buttonsOpen[8]){
                btn6.setDisable(true);
                btn9.setDisable(true);
                buttonsOpen[5] = !buttonsOpen[5];
                buttonsOpen[8] = !buttonsOpen[8];
                totalMatched++;
                matched[4] = true;
            } else if (buttonsOpen[7] && buttonsOpen[9]){
                btn8.setDisable(true);
                btn10.setDisable(true);
                buttonsOpen[7] = !buttonsOpen[7];
                buttonsOpen[9] = !buttonsOpen[9];
                totalMatched++;
                matched[5] = true;
            }else if (buttonsOpen[11] && buttonsOpen[13]){
                btn12.setDisable(true);
                btn14.setDisable(true);
                buttonsOpen[11] = !buttonsOpen[11];
                buttonsOpen[13] = !buttonsOpen[13];
                totalMatched++;
                matched[6] = true;
            } else if (buttonsOpen[12] && buttonsOpen[14]){
                btn13.setDisable(true);
                btn15.setDisable(true);
                buttonsOpen[12] = !buttonsOpen[12];
                buttonsOpen[14] = !buttonsOpen[14];
                totalMatched++;
                matched[7] = true;
            }  else if (buttonsOpen[15] && buttonsOpen[18]){
                btn16.setDisable(true);
                btn19.setDisable(true);
                buttonsOpen[15] = !buttonsOpen[15];
                buttonsOpen[18] = !buttonsOpen[18];
                totalMatched++;
                matched[8] = true;
            } else if (buttonsOpen[17] && buttonsOpen[19]){
                btn18.setDisable(true);
                btn20.setDisable(true);
                buttonsOpen[17] = !buttonsOpen[17];
                buttonsOpen[19] = !buttonsOpen[19];
                totalMatched++;
                matched[9] = true;
            }
        } else {
            if(buttonsOpen[0] && buttonsOpen[18]){
                btn1.setDisable(true);
                btn19.setDisable(true);
                buttonsOpen[0] = !buttonsOpen[0];
                buttonsOpen[18] = !buttonsOpen[18];
                totalMatched++;
                matched[0] = true;
            } else if (buttonsOpen[1] && buttonsOpen[12]){
                btn2.setDisable(true);
                btn13.setDisable(true);
                buttonsOpen[1] = !buttonsOpen[1];
                buttonsOpen[12] = !buttonsOpen[12];
                totalMatched++;
                matched[1] = true;
            } else if (buttonsOpen[2] && buttonsOpen[4]){
                btn3.setDisable(true);
                btn5.setDisable(true);
                buttonsOpen[2] = !buttonsOpen[2];
                buttonsOpen[4] = !buttonsOpen[4];
                totalMatched++;
                matched[2] = true;
            } else if (buttonsOpen[3] && buttonsOpen[5]){
                btn4.setDisable(true);
                btn6.setDisable(true);
                buttonsOpen[3] = !buttonsOpen[3];
                buttonsOpen[5] = !buttonsOpen[5];
                totalMatched++;
                matched[3] = true;
            } else if (buttonsOpen[6] && buttonsOpen[9]){
                btn7.setDisable(true);
                btn10.setDisable(true);
                buttonsOpen[6] = !buttonsOpen[6];
                buttonsOpen[9] = !buttonsOpen[9];
                totalMatched++;
                matched[4] = true;
            } else if (buttonsOpen[7] && buttonsOpen[14]){
                btn8.setDisable(true);
                btn15.setDisable(true);
                buttonsOpen[7] = !buttonsOpen[7];
                buttonsOpen[14] = !buttonsOpen[14];
                totalMatched++;
                matched[5] = true;
            } else if (buttonsOpen[8] && buttonsOpen[10]){
                btn9.setDisable(true);
                btn11.setDisable(true);
                buttonsOpen[8] = !buttonsOpen[8];
                buttonsOpen[10] = !buttonsOpen[10];
                totalMatched++;
                matched[6] = true;
            } else if (buttonsOpen[11] && buttonsOpen[17]){
                btn12.setDisable(true);
                btn18.setDisable(true);
                buttonsOpen[11] = !buttonsOpen[11];
                buttonsOpen[17] = !buttonsOpen[17];
                totalMatched++;
                matched[7] = true;
            }  else if (buttonsOpen[16] && buttonsOpen[19]){
                btn17.setDisable(true);
                btn20.setDisable(true);
                buttonsOpen[16] = !buttonsOpen[16];
                buttonsOpen[19] = !buttonsOpen[19];
                totalMatched++;
                matched[8] = true;
            } else if (buttonsOpen[13] && buttonsOpen[15]){
                btn14.setDisable(true);
                btn16.setDisable(true);
                buttonsOpen[13] = !buttonsOpen[13];
                buttonsOpen[15] = !buttonsOpen[15];
                totalMatched++;
                matched[9] = true;
            }
        }
        openTwoButtonsOnly();
        if (totalMatched==10){
            switchToStartMenu();
        }
    }

    public void openTwoButtonsOnly() {
        int[] btnNumberStore = new int[2];
        int trueValue = 0;
        for (int i = 0; i < buttonsOpen.length; i++) {
            if (buttonsOpen[i]) {
                if (trueValue < 2) {
                    btnNumberStore[trueValue] = i;
                }
                trueValue++;
            }
        }
        if (trueValue == 2) {
            for (int i = 0; i < buttonsOpen.length; i++) {
                if (i != btnNumberStore[0] && i != btnNumberStore[1]) {
                    // Disable buttons that are not in btnNumberStore
                    invisibleButton(i);
                }
            }
        } else {
            for (int i = 0; i < buttonsOpen.length; i++) {
                visibleButton(i);
            }
        }
    }
    private void visibleButton(int index) {
        switch (index) {
            case 0:
                if (rndNumber == 0 && !matched[0]){
                    btn1.setVisible(true);
                    btn1.setDisable(false);
                } else if (rndNumber ==1 && !matched[0]){
                    btn1.setVisible(true);
                    btn1.setDisable(false);
                } else {
                    btn1.setDisable(true);
                }
                break;
            case 1:
                if (rndNumber == 0 && !matched[1]){
                    btn2.setVisible(true);
                    btn2.setDisable(false);
                } else if (rndNumber ==1 && !matched[1]){
                    btn2.setVisible(true);
                    btn2.setDisable(false);
                } else {
                    btn2.setDisable(true);
                }
                break;
            case 2:
                if (rndNumber == 0 && !matched[2]){
                    btn3.setVisible(true);
                    btn3.setDisable(false);
                } else if (rndNumber ==1 && !matched[2]){
                    btn3.setVisible(true);
                    btn3.setDisable(false);
                } else {
                    btn3.setDisable(true);
                }
                break;
            case 3:
                if (rndNumber == 0 && !matched[2]){
                    btn4.setVisible(true);
                    btn4.setDisable(false);
                } else if (rndNumber ==1 && !matched[2]){
                    btn4.setVisible(true);
                    btn4.setDisable(false);
                } else {
                    btn4.setDisable(true);
                }
                break;
            case 4:
                btn5.setVisible(true);
                btn5.setDisable(false);
                break;
            case 5:
                btn6.setVisible(true);
                btn6.setDisable(false);
                break;
            case 6:
                btn7.setVisible(true);
                btn7.setDisable(false);
                break;
            case 7:
                btn8.setVisible(true);
                btn8.setDisable(false);
                break;
            case 8:
                btn9.setVisible(true);
                btn9.setDisable(false);
                break;
            case 9:
                btn10.setVisible(true);
                btn10.setDisable(false);
                break;
            case 10:
                btn11.setVisible(true);
                btn11.setDisable(false);
                break;
            case 11:
                btn12.setVisible(true);
                btn12.setDisable(false);
                break;
            case 12:
                btn13.setVisible(true);
                btn13.setDisable(false);
                break;
            case 13:
                btn14.setVisible(true);
                btn14.setDisable(false);
                break;
            case 14:
                btn15.setVisible(true);
                btn15.setDisable(false);
                break;
            case 15:
                btn16.setVisible(true);
                btn16.setDisable(false);
                break;
            case 16:
                btn17.setVisible(true);
                btn17.setDisable(false);
                break;
            case 17:
                btn18.setVisible(true);
                btn18.setDisable(false);
                break;
            case 18:
                btn19.setVisible(true);
                btn19.setDisable(false);
                break;
            case 19:
                btn20.setVisible(true);
                btn20.setDisable(false);
                break;
            default:
                break;
        }
    }


    private void invisibleButton(int index) {
        switch (index) {
            case 0:
                btn1.setVisible(false);
                btn1.setDisable(true);
                break;
            case 1:
                btn2.setVisible(false);
                btn2.setDisable(true);
                break;
            case 2:
                btn3.setVisible(false);
                btn3.setDisable(true);
                break;
            case 3:
                btn4.setVisible(false);
                btn4.setDisable(true);
                break;
            case 4:
                btn5.setVisible(false);
                btn5.setDisable(true);
                break;
            case 5:
                btn6.setVisible(false);
                btn6.setDisable(true);
                break;
            case 6:
                btn7.setVisible(false);
                btn7.setDisable(true);
                break;
            case 7:
                btn8.setVisible(false);
                btn8.setDisable(true);
                break;
            case 8:
                btn9.setVisible(false);
                btn9.setDisable(true);
                break;
            case 9:
                btn10.setVisible(false);
                btn10.setDisable(true);
                break;
            case 10:
                btn11.setVisible(false);
                btn11.setDisable(true);
                break;
            case 11:
                btn12.setVisible(false);
                btn12.setDisable(true);
                break;
            case 12:
                btn13.setVisible(false);
                btn13.setDisable(true);
                break;
            case 13:
                btn14.setVisible(false);
                btn14.setDisable(true);
                break;
            case 14:
                btn15.setVisible(false);
                btn15.setDisable(true);
                break;
            case 15:
                btn16.setVisible(false);
                btn16.setDisable(true);
                break;
            case 16:
                btn17.setVisible(false);
                btn17.setDisable(true);
                break;
            case 17:
                btn18.setVisible(false);
                btn18.setDisable(true);
                break;
            case 18:
                btn19.setVisible(false);
                btn19.setDisable(true);
                break;
            case 19:
                btn20.setVisible(false);
                btn20.setDisable(true);
                break;
            default:
                break;
        }
    }
    public void falseAllButton(){
        for (int i = 0; i < buttonsOpen.length; i++){
            buttonsOpen[i] = false;
        }
        for (boolean b : buttonsOpen) {
            System.out.println(b);
        }
    }
    public void restrictions(boolean x){
        borderPane.setDisable(x);
        menuPane.setDisable(x);
    }
    public void startTime(){
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            secondsElapsed++;
            updateTimerLabel();
            if (secondsElapsed == 180) {
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
        resumeButton.setStyle("-fx-background-color: transparent; "); //Set background to transparent
        resumeButton.setText(""); // Set text to empty string
        newGameButton.setStyle("-fx-background-color: transparent; ");
        newGameButton.setText("");
        soundsButton.setStyle("-fx-background-color: transparent; ");
        soundsButton.setText("");
        exitButton.setStyle("-fx-background-color: transparent; ");
        exitButton.setText("");
    }
    public void setButtonsVisible(){
        menuVbox.setStyle("-fx-background-color: rgba(23,80,24,0.9);");
        resumeButton.setStyle("-fx-background-color: rgb(30,103,31); -fx-text-fill: white; -fx-font-family: 'Gaussian'; -fx-font-weight: bold; -fx-border-radius: 10px;");
        resumeButton.setText("Resume");
        newGameButton.setStyle("-fx-background-color: rgb(30,103,31); -fx-text-fill: white; -fx-font-family: 'Gaussian';  -fx-font-weight: bold;  -fx-border-radius: 10px;");
        newGameButton.setText("New Game");
        soundsButton.setStyle("-fx-background-color: rgb(30,103,31); -fx-text-fill: white; -fx-font-family: 'Gaussian';  -fx-font-weight: bold;  -fx-border-radius: 10px;");
        soundsButton.setText("Sounds");
        exitButton.setStyle("-fx-background-color: rgb(30,103,31); -fx-text-fill: white; -fx-font-family: 'Gaussian';  -fx-font-weight: bold;  -fx-border-radius: 10px; ");
        exitButton.setText("Exit Game");
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
    public void btn1ShowImage() throws Exception {
        Image btn1BackgroundImage = new Image(picturesUrl[0]);
        if (buttonsOpen[0]){
            btn1.setGraphic(null);
            buttonsOpen[0] = !buttonsOpen[0];
        } else {
            btn1_imageView = new ImageView(btn1BackgroundImage);
            btn1_imageView.setFitHeight(70);
            btn1_imageView.setFitWidth(70);
            btn1.setGraphic(btn1_imageView);
            buttonsOpen[0] = !buttonsOpen[0];
        }
        match_Checker();
    }
    public void btn2ShowImage() throws Exception {
        Image btn2BackgroundImage = new Image(picturesUrl[1]);
        if (buttonsOpen[1]){
            btn2.setGraphic(null);
            buttonsOpen[1] = !buttonsOpen[1];
        } else {
            btn2_imageView = new ImageView(btn2BackgroundImage);
            btn2_imageView.setFitHeight(70);
            btn2_imageView.setFitWidth(70);
            btn2.setGraphic(btn2_imageView);
            buttonsOpen[1] = !buttonsOpen[1];
        }
        match_Checker();
    }
    public void btn3ShowImage() throws Exception {
        Image btn3BackgroundImage = new Image(picturesUrl[2]);
        if (buttonsOpen[2]){
            btn3.setGraphic(null);
            buttonsOpen[2] = !buttonsOpen[2];
        } else {
            btn3_imageView = new ImageView(btn3BackgroundImage);
            btn3_imageView.setFitHeight(70);
            btn3_imageView.setFitWidth(70);
            btn3.setGraphic(btn3_imageView);
            buttonsOpen[2] = !buttonsOpen[2];
        }
        match_Checker();
    }
    public void btn4ShowImage() throws Exception {
        Image btn4BackgroundImage = new Image(picturesUrl[3]);
        if (buttonsOpen[3]){
            btn4.setGraphic(null);
            buttonsOpen[3] = !buttonsOpen[3];
        } else {
            btn4_imageView = new ImageView(btn4BackgroundImage);
            btn4_imageView.setFitHeight(70);
            btn4_imageView.setFitWidth(70);
            btn4.setGraphic(btn4_imageView);
            buttonsOpen[3] = !buttonsOpen[3];
        }
        match_Checker();
    }
    public void btn5ShowImage() throws Exception {
        Image btn5BackgroundImage = new Image(picturesUrl[4]);
        if (buttonsOpen[4]){
            btn5.setGraphic(null);
            buttonsOpen[4] = !buttonsOpen[4];
        } else {
            btn5_imageView = new ImageView(btn5BackgroundImage);
            btn5_imageView.setFitHeight(70);
            btn5_imageView.setFitWidth(70);
            btn5.setGraphic(btn5_imageView);
            buttonsOpen[4] = !buttonsOpen[4];
        }
        match_Checker();
    }
    public void btn6ShowImage() throws Exception {
        Image btn6BackgroundImage = new Image(picturesUrl[5]);
        if (buttonsOpen[5]){
            btn6.setGraphic(null);
            buttonsOpen[5] = !buttonsOpen[5];
        } else {
            btn6_imageView = new ImageView(btn6BackgroundImage);
            btn6_imageView.setFitHeight(70);
            btn6_imageView.setFitWidth(70);
            btn6.setGraphic(btn6_imageView);
            buttonsOpen[5] = !buttonsOpen[5];
        }
        match_Checker();
    }
    public void btn7ShowImage() throws Exception {
        Image btn7BackgroundImage = new Image(picturesUrl[6]);
        if (buttonsOpen[6]){
            btn7.setGraphic(null);
            buttonsOpen[6] = !buttonsOpen[6];
        } else {
            btn7_imageView = new ImageView(btn7BackgroundImage);
            btn7_imageView.setFitHeight(70);
            btn7_imageView.setFitWidth(70);
            btn7.setGraphic(btn7_imageView);
            buttonsOpen[6] = !buttonsOpen[6];
        }
        match_Checker();
    }
    public void btn8ShowImage() throws Exception {
        Image btn8BackgroundImage = new Image(picturesUrl[7]);
        if (buttonsOpen[7]){
            btn8.setGraphic(null);
            buttonsOpen[7] = !buttonsOpen[7];
        } else {
            btn8_imageView = new ImageView(btn8BackgroundImage);
            btn8_imageView.setFitHeight(70);
            btn8_imageView.setFitWidth(70);
            btn8.setGraphic(btn8_imageView);
            buttonsOpen[7] = !buttonsOpen[7];
        }
        match_Checker();
    }
    public void btn9ShowImage() throws Exception {
        Image btn9BackgroundImage = new Image(picturesUrl[8]);
        if (buttonsOpen[8]){
            btn9.setGraphic(null);
            buttonsOpen[8] = !buttonsOpen[8];
        } else {
            btn9_imageView = new ImageView(btn9BackgroundImage);
            btn9_imageView.setFitHeight(70);
            btn9_imageView.setFitWidth(70);
            btn9.setGraphic(btn9_imageView);
            buttonsOpen[8] = !buttonsOpen[8];
        }
        match_Checker();
    }
    public void btn10ShowImage() throws Exception {
        Image btn10BackgroundImage = new Image(picturesUrl[9]);
        if (buttonsOpen[9]){
            btn10.setGraphic(null);
            buttonsOpen[9] = !buttonsOpen[9];
        } else {
            btn10_imageView = new ImageView(btn10BackgroundImage);
            btn10_imageView.setFitHeight(70);
            btn10_imageView.setFitWidth(70);
            btn10.setGraphic(btn10_imageView);
            buttonsOpen[9] = !buttonsOpen[9];
        }
        match_Checker();
    }
    public void btn11ShowImage() throws Exception {
        Image btn11BackgroundImage = new Image(picturesUrl[10]);
        if (buttonsOpen[10]){
            btn11.setGraphic(null);
            buttonsOpen[10] = !buttonsOpen[10];
        } else {
            btn11_imageView = new ImageView(btn11BackgroundImage);
            btn11_imageView.setFitHeight(70);
            btn11_imageView.setFitWidth(70);
            btn11.setGraphic(btn11_imageView);
            buttonsOpen[10] = !buttonsOpen[10];
        }
        match_Checker();
    }
    public void btn12ShowImage() throws Exception {
        Image btn12BackgroundImage = new Image(picturesUrl[11]);
        if (buttonsOpen[11]){
            btn12.setGraphic(null);
            buttonsOpen[11] = !buttonsOpen[11];
        } else {
            btn12_imageView = new ImageView(btn12BackgroundImage);
            btn12_imageView.setFitHeight(70);
            btn12_imageView.setFitWidth(70);
            btn12.setGraphic(btn12_imageView);
            buttonsOpen[11] = !buttonsOpen[11];
        }
        match_Checker();
    }
    public void btn13ShowImage() throws Exception {
        Image btn13BackgroundImage = new Image(picturesUrl[12]);
        if (buttonsOpen[12]){
            btn13.setGraphic(null);
            buttonsOpen[12] = !buttonsOpen[12];
        } else {
            btn13_imageView = new ImageView(btn13BackgroundImage);
            btn13_imageView.setFitHeight(70);
            btn13_imageView.setFitWidth(70);
            btn13.setGraphic(btn13_imageView);
            buttonsOpen[12] = !buttonsOpen[12];
        }
        match_Checker();
    }
    public void btn14ShowImage() throws Exception {
        Image btn14BackgroundImage = new Image(picturesUrl[13]);
        if (buttonsOpen[13]){
            btn14.setGraphic(null);
            buttonsOpen[13] = !buttonsOpen[13];
        } else {
            btn14_imageView = new ImageView(btn14BackgroundImage);
            btn14_imageView.setFitHeight(70);
            btn14_imageView.setFitWidth(70);
            btn14.setGraphic(btn14_imageView);
            buttonsOpen[13] = !buttonsOpen[13];
        }
        match_Checker();
    }
    public void btn15ShowImage() throws Exception {
        Image btn15BackgroundImage = new Image(picturesUrl[14]);
        if (buttonsOpen[14]){
            btn15.setGraphic(null);
            buttonsOpen[14] = !buttonsOpen[14];
        } else {
            btn15_imageView = new ImageView(btn15BackgroundImage);
            btn15_imageView.setFitHeight(70);
            btn15_imageView.setFitWidth(70);
            btn15.setGraphic(btn15_imageView);
            buttonsOpen[14] = !buttonsOpen[14];
        }
        match_Checker();
    }
    public void btn16ShowImage() throws Exception {
        Image btn16BackgroundImage = new Image(picturesUrl[15]);
        if (buttonsOpen[15]){
            btn16.setGraphic(null);
            buttonsOpen[15] = !buttonsOpen[15];
        } else {
            btn16_imageView = new ImageView(btn16BackgroundImage);
            btn16_imageView.setFitHeight(70);
            btn16_imageView.setFitWidth(70);
            btn16.setGraphic(btn16_imageView);
            buttonsOpen[15] = !buttonsOpen[15];
        }
        match_Checker();
    }
    public void btn17ShowImage() throws Exception {
        Image btn17BackgroundImage = new Image(picturesUrl[16]);
        if (buttonsOpen[16]){
            btn17.setGraphic(null);
            buttonsOpen[16] = !buttonsOpen[16];
        } else {
            btn17_imageView = new ImageView(btn17BackgroundImage);
            btn17_imageView.setFitHeight(70);
            btn17_imageView.setFitWidth(70);
            btn17.setGraphic(btn17_imageView);
            buttonsOpen[16] = !buttonsOpen[16];
        }
        match_Checker();
    }
    public void btn18ShowImage() throws Exception {
        Image btn18BackgroundImage = new Image(picturesUrl[17]);
        if (buttonsOpen[17]){
            btn18.setGraphic(null);
            buttonsOpen[17] = !buttonsOpen[17];
        } else {
            btn18_imageView = new ImageView(btn18BackgroundImage);
            btn18_imageView.setFitHeight(70);
            btn18_imageView.setFitWidth(70);
            btn18.setGraphic(btn18_imageView);
            buttonsOpen[17] = !buttonsOpen[17];
        }
        match_Checker();
    }
    public void btn19ShowImage() throws Exception {
        Image btn19BackgroundImage = new Image(picturesUrl[18]);
        if (buttonsOpen[18]){
            btn19.setGraphic(null);
            buttonsOpen[18] = !buttonsOpen[18];
        } else {
            btn19_imageView = new ImageView(btn19BackgroundImage);
            btn19_imageView.setFitHeight(70);
            btn19_imageView.setFitWidth(70);
            btn19.setGraphic(btn19_imageView);
            buttonsOpen[18] = !buttonsOpen[18];
            System.out.println(buttonsOpen[18]);
        }
        match_Checker();
    }
    public void btn20ShowImage() throws Exception {
        Image btn20BackgroundImage = new Image(picturesUrl[19]);
        if (buttonsOpen[19]){
            btn20.setGraphic(null);
            buttonsOpen[19] = !buttonsOpen[19];
        } else {
            btn20_imageView = new ImageView(btn20BackgroundImage);
            btn20_imageView.setFitHeight(70);
            btn20_imageView.setFitWidth(70);
            btn20.setGraphic(btn20_imageView);
            buttonsOpen[19] = !buttonsOpen[19];
        }
        match_Checker();
    }
}