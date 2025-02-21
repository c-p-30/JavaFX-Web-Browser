module com.example.javafxwebbrowser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxwebbrowser to javafx.fxml;
    exports com.example.javafxwebbrowser;
}