package com.example.carrental;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmployeeController {

    @FXML
    private Button btnClose;

    @FXML
    private Button btnNewEmployee;

    @FXML
    private TableColumn<?, ?> colEmployeeNumber;

    @FXML
    private TableColumn<?, ?> colFirstName;

    @FXML
    private TableColumn<?, ?> colLastName;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableView<?> tvwEmployees;

    @FXML
    void btnClose(ActionEvent event) {

    }

    @FXML
    void showNewEmployeeWin(ActionEvent event) {

    }

}
