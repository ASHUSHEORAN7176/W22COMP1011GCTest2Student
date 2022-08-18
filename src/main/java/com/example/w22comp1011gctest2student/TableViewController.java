
/*
 *Student Name-Ashu Sheoran
 * Student id -200485170
 */
package com.example.w22comp1011gctest2student;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class TableViewController {
    @FXML
    private Label saleLabel;

    @FXML
    private Label msrpLabel;

    @FXML
    private Label savingsLabel;

    @FXML
    private Label rowsInTableLabel;

    @FXML
    private TableView<Customer> tableView;

    @FXML
    private TableColumn<Customer, Integer> idColumn;

    @FXML
    private TableColumn<Customer, String> firstNameColumn;

    @FXML
    private TableColumn<Customer, String> lastNameColumn;

    @FXML
    private TableColumn<Customer, String> phoneColumn;

    @FXML
    private TableColumn<Customer, String> totalPurchaseColumn;

    @FXML
    private ListView<Product> purchaseListView;

    @FXML
    private ImageView imageView;

    @FXML
    private void top10Customers() {
        ArrayList<Customer> temp = new ParseJson().getCustomers("customers.json");
        temp.sort((o1, o2) -> o2.getRealTotalSalesPrice().compareTo(
                o1.getRealTotalSalesPrice()));
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Customer cus = temp.get(i);
            if (cus.isSavingHigh())
                customers.add(cus);
        }
        tableView.getItems().clear();
        for (Customer cus : customers) {
            tableView.getItems().add(cus);
        }
        rowsInTableLabel.setText("Rows returned: " + customers.size());
    }

    @FXML
    private void customersSavedOver5() {
        ArrayList<Customer> temp = new ParseJson().getCustomers("customers.json");
        ArrayList<Customer> customers = new ArrayList<>();
        for (Customer cus : temp) {
            if (cus.isSavingHigh())
                customers.add(cus);
        }
        tableView.getItems().clear();
        for (Customer cus : customers) {
            tableView.getItems().add(cus);
        }
        rowsInTableLabel.setText("Rows returned: " + customers.size());

    }

    @FXML
    private void loadAllCustomers() {

        ArrayList<Customer> customers = new ParseJson().getCustomers("customers.json");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        totalPurchaseColumn.setCellValueFactory(new PropertyValueFactory<>("totalSalesPrice"));
        for (Customer cus : customers) {
            tableView.getItems().add(cus);
        }
        rowsInTableLabel.setText("Rows returned: " + customers.size());

    }


}
