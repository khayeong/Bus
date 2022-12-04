module com.example.bus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bus to javafx.fxml;
    exports com.example.bus;
}