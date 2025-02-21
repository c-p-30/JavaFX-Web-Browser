package com.example.javafxwebbrowser;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {// setting up the web browser

    @FXML
    private WebView webView;

    @FXML
    private TextField textField;

    private WebEngine engine;

    private String homePage;

    @Override
    public void initialize(URL argo, ResourceBundle arg1) {

        engine = webView.getEngine();
        homePage = "www.google.com";// setting the home page for the app
        textField.setText(homePage);
        loadPage();
    }

    public void loadPage(){
        //engine.load("https://www.google.com");
        engine.load("https://"+textField.getText()); //sets the url to automaticlly add https
    }

    public void refreshPage(){
        engine.reload();//reload button uses the engine reload function to mask a reload method
    }
}
