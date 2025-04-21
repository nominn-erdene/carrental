package com.example.carrental;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BethesdaCarRental extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BethesdaCarRental.class.getResource("bethesda-car-rental.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 250);
        stage.setTitle("Bethesda Car Rental");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}