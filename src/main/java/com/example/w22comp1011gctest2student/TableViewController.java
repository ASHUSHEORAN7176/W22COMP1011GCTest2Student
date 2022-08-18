
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
    private void top10Customers()
    {
        System.out.println("called method top10Customers()");
    }

    @FXML
    private void customersSavedOver5()
    {
        System.out.println("called method customersSavedOver5()");
    }

    @FXML
    private void loadAllCustomers()
    {
        System.out.println("called method loadAllCustomers");
    }

    @Override
    public void initialize(URl url, ResourceBundle resourceBundle){
        //Customer customer=new Customer();
        idColumn.setCellValueFactory(new PropertyValueFactory<Customer,Integer>(customer.id));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>());
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>());
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>());
        tableView.getItems().addAll(ApiUtility.getCustomersFromJSONFileArray("customers"));
    }
}
