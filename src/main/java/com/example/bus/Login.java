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
import java.sql.*;
import java.util.ArrayList;

public class Login {
    @FXML
    private TextField id;
    @FXML
    private PasswordField pw;
    @FXML
    private Button loginBtn;

    public void login() throws SQLException {
        DBUtil db = new DBUtil();
        Connection conn = db.getConnection();

        String sql = "SELECT id, pw FROM users";
        PreparedStatement pstmt;
        ResultSet rs;

        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery(sql);

        while (rs.next()) {
            String userid = rs.getString("id");
            String userpw = rs.getString("pw");
            if (id.getText().equals(userid) && pw.getText().equals(userpw)) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패");
            } break;
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
