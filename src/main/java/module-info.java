module com.example.javafxwebbrowser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.javafxwebbrowser to javafx.fxml;
    exports com.example.javafxwebbrowser;
}