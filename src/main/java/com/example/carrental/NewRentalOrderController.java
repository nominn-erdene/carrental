package com.example.carrental;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NewRentalOrderController {

    @FXML
    private Button btnClose;

    @FXML
    private Button btnPrintPreview;

    @FXML
    private Button btnRentalRates;

    @FXML
    private Button btnSave;

    @FXML
    private ComboBox<?> cbxCustomerStates;

    @FXML
    private ComboBox<?> cbxOrderStatus;

    @FXML
    private ComboBox<?> cbxTanksLevels;

    @FXML
    private ComboBox<?> cbxVehicleConditions;

    @FXML
    private DatePicker dtpDateProcessed;

    @FXML
    private DatePicker dtpRentEndDate;

    @FXML
    private DatePicker dtpRentStartDate;

    @FXML
    private TextField txtCustomerAddress;

    @FXML
    private TextField txtCustomerCity;

    @FXML
    private TextField txtCustomerFirstName;

    @FXML
    private TextField txtCustomerLastName;

    @FXML
    private TextField txtCustomerZIPCode;

    @FXML
    private TextField txtEmployeeName;

    @FXML
    private TextField txtEmployeeNumber;

    @FXML
    private TextField txtMake;

    @FXML
    private TextField txtMileageEnd;

    @FXML
    private TextField txtMileageStart;

    @FXML
    private TextField txtMileageTotal;

    @FXML
    private TextField txtModel;

    @FXML
    private TextArea txtNotes;

    @FXML
    private TextField txtOrderTotal;

    @FXML
    private TextField txtRateApplied;

    @FXML
    private TextField txtReceiptNumber;

    @FXML
    private TextField txtSubTotal;

    @FXML
    private TextField txtTagNumber;

    @FXML
    private TextField txtTaxAmount;

    @FXML
    private TextField txtTaxRate;

    @FXML
    private TextField txtTotalDays;

}
