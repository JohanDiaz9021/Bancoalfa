package controller;
import application.Main;

import java.awt.image.IndexColorModel;
import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Contact;

public class ContactViewController {
	
	private Contact contact;
	private Main main;	
	@FXML
	TextField income;
	@FXML
	TextField expenses;
	@FXML
	TextField date;	 
	public void setMain(Main main) {
		
		this.main = main;
	}
	@FXML
	Button buttonRegister;
		
	@FXML
	void buttonRegisterClick(ActionEvent event) throws IOException {
		
		main.cambiar();
		recibirDatos();
		
	}
	@FXML
	void buttonDeleteRegister(ActionEvent event) {
		
		//registerBank.remove(contact);
	}
	
	@FXML
	void recibirDatos() {
		
		String income1 = income.getText();
		
		String expenses1 = expenses.getText();
		
		String date1 = date.getText();
					
		System.out.println("Hola ingreso"+income+expenses+date); //Si aparecen los datos, en la tableView aparece como si entrara pero no se ve la informacion
		main.registerUsuario(income1, expenses1, date1);
	}
}