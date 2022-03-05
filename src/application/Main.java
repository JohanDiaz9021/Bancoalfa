package application;
	
import java.io.IOException;
import controller.*;
import javafx.application.Application;
import javafx.stage.Stage;
import model.List;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private List list;
	private ListController listController;
	@Override
	public void start(Stage primaryStage) {
		list = new List();
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../ui/Registro.fxml"));
			BorderPane root = (BorderPane) fxmlLoader.load();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());
			primaryStage.setScene(scene);
			ContactViewController controller = fxmlLoader.getController();
			controller.setMain(this);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public void cambiar () throws IOException {
		//Permite abrir de una ventana a otra
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../ui/Sample.fxml"));
		BorderPane root1 = (BorderPane) fxmlLoader.load();
		listController = fxmlLoader.getController();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));  
		stage.show();
	}
	public void registerUsuario(String income, String expenses, String date) {
		
		list.addMonto(income, expenses, date);
		
		listController.setItmes(list.getRegisterBank());
	}
}
