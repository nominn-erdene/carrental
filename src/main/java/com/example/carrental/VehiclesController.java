package com.example.carrental;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;

public class VehiclesController {

    @FXML
    private Button btnClose;

    @FXML
    private Button btnNewVehicle;

    @FXML
    private TableColumn<?, ?> colAvailability;

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colCondition;

    @FXML
    private TableColumn<?, ?> colDoors;

    @FXML
    private TableColumn<?, ?> colMake;

    @FXML
    private TableColumn<?, ?> colModel;

    @FXML
    private TableColumn<?, ?> colPassenger;

    @FXML
    private TableColumn<?, ?> colTag;

    @FXML
    private ImageView pbxVehicle;

    @FXML
    private TreeView<?> treeCarRental;

}
