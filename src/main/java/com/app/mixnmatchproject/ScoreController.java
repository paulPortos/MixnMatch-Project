package com.app.mixnmatchproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class ScoreController {
    public Label easyScore;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    ClassroomGameController classroomGameControllerEasyScore = new ClassroomGameController();

    public void initialize() throws IOException, ClassNotFoundException {
        System.out.println(classroomGameControllerEasyScore.secondsElapsed);
    }
    public void setValue(int x){
        easyScore.setText(Integer.toString(x));
    }
    public void goBackToMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartMenu.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
