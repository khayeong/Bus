package com.example.bus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SignUp {
    @FXML
    private TextField id;
    @FXML
    private PasswordField pw;
    @FXML
    private TextField name;

    public void signUp() {
        DBUtil db = new DBUtil();
        Connection conn = db.getConnection();

        PreparedStatement pstmt;
        String sql = "INSERT INTO users(id,pw,name) VALUES(?,?,?)";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id.getText());
            pstmt.setString(2, pw.getText());
            pstmt.setString(3, name.getText());
            pstmt.executeUpdate();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("");
            alert.setHeaderText("회원가입 성공");
            alert.setContentText("환영합니다!");
            System.out.println("삽입 성공!!");
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("");
            alert.setHeaderText("회원가입 실패");
            alert.setContentText("회원가입에 실패하였습니다.");
            System.out.println("삽입 실패!!");
        }
    }

    @FXML
    private Button goMainBtn;
    public void goMainScene() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("main.fxml"));
            Scene scene = new Scene(nextScene);

            Stage primaryStage = (Stage) goMainBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
