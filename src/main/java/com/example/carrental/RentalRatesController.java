package com.example.carrental;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RentalRatesController {

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colDaily;

    @FXML
    private TableColumn<?, ?> colMonthly;

    @FXML
    private TableColumn<?, ?> colWeekly;

    @FXML
    private TableView<?> rentalTable;

}
