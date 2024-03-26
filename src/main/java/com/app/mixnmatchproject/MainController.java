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
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class MainController {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Parent classroomGamefx;
    private Parent f1MotorSportfx;
    private Parent safarifx;
    private Parent underTheSeafx;
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
    public void displayClassroomSelection() {
        classroomImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/Classroom/Books.jpg")));
        category.setImage(classroomImage);
        classroomPlay = true;
        f1MotorSportPlay = false;
        safariPlay = false;
        underTheSeaPlay = false;
    }
    public void displayF1MotorSportsSelection() {
        f1MotorsportImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/Classroom/Notebooks_.jpg")));
        category.setImage(f1MotorsportImage);
        classroomPlay = false;
        f1MotorSportPlay = true;
        safariPlay = false;
        underTheSeaPlay = false;
    }
    public void displaySafariSelection() {
        safari = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/Classroom/Desk.jpg")));
        category.setImage(safari);
        classroomPlay = false;
        f1MotorSportPlay = false;
        safariPlay = true;
        underTheSeaPlay = false;
    }
    public void displayUnderTheSeaSelection() {
        underTheSea = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/CategoryPictures/Classroom/Pencil.png")));
        category.setImage(underTheSea);
        classroomPlay = false;
        f1MotorSportPlay = false;
        safariPlay = false;
        underTheSeaPlay = true;
    }

    public void playerChoiceChecker(ActionEvent e) throws IOException{
        classroomGamefx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ClassroomGame.fxml")));
        safarifx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("F1MotorSportGame.fxml")));
        f1MotorSportfx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("F1MotorSportGame.fxml")));
        underTheSeafx = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("F1MotorSportGame.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        if(classroomPlay){
            scene = new Scene(classroomGamefx);
            stage.setScene(scene);
            stage.show();
        } else if (f1MotorSportPlay) {
            scene = new Scene(f1MotorSportfx);
            stage.setScene(scene);
            stage.show();
        } else if (safariPlay) {
            scene = new Scene(safarifx);
            stage.setScene(scene);
            stage.show();
        } else if (underTheSeaPlay) {
            scene = new Scene(underTheSeafx);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void switchToSelectionScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SelectionWindow.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToInstruction(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("InstructionScreen.fxml")));
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

    public void exitApplication() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setContentText("Do you want to exit? ");
        if(alert.showAndWait().get() == ButtonType.OK){
            System.exit(0);
        }
    }
}