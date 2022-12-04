package com.example.bus;
import javafx.scene.control.Alert;

import java.sql.*;
import java.util.ArrayList;

public class DBUtil {

    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/bus";
        String userName = "root";
        String password = "";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

}
