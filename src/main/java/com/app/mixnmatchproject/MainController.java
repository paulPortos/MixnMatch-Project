package com.app.mixnmatchproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;
public class MainController {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    ImageView category;
    Image classroomImage;
    Image f1MotorsportImage;
    Image safari;
    Image underTheSea;
    @FXML
    Button classroomBtn;

    public boolean classroomPlay;
    public boolean f1MotorSportPlay;
    public boolean safariPlay;
    public boolean underTheSeaPlay;


    @FXML
    public void displayClassroomSelectionEasy() {
        classroomImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/Classroom/classroombg.jpg")));
        category.setImage(classroomImage);
        classroomPlay = true;
        f1MotorSportPlay = false;
        safariPlay = false;
        underTheSeaPlay = false;
    }
    public void displayF1MotorSportsSelectionEasy() {
        f1MotorsportImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/F1 Motorsports/f1bg.png")));
        category.setImage(f1MotorsportImage);
        classroomPlay = false;
        f1MotorSportPlay = true;
        safariPlay = false;
        underTheSeaPlay = false;
    }
    public void displaySafariSelectionEasy() {
        safari = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/Safari/safaribg.jpg")));
        category.setImage(safari);
        classroomPlay = false;
        f1MotorSportPlay = false;
        safariPlay = true;
        underTheSeaPlay = false;
    }
    public void displayUnderTheSeaSelectionEasy() {
        underTheSea = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/Under The Sea/undertheseabg.jpg")));
        category.setImage(underTheSea);
        classroomPlay = false;
        f1MotorSportPlay = false;
        safariPlay = false;
        underTheSeaPlay = true;
    }

    public void noFunc(){
        System.out.println();
    }
    public void playerChoiceChecker(ActionEvent e) throws IOException{
        Parent classroomGamefx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/easy/EasyClassroomGame.fxml")));
        Parent safarifx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/easy/EasySafariGame.fxml")));
        Parent f1MotorSportfx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/easy/EasyF1MotorSportGame.fxml")));
        Parent underTheSeafx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/easy/EasyUnderTheSeaGame.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        if(classroomPlay){
            scene = new Scene(classroomGamefx);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else if (f1MotorSportPlay) {
            scene = new Scene(f1MotorSportfx);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else if (safariPlay) {
            scene = new Scene(safarifx);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else if (underTheSeaPlay) {
            scene = new Scene(underTheSeafx);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
    }

    public void playerChoiceCheckerHard(ActionEvent e) throws IOException{
        Parent classroomGamefx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/hard/HardClassroomGame.fxml")));
        Parent safarifx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/hard/HardSafariGame.fxml")));
        Parent f1MotorSportfx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/hard/HardF1MotorSportGame.fxml")));
        Parent underTheSeafx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gameDifficulty/hard/HardUnderTheSeaGame.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        if(classroomPlay) {
            scene = new Scene(classroomGamefx);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else if (f1MotorSportPlay) {
            scene = new Scene(f1MotorSportfx);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else if (safariPlay) {
            scene = new Scene(safarifx);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else if (underTheSeaPlay) {
            scene = new Scene(underTheSeafx);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
    }

    public void switchToEasySelectionScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ThemeSelectionEasy.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void switchToHardSelectionScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ThemeSelectionHard.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void switchToDifficultySelectionWindow(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DifficultySelectionWindow.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void switchToInstruction(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("InstructionScreen.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void goBackToMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartMenu.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void exitApplication() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setContentText("Do you want to exit? ");
        if(alert.showAndWait().get() == ButtonType.OK){
            System.exit(0);
        }
    }

}