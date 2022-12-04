package com.example.bus;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.*;

public class Main {
    @FXML
    private Button signupBtn;
    public void signupScene() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("signup.fxml"));
            Scene scene = new Scene(nextScene);

            Stage primaryStage = (Stage) signupBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button loginBtn;
    public void loginScene() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(nextScene);

            Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void search() throws IOException {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub.fxml"));
            Scene scene = new Scene(nextScene);

            Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button explainBtn;
    public void explainScene() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("explain.fxml"));
            Scene scene = new Scene(nextScene);

            Stage primaryStage = (Stage) explainBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
