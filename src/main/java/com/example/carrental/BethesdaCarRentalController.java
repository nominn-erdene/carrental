package com.example.carrental;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class BethesdaCarRentalController {

    @FXML
    private Button btnClose;

    @FXML
    private Button btnEmployees;

    @FXML
    private Button btnRentalOrders;

    @FXML
    private Button btnVehicles;

    @FXML
    void closeApplication(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void employees(ActionEvent event) {

    }

    @FXML
    void rentalOrders(ActionEvent event) {

    }

    @FXML
    void vehicles(ActionEvent event) {

    }
}
