package com.example.carrental;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class NewVehicleController {

    @FXML
    private Button btnClose;

    @FXML
    private Button btnSelectPicture;

    @FXML
    private Button btnSubmit;

    @FXML
    private ComboBox<?> cbxAvailabilities;

    @FXML
    private ComboBox<?> cbxCategories;

    @FXML
    private ComboBox<?> cbxCondition;

    @FXML
    private ImageView pbxVehicle;

    @FXML
    private TextField txtDoors;

    @FXML
    private TextField txtMake;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtPassengers;

    @FXML
    private TextField txtTagNumber;

}
