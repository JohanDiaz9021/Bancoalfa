package controller;


import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class ListController {
	
	ObservableList<Contact> observableList;
	@FXML
	TableView<Contact> tableView;
	
	@FXML
	TableColumn<Contact, String> date;
	@FXML
	TableColumn<Contact, String> income;
	@FXML
	TableColumn<Contact, String> expenses;
	
	@FXML
	public void inizialite() {

		date.setCellValueFactory(new PropertyValueFactory<>("date"));

		income.setCellValueFactory(new PropertyValueFactory<>("income"));

		expenses.setCellValueFactory(new PropertyValueFactory<>("expenses"));
	}
	
	public void setItmes(ArrayList <Contact> list) {
		
		observableList = FXCollections.observableList(list);
		
		tableView.setItems(observableList);
	}
}
