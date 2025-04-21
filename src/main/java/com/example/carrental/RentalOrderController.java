package com.example.carrental;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RentalOrderController {

    @FXML
    private Button btnClose;

    @FXML
    private Button btnNewOrder;

    @FXML
    private Button btnUpdateOrder;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colCondition;

    @FXML
    private TableColumn<?, ?> colDateProcessed;

    @FXML
    private TableColumn<?, ?> colEndDate;

    @FXML
    private TableColumn<?, ?> colFirstName;

    @FXML
    private TableColumn<?, ?> colLastName;

    @FXML
    private TableColumn<?, ?> colMileageEnd;

    @FXML
    private TableColumn<?, ?> colMileageStart;

    @FXML
    private TableColumn<?, ?> colOrderStatus;

    @FXML
    private TableColumn<?, ?> colOrderTotal;

    @FXML
    private TableColumn<?, ?> colProcessedBy;

    @FXML
    private TableColumn<?, ?> colRateApplied;

    @FXML
    private TableColumn<?, ?> colReceiptNumber;

    @FXML
    private TableColumn<?, ?> colStartDate;

    @FXML
    private TableColumn<?, ?> colState;

    @FXML
    private TableColumn<?, ?> colSubTotal;

    @FXML
    private TableColumn<?, ?> colTankLevel;

    @FXML
    private TableColumn<?, ?> colTaxAmount;

    @FXML
    private TableColumn<?, ?> colTaxRate;

    @FXML
    private TableColumn<?, ?> colTotalDays;

    @FXML
    private TableColumn<?, ?> colTotalMiles;

    @FXML
    private TableColumn<?, ?> colVehicle;

    @FXML
    private TableColumn<?, ?> colZipCode;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleClose(ActionEvent event) {

    }

}
