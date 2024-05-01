package com.app.mixnmatchproject;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;
import java.util.Random;

@SuppressWarnings("CallToPrintStackTrace")
public class SafariGameHardController {
    @FXML
    public Pane borderPane;
    public Button startButton;
    public Pane menuPane;
    public VBox menuVbox;
    public Button resumeButton;
    public Button newGameButton;
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
    public ImageView btn21_imageView;
    public ImageView btn22_imageView;
    public ImageView btn23_imageView;
    public ImageView btn24_imageView;
    public ImageView btn25_imageView;
    public ImageView btn26_imageView;
    public ImageView btn27_imageView;
    public ImageView btn28_imageView;
    public ImageView btn29_imageView;
    public ImageView btn30_imageView;
    public ImageView btn31_imageView;
    public ImageView btn32_imageView;
    public ImageView btn33_imageView;
    public ImageView btn34_imageView;
    public ImageView btn35_imageView;
    public ImageView btn36_imageView;
    public Button btn22;
    public Button btn23;
    public Button btn24;
    public Button btn25;
    public Button btn26;
    public Button btn27;
    public Button btn28;
    public Button btn29;
    public Button btn30;
    public Button btn31;
    public Button btn32;
    public Button btn33;
    public Button btn34;
    public Button btn35;
    public Button btn36;
    public Button btn21;
    public Pane endNotifPanel;
    public Label endNotifLabel;
    public Button endNotifBtn;

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label timerLabel;
    private Timeline timeline;
    public String scoreTime;
    public int secondsElapsed = 0;
    public boolean menuClicked = false;
    boolean [] buttonsOpen = new boolean[36];
    String [] picturesUrl = new String[36];
    String [] url0 = {
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/bird watching.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/etosha national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/glampung site.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/kruger national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/glampung site.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lion king.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/bird watching.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/safari jeep.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lion king.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/safari jeep.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/etosha national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/savannahs.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/the big five.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/savannahs.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/the big five.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/treehouse.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/kruger national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/wetland.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/treehouse.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/wetland.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/African_leopard_male_(cropped).jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/compass.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/deer.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/African_leopard_male_(cropped).jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/hipo.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/compass.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/jag.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/licensed-image.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/deer.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/rino.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/hipo.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/jag.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lens.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/licensed-image.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/rino.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lens.jpeg"

    };
    String [] url1 = {
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/safari jeep.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/etosha national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/savannahs.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/the big five.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/savannahs.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/the big five.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/treehouse.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/kruger national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/wetland.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/treehouse.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/wetland.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/bird watching.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/etosha national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/glampung site.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/kruger national park.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/glampung site.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lion king.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/bird watching.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/safari jeep.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lion king.jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/African_leopard_male_(cropped).jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/compass.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/deer.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/African_leopard_male_(cropped).jpg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/hipo.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/compass.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/jag.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/licensed-image.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/deer.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/rino.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/hipo.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/jag.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lens.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/licensed-image.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/rino.jpeg",
            "com/app/mixnmatchproject/images/CategoryPictures/Safari/lens.jpeg"
    };
    @FXML
    public void initialize(){
        hideEndNotif();
    }
    @FXML
    public void pressStart(){
        restrictions(true);
        startTime();
        startButton.setDisable(true);
        startButton.setVisible(false);
        falseAllButton();
        getUrlNumber();
    }
    public void hideEndNotif(){
        endNotifBtn.setDisable(true);
        endNotifBtn.setVisible(false);
        endNotifPanel.setDisable(true);
        endNotifPanel.setVisible(false);
        endNotifLabel.setVisible(false);
        endNotifLabel.setDisable(true);
    }
    public void showEndNotif(){

        endNotifBtn.setDisable(false);
        endNotifBtn.setVisible(true);
        endNotifPanel.setDisable(false);
        endNotifPanel.setVisible(true);
        endNotifLabel.setVisible(true);
        endNotifLabel.setDisable(false);

        if (totalMatched == 18){
            if (secondsElapsed >=90) {
                double totalscore = ((secondsElapsed - 90) * 1.1111111111 - 100) ;
                int scoretotal= (int) Math.abs(totalscore);
                endNotifLabel.setText("Score: " + scoretotal);
            }
            else{
                endNotifLabel.setText("Score: 100");
            }
        }

        else {
            endNotifLabel.setText("Time's Up!");
        }


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
        rndNumber = randomNumber;
        System.out.println(rndNumber);
    }
    int rndNumber;
    int totalMatched = 0;
    boolean [] matched = new boolean[18];
    public void match_Checker() throws Exception {
        if (rndNumber == 0){
            if(buttonsOpen[0] && buttonsOpen[6]){
                buttonsOpen[0] = false;
                buttonsOpen[6] = false;
                totalMatched++;
                matched[0] = true;
            } else if (buttonsOpen[1] && buttonsOpen[10]){
                buttonsOpen[1] = false;
                buttonsOpen[10] = false;
                totalMatched++;
                matched[1] = true;
            } else if (buttonsOpen[2] && buttonsOpen[4]){
                buttonsOpen[2] = false;
                buttonsOpen[4] = false;
                totalMatched++;
                matched[2] = true;
            } else if (buttonsOpen[3] && buttonsOpen[16]){
                buttonsOpen[3] = false;
                buttonsOpen[16] = false;
                totalMatched++;
                matched[3] = true;
            } else if (buttonsOpen[5] && buttonsOpen[8]){
                buttonsOpen[5] = false;
                buttonsOpen[8] = false;
                totalMatched++;
                matched[4] = true;
            } else if (buttonsOpen[7] && buttonsOpen[9]){
                buttonsOpen[7] = false;
                buttonsOpen[9] = false;
                totalMatched++;
                matched[5] = true;
            }else if (buttonsOpen[11] && buttonsOpen[13]){
                buttonsOpen[11] = false;
                buttonsOpen[13] = false;
                totalMatched++;
                matched[6] = true;
            } else if (buttonsOpen[12] && buttonsOpen[14]){
                buttonsOpen[12] = false;
                buttonsOpen[14] = false;
                totalMatched++;
                matched[7] = true;
            }  else if (buttonsOpen[15] && buttonsOpen[18]){
                buttonsOpen[15] = false;
                buttonsOpen[18] = false;
                totalMatched++;
                matched[8] = true;
            } else if (buttonsOpen[17] && buttonsOpen[19]){
                buttonsOpen[17] = false;
                buttonsOpen[19] = false;
                totalMatched++;
                matched[9] = true;
            }
            else if (buttonsOpen[20] && buttonsOpen[23]){
                buttonsOpen[20] = false;
                buttonsOpen[23] = false;
                totalMatched++;
                matched[10] = true;
            } else if (buttonsOpen[21] && buttonsOpen[25]){
                buttonsOpen[21] = false;
                buttonsOpen[25] = false;
                totalMatched++;
                matched[11] = true;
            } else if (buttonsOpen[22] && buttonsOpen[28]){
                buttonsOpen[22] = false;
                buttonsOpen[28] = false;
                totalMatched++;
                matched[12] = true;
            } else if (buttonsOpen[24] && buttonsOpen[30]){
                buttonsOpen[24] = false;
                buttonsOpen[30] = false;
                totalMatched++;
                matched[13] = true;
            } else if (buttonsOpen[26] && buttonsOpen[31]){
                buttonsOpen[26] = false;
                buttonsOpen[31] = false;
                totalMatched++;
                matched[14] = true;
            }else if (buttonsOpen[27] && buttonsOpen[33]){
                buttonsOpen[27] = false;
                buttonsOpen[33] = false;
                totalMatched++;
                matched[15] = true;
            } else if (buttonsOpen[29] && buttonsOpen[34]){
                buttonsOpen[29] = false;
                buttonsOpen[34] = false;
                totalMatched++;
                matched[16] = true;
            }  else if (buttonsOpen[32] && buttonsOpen[35]){
                buttonsOpen[32] = false;
                buttonsOpen[35] = false;
                totalMatched++;
                matched[17] = true;
            }}
        else {
            if(buttonsOpen[0] && buttonsOpen[18]){
                buttonsOpen[0] = false;
                buttonsOpen[18] = false;
                totalMatched++;
                matched[0] = true;
            } else if (buttonsOpen[1] && buttonsOpen[12]){
                buttonsOpen[1] = false;
                buttonsOpen[12] = false;
                totalMatched++;
                matched[1] = true;
            } else if (buttonsOpen[2] && buttonsOpen[4]){
                buttonsOpen[2] = false;
                buttonsOpen[4] = false;
                totalMatched++;
                matched[2] = true;
            } else if (buttonsOpen[3] && buttonsOpen[5]){
                buttonsOpen[3] = false;
                buttonsOpen[5] = false;
                totalMatched++;
                matched[3] = true;
            } else if (buttonsOpen[6] && buttonsOpen[9]){
                buttonsOpen[6] = false;
                buttonsOpen[9] = false;
                totalMatched++;
                matched[4] = true;
            } else if (buttonsOpen[7] && buttonsOpen[14]){
                buttonsOpen[7] = false;
                buttonsOpen[14] = false;
                totalMatched++;
                matched[5] = true;
            } else if (buttonsOpen[8] && buttonsOpen[10]){
                buttonsOpen[8] = false;
                buttonsOpen[10] = false;
                totalMatched++;
                matched[6] = true;
            } else if (buttonsOpen[11] && buttonsOpen[17]){
                buttonsOpen[11] = false;
                buttonsOpen[17] = false;
                totalMatched++;
                matched[7] = true;
            }  else if (buttonsOpen[16] && buttonsOpen[19]){
                buttonsOpen[16] = false;
                buttonsOpen[19] = false;
                totalMatched++;
                matched[8] = true;
            } else if (buttonsOpen[13] && buttonsOpen[15]){
                buttonsOpen[13] = false;
                buttonsOpen[15] = false;
                totalMatched++;
                matched[9] = true;
            }
            else if (buttonsOpen[20] && buttonsOpen[23]){
                buttonsOpen[20] = false;
                buttonsOpen[23] = false;
                totalMatched++;
                matched[10] = true;
            } else if (buttonsOpen[21] && buttonsOpen[25]){
                buttonsOpen[21] = false;
                buttonsOpen[25] = false;
                totalMatched++;
                matched[11] = true;
            } else if (buttonsOpen[22] && buttonsOpen[28]){
                buttonsOpen[22] = false;
                buttonsOpen[28] = false;
                totalMatched++;
                matched[12] = true;
            } else if (buttonsOpen[24] && buttonsOpen[30]){
                buttonsOpen[24] = false;
                buttonsOpen[30] = false;
                totalMatched++;
                matched[13] = true;
            } else if (buttonsOpen[26] && buttonsOpen[31]){
                buttonsOpen[26] = false;
                buttonsOpen[31] = false;
                totalMatched++;
                matched[14] = true;
            }else if (buttonsOpen[27] && buttonsOpen[33]){
                buttonsOpen[27] = false;
                buttonsOpen[33] = false;
                totalMatched++;
                matched[15] = true;
            } else if (buttonsOpen[29] && buttonsOpen[34]){
                buttonsOpen[29] = false;
                buttonsOpen[34] = false;
                totalMatched++;
                matched[16] = true;
            }  else if (buttonsOpen[32] && buttonsOpen[35]){
                buttonsOpen[32] = false;
                buttonsOpen[35] = false;
                totalMatched++;
                matched[17] = true;
            }



        }
        openTwoButtonsOnly();
        if (totalMatched==18){
            scoreTime = String.valueOf(secondsElapsed);
            System.out.println(scoreTime);
            showEndNotif();
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
                    btn1.setVisible(true);
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
                    btn2.setVisible(true);
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
                    btn3.setVisible(true);
                    btn3.setDisable(true);
                }
                break;
            case 3:
                if (rndNumber == 0 && !matched[3]){
                    btn4.setVisible(true);
                    btn4.setDisable(false);
                } else if (rndNumber ==1 && !matched[3]){
                    btn4.setVisible(true);
                    btn4.setDisable(false);
                } else {
                    btn4.setVisible(true);
                    btn4.setDisable(true);
                }
                break;
            case 4:
                if (rndNumber == 0 && !matched[2]){
                    btn5.setVisible(true);
                    btn5.setDisable(false);
                } else if (rndNumber ==1 && !matched[2]){
                    btn5.setVisible(true);
                    btn5.setDisable(false);
                } else {
                    btn5.setVisible(true);
                    btn5.setDisable(true);
                }
            case 5:
                if (rndNumber == 0 && !matched[4]){
                    btn6.setVisible(true);
                    btn6.setDisable(false);
                } else if (rndNumber ==1 && !matched[3]){
                    btn6.setVisible(true);
                    btn6.setDisable(false);
                } else {
                    btn6.setVisible(true);
                    btn6.setDisable(true);
                }
            case 6:
                if (rndNumber == 0 && !matched[0]){
                    btn7.setVisible(true);
                    btn7.setDisable(false);
                } else if (rndNumber == 1 && !matched[4]){
                    btn7.setVisible(true);
                    btn7.setDisable(false);
                } else {
                    btn7.setVisible(true);
                    btn7.setDisable(true);
                }
                break;
            case 7:
                if (rndNumber == 0 && !matched[5]){
                    btn8.setVisible(true);
                    btn8.setDisable(false);
                } else if (rndNumber == 1 && !matched[5]){
                    btn8.setVisible(true);
                    btn8.setDisable(false);
                } else {
                    btn8.setVisible(true);
                    btn8.setDisable(true);
                }
                break;
            case 8:
                if (rndNumber == 0 && !matched[4]){
                    btn9.setVisible(true);
                    btn9.setDisable(false);
                } else if (rndNumber == 1 && !matched[6]){
                    btn9.setVisible(true);
                    btn9.setDisable(false);
                } else {
                    btn9.setVisible(true);
                    btn9.setDisable(true);
                }
                break;
            case 9:
                if (rndNumber == 0 && !matched[5]){
                    btn10.setVisible(true);
                    btn10.setDisable(false);
                } else if (rndNumber == 1 && !matched[4]){
                    btn10.setVisible(true);
                    btn10.setDisable(false);
                } else {
                    btn10.setVisible(true);
                    btn10.setDisable(true);
                }
                break;
            case 10:
                if (rndNumber == 0 && !matched[1]){
                    btn11.setVisible(true);
                    btn11.setDisable(false);
                } else if (rndNumber == 1 && !matched[6]){
                    btn11.setVisible(true);
                    btn11.setDisable(false);
                } else {
                    btn11.setVisible(true);
                    btn11.setDisable(true);
                }
                break;
            case 11:
                if (rndNumber == 0 && !matched[6]){
                    btn12.setVisible(true);
                    btn12.setDisable(false);
                } else if (rndNumber == 1 && !matched[7]){
                    btn12.setVisible(true);
                    btn12.setDisable(false);
                } else {
                    btn12.setVisible(true);
                    btn12.setDisable(true);
                }
                break;
            case 12:
                if (rndNumber == 0 && !matched[7]){
                    btn13.setVisible(true);
                    btn13.setDisable(false);
                } else if (rndNumber == 1 && !matched[1]){
                    btn13.setVisible(true);
                    btn13.setDisable(false);
                } else {
                    btn13.setVisible(true);
                    btn13.setDisable(true);
                }
                break;
            case 13:
                if (rndNumber == 0 && !matched[6]){
                    btn14.setVisible(true);
                    btn14.setDisable(false);
                } else if (rndNumber == 1 && !matched[9]){
                    btn14.setVisible(true);
                    btn14.setDisable(false);
                } else {
                    btn14.setVisible(true);
                    btn14.setDisable(true);
                }
                break;
            case 14:
                if (rndNumber == 0 && !matched[7]){
                    btn15.setVisible(true);
                    btn15.setDisable(false);
                } else if (rndNumber == 1 && !matched[5]){
                    btn15.setVisible(true);
                    btn15.setDisable(false);
                } else {
                    btn15.setVisible(true);
                    btn15.setDisable(true);
                }

                break;
            case 15:
                if (rndNumber == 0 && !matched[8]){
                    btn16.setVisible(true);
                    btn16.setDisable(false);
                } else if (rndNumber == 1 && !matched[9]){
                    btn16.setVisible(true);
                    btn16.setDisable(false);
                } else {
                    btn16.setVisible(true);
                    btn16.setDisable(true);
                }

                break;
            case 16:
                if (rndNumber == 0 && !matched[3]){
                    btn17.setVisible(true);
                    btn17.setDisable(false);
                } else if (rndNumber == 1 && !matched[8]){
                    btn17.setVisible(true);
                    btn17.setDisable(false);
                } else {
                    btn17.setVisible(true);
                    btn17.setDisable(true);
                }
                break;
            case 17:
                if (rndNumber == 0 && !matched[9]){
                    btn18.setVisible(true);
                    btn18.setDisable(false);
                } else if (rndNumber == 1 && !matched[7]){
                    btn18.setVisible(true);
                    btn18.setDisable(false);
                } else {
                    btn18.setVisible(true);
                    btn18.setDisable(true);
                }
                break;
            case 18:
                if (rndNumber == 0 && !matched[8]){
                    btn19.setVisible(true);
                    btn19.setDisable(false);
                } else if (rndNumber == 1 && !matched[0]){
                    btn19.setVisible(true);
                    btn19.setDisable(false);
                } else {
                    btn19.setVisible(true);
                    btn19.setDisable(true);
                }
                break;
            case 19:
                if (rndNumber == 0 && !matched[9]){
                    btn20.setVisible(true);
                    btn20.setDisable(false);
                } else if (rndNumber == 1 && !matched[8]){
                    btn20.setVisible(true);
                    btn20.setDisable(false);
                } else {
                    btn20.setVisible(true);
                    btn20.setDisable(true);
                }
                break;
            case 20:
                if (rndNumber == 0 && !matched[10]){
                    btn21.setVisible(true);
                    btn21.setDisable(false);
                } else if (rndNumber ==1 && !matched[10]){
                    btn21.setVisible(true);
                    btn21.setDisable(false);
                } else {
                    btn21.setVisible(true);
                    btn21.setDisable(true);
                }
                break;
            case 21:
                if (rndNumber == 0 && !matched[11]){
                    btn22.setVisible(true);
                    btn22.setDisable(false);
                } else if (rndNumber ==1 && !matched[11]){
                    btn22.setVisible(true);
                    btn22.setDisable(false);
                } else {
                    btn22.setVisible(true);
                    btn22.setDisable(true);
                }
                break;
            case 22:
                if (rndNumber == 0 && !matched[12]){
                    btn23.setVisible(true);
                    btn23.setDisable(false);
                } else if (rndNumber ==1 && !matched[12]){
                    btn23.setVisible(true);
                    btn23.setDisable(false);
                } else {
                    btn23.setVisible(true);
                    btn23.setDisable(true);
                }
                break;
            case 23:
                if (rndNumber == 0 && !matched[10]){
                    btn24.setVisible(true);
                    btn24.setDisable(false);
                } else if (rndNumber ==1 && !matched[10]){
                    btn24.setVisible(true);
                    btn24.setDisable(false);
                } else {
                    btn24.setVisible(true);
                    btn24.setDisable(true);
                }
                break;
            case 24:
                if (rndNumber == 0 && !matched[13]){
                    btn25.setVisible(true);
                    btn25.setDisable(false);
                } else if (rndNumber ==1 && !matched[13]){
                    btn25.setVisible(true);
                    btn25.setDisable(false);
                } else {
                    btn25.setVisible(true);
                    btn25.setDisable(true);
                }
            case 25:
                if (rndNumber == 0 && !matched[11]){
                    btn26.setVisible(true);
                    btn26.setDisable(false);
                } else if (rndNumber ==1 && !matched[11]){
                    btn26.setVisible(true);
                    btn26.setDisable(false);
                } else {
                    btn26.setVisible(true);
                    btn26.setDisable(true);
                }
            case 26:
                if (rndNumber == 0 && !matched[14]){
                    btn27.setVisible(true);
                    btn27.setDisable(false);
                } else if (rndNumber == 1 && !matched[14]){
                    btn27.setVisible(true);
                    btn27.setDisable(false);
                } else {
                    btn27.setVisible(true);
                    btn27.setDisable(true);
                }
                break;
            case 27:
                if (rndNumber == 0 && !matched[15]){
                    btn28.setVisible(true);
                    btn28.setDisable(false);
                } else if (rndNumber == 1 && !matched[15]){
                    btn28.setVisible(true);
                    btn28.setDisable(false);
                } else {
                    btn28.setVisible(true);
                    btn28.setDisable(true);
                }
                break;
            case 28:
                if (rndNumber == 0 && !matched[12]){
                    btn29.setVisible(true);
                    btn29.setDisable(false);
                } else if (rndNumber == 1 && !matched[12]){
                    btn29.setVisible(true);
                    btn29.setDisable(false);
                } else {
                    btn29.setVisible(true);
                    btn29.setDisable(true);
                }
                break;
            case 29:
                if (rndNumber == 0 && !matched[16]){
                    btn30.setVisible(true);
                    btn30.setDisable(false);
                } else if (rndNumber == 1 && !matched[16]){
                    btn30.setVisible(true);
                    btn30.setDisable(false);
                } else {
                    btn30.setVisible(true);
                    btn30.setDisable(true);
                }
                break;
            case 30:
                if (rndNumber == 0 && !matched[13]){
                    btn31.setVisible(true);
                    btn31.setDisable(false);
                } else if (rndNumber == 1 && !matched[13]){
                    btn31.setVisible(true);
                    btn31.setDisable(false);
                } else {
                    btn31.setVisible(true);
                    btn31.setDisable(true);
                }
                break;
            case 31:
                if (rndNumber == 0 && !matched[14]){
                    btn32.setVisible(true);
                    btn32.setDisable(false);
                } else if (rndNumber == 1 && !matched[14]){
                    btn32.setVisible(true);
                    btn32.setDisable(false);
                } else {
                    btn32.setVisible(true);
                    btn32.setDisable(true);
                }
                break;
            case 32:
                if (rndNumber == 0 && !matched[17]){
                    btn33.setVisible(true);
                    btn33.setDisable(false);
                } else if (rndNumber == 1 && !matched[17]){
                    btn33.setVisible(true);
                    btn33.setDisable(false);
                } else {
                    btn33.setVisible(true);
                    btn33.setDisable(true);
                }
                break;
            case 33:
                if (rndNumber == 0 && !matched[15]){
                    btn34.setVisible(true);
                    btn34.setDisable(false);
                } else if (rndNumber == 1 && !matched[15]){
                    btn34.setVisible(true);
                    btn34.setDisable(false);
                } else {
                    btn34.setVisible(true);
                    btn34.setDisable(true);
                }
                break;
            case 34:
                if (rndNumber == 0 && !matched[16]){
                    btn35.setVisible(true);
                    btn35.setDisable(false);
                } else if (rndNumber == 1 && !matched[16]){
                    btn35.setVisible(true);
                    btn35.setDisable(false);
                } else {
                    btn35.setVisible(true);
                    btn35.setDisable(true);
                }

                break;
            case 35:
                if (rndNumber == 0 && !matched[17]){
                    btn36.setVisible(true);
                    btn36.setDisable(false);
                } else if (rndNumber == 1 && !matched[17]){
                    btn36.setVisible(true);
                    btn36.setDisable(false);
                } else {
                    btn36.setVisible(true);
                    btn36.setDisable(true);
                }
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
            case 20:
                btn21.setVisible(false);
                btn21.setDisable(true);
                break;
            case 21:
                btn22.setVisible(false);
                btn22.setDisable(true);
                break;
            case 22:
                btn23.setVisible(false);
                btn23.setDisable(true);
                break;
            case 23:
                btn24.setVisible(false);
                btn24.setDisable(true);
                break;
            case 24:
                btn25.setVisible(false);
                btn25.setDisable(true);
                break;
            case 25:
                btn26.setVisible(false);
                btn26.setDisable(true);
                break;
            case 26:
                btn27.setVisible(false);
                btn27.setDisable(true);
                break;
            case 27:
                btn28.setVisible(false);
                btn28.setDisable(true);
                break;
            case 28:
                btn29.setVisible(false);
                btn29.setDisable(true);
                break;
            case 29:
                btn30.setVisible(false);
                btn30.setDisable(true);
                break;
            case 30:
                btn31.setVisible(false);
                btn31.setDisable(true);
                break;
            case 31:
                btn32.setVisible(false);
                btn32.setDisable(true);
                break;
            case 32:
                btn33.setVisible(false);
                btn33.setDisable(true);
                break;
            case 33:
                btn34.setVisible(false);
                btn34.setDisable(true);
                break;
            case 34:
                btn35.setVisible(false);
                btn35.setDisable(true);
                break;
            case 35:
                btn36.setVisible(false);
                btn36.setDisable(true);
                break;

            default:
                break;
        }
    }
    public void falseAllButton(){
        for (int i = 0; i < buttonsOpen.length; i++){
            buttonsOpen[i] = false;
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
                    showEndNotif();

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
        exitButton.setStyle("-fx-background-color: transparent; ");
        exitButton.setText("");
    }
    public void setButtonsVisible(){
        menuVbox.setStyle("-fx-background-color: #C5C6C7;");
        resumeButton.setStyle("-fx-background-color: #676765; -fx-text-fill: white; -fx-font-family: 'Gaussian'; -fx-font-weight: bold; -fx-border-radius: 10px;");
        resumeButton.setText("Resume");
        newGameButton.setStyle("-fx-background-color: #676765; -fx-text-fill: white; -fx-font-family: 'Gaussian';  -fx-font-weight: bold;  -fx-border-radius: 10px;");
        newGameButton.setText("New Game");
        exitButton.setStyle("-fx-background-color: #676765; -fx-text-fill: white; -fx-font-family: 'Gaussian';  -fx-font-weight: bold;  -fx-border-radius: 10px; ");
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
    public void btn21ShowImage() throws Exception {
        Image btn21BackgroundImage = new Image(picturesUrl[20]);
        if (buttonsOpen[20]) {
            btn21.setGraphic(null);
            buttonsOpen[20] = !buttonsOpen[20];
        } else {
            btn21_imageView = new ImageView(btn21BackgroundImage);
            btn21_imageView.setFitHeight(70);
            btn21_imageView.setFitWidth(70);
            btn21.setGraphic(btn21_imageView);
            buttonsOpen[20] = !buttonsOpen[20];
        }
        match_Checker();
    }

    public void btn22ShowImage() throws Exception {
        Image btn22BackgroundImage = new Image(picturesUrl[21]);
        if (buttonsOpen[21]) {
            btn22.setGraphic(null);
            buttonsOpen[21] = !buttonsOpen[21];
        } else {
            btn22_imageView = new ImageView(btn22BackgroundImage);
            btn22_imageView.setFitHeight(70);
            btn22_imageView.setFitWidth(70);
            btn22.setGraphic(btn22_imageView);
            buttonsOpen[21] = !buttonsOpen[21];
        }
        match_Checker();
    }

    public void btn23ShowImage() throws Exception {
        Image btn23BackgroundImage = new Image(picturesUrl[22]);
        if (buttonsOpen[22]) {
            btn23.setGraphic(null);
            buttonsOpen[22] = !buttonsOpen[22];
        } else {
            btn23_imageView = new ImageView(btn23BackgroundImage);
            btn23_imageView.setFitHeight(70);
            btn23_imageView.setFitWidth(70);
            btn23.setGraphic(btn23_imageView);
            buttonsOpen[22] = !buttonsOpen[22];
        }
        match_Checker();
    }
    public void btn24ShowImage() throws Exception {
        Image btn24BackgroundImage = new Image(picturesUrl[23]);
        if (buttonsOpen[23]) {
            btn24.setGraphic(null);
            buttonsOpen[23] = !buttonsOpen[23];
        } else {
            btn24_imageView = new ImageView(btn24BackgroundImage);
            btn24_imageView.setFitHeight(70);
            btn24_imageView.setFitWidth(70);
            btn24.setGraphic(btn24_imageView);
            buttonsOpen[23] = !buttonsOpen[23];
        }
        match_Checker();
    }

    public void btn25ShowImage() throws Exception {
        Image btn25BackgroundImage = new Image(picturesUrl[24]);
        if (buttonsOpen[24]) {
            btn25.setGraphic(null);
            buttonsOpen[24] = !buttonsOpen[24];
        } else {
            btn25_imageView = new ImageView(btn25BackgroundImage);
            btn25_imageView.setFitHeight(70);
            btn25_imageView.setFitWidth(70);
            btn25.setGraphic(btn25_imageView);
            buttonsOpen[24] = !buttonsOpen[24];
        }
        match_Checker();
    }

    public void btn26ShowImage() throws Exception {
        Image btn26BackgroundImage = new Image(picturesUrl[25]);
        if (buttonsOpen[25]) {
            btn26.setGraphic(null);
            buttonsOpen[25] = !buttonsOpen[25];
        } else {
            btn26_imageView = new ImageView(btn26BackgroundImage);
            btn26_imageView.setFitHeight(70);
            btn26_imageView.setFitWidth(70);
            btn26.setGraphic(btn26_imageView);
            buttonsOpen[25] = !buttonsOpen[25];
        }
        match_Checker();
    }
    public void btn27ShowImage() throws Exception {
        Image btn27BackgroundImage = new Image(picturesUrl[26]);
        if (buttonsOpen[26]) {
            btn27.setGraphic(null);
            buttonsOpen[26] = !buttonsOpen[26];
        } else {
            btn27_imageView = new ImageView(btn27BackgroundImage);
            btn27_imageView.setFitHeight(70);
            btn27_imageView.setFitWidth(70);
            btn27.setGraphic(btn27_imageView);
            buttonsOpen[26] = !buttonsOpen[26];
        }
        match_Checker();
    }

    public void btn28ShowImage() throws Exception {
        Image btn28BackgroundImage = new Image(picturesUrl[27]);
        if (buttonsOpen[27]) {
            btn28.setGraphic(null);
            buttonsOpen[27] = !buttonsOpen[27];
        } else {
            btn28_imageView = new ImageView(btn28BackgroundImage);
            btn28_imageView.setFitHeight(70);
            btn28_imageView.setFitWidth(70);
            btn28.setGraphic(btn28_imageView);
            buttonsOpen[27] = !buttonsOpen[27];
        }
        match_Checker();
    }

    public void btn29ShowImage() throws Exception {
        Image btn29BackgroundImage = new Image(picturesUrl[28]);
        if (buttonsOpen[28]) {
            btn29.setGraphic(null);
            buttonsOpen[28] = !buttonsOpen[28];
        } else {
            btn29_imageView = new ImageView(btn29BackgroundImage);
            btn29_imageView.setFitHeight(70);
            btn29_imageView.setFitWidth(70);
            btn29.setGraphic(btn29_imageView);
            buttonsOpen[28] = !buttonsOpen[28];
        }
        match_Checker();
    }

    public void btn30ShowImage() throws Exception {
        Image btn30BackgroundImage = new Image(picturesUrl[29]);
        if (buttonsOpen[29]) {
            btn30.setGraphic(null);
            buttonsOpen[29] = !buttonsOpen[29];
        } else {
            btn30_imageView = new ImageView(btn30BackgroundImage);
            btn30_imageView.setFitHeight(70);
            btn30_imageView.setFitWidth(70);
            btn30.setGraphic(btn30_imageView);
            buttonsOpen[29] = !buttonsOpen[29];
        }
        match_Checker();
    }
    public void btn31ShowImage() throws Exception {
        Image btn31BackgroundImage = new Image(picturesUrl[30]);
        if (buttonsOpen[30]) {
            btn31.setGraphic(null);
            buttonsOpen[30] = !buttonsOpen[30];
        } else {
            btn31_imageView = new ImageView(btn31BackgroundImage);
            btn31_imageView.setFitHeight(70);
            btn31_imageView.setFitWidth(70);
            btn31.setGraphic(btn31_imageView);
            buttonsOpen[30] = !buttonsOpen[30];
        }
        match_Checker();
    }

    public void btn32ShowImage() throws Exception {
        Image btn32BackgroundImage = new Image(picturesUrl[31]);
        if (buttonsOpen[31]) {
            btn32.setGraphic(null);
            buttonsOpen[31] = !buttonsOpen[31];
        } else {
            btn32_imageView = new ImageView(btn32BackgroundImage);
            btn32_imageView.setFitHeight(70);
            btn32_imageView.setFitWidth(70);
            btn32.setGraphic(btn32_imageView);
            buttonsOpen[31] = !buttonsOpen[31];
        }
        match_Checker();
    }

    public void btn33ShowImage() throws Exception {
        Image btn33BackgroundImage = new Image(picturesUrl[32]);
        if (buttonsOpen[32]) {
            btn33.setGraphic(null);
            buttonsOpen[32] = !buttonsOpen[32];
        } else {
            btn33_imageView = new ImageView(btn33BackgroundImage);
            btn33_imageView.setFitHeight(70);
            btn33_imageView.setFitWidth(70);
            btn33.setGraphic(btn33_imageView);
            buttonsOpen[32] = !buttonsOpen[32];
        }
        match_Checker();
    }
    public void btn34ShowImage() throws Exception {
        Image btn34BackgroundImage = new Image(picturesUrl[33]);
        if (buttonsOpen[33]) {
            btn34.setGraphic(null);
            buttonsOpen[33] = !buttonsOpen[33];
        } else {
            btn34_imageView = new ImageView(btn34BackgroundImage);
            btn34_imageView.setFitHeight(70);
            btn34_imageView.setFitWidth(70);
            btn34.setGraphic(btn34_imageView);
            buttonsOpen[33] = !buttonsOpen[33];
        }
        match_Checker();
    }

    public void btn35ShowImage() throws Exception {
        Image btn35BackgroundImage = new Image(picturesUrl[34]);
        if (buttonsOpen[34]) {
            btn35.setGraphic(null);
            buttonsOpen[34] = !buttonsOpen[34];
        } else {
            btn35_imageView = new ImageView(btn35BackgroundImage);
            btn35_imageView.setFitHeight(70);
            btn35_imageView.setFitWidth(70);
            btn35.setGraphic(btn35_imageView);
            buttonsOpen[34] = !buttonsOpen[34];
        }
        match_Checker();
    }

    public void btn36ShowImage() throws Exception {
        Image btn36BackgroundImage = new Image(picturesUrl[35]);
        if (buttonsOpen[35]) {
            btn36.setGraphic(null);
            buttonsOpen[35] = !buttonsOpen[35];
        } else {
            btn36_imageView = new ImageView(btn36BackgroundImage);
            btn36_imageView.setFitHeight(70);
            btn36_imageView.setFitWidth(70);
            btn36.setGraphic(btn36_imageView);
            buttonsOpen[35] = !buttonsOpen[35];
        }
        match_Checker();
    }

}