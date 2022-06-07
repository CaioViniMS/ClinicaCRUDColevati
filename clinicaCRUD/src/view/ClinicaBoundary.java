package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class ClinicaBoundary extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
	TabPane tabPane = (TabPane)FXMLLoader.load(this.getClass().getResource("ClinicaBoundary.fxml"));
	Scene scn = new Scene(tabPane);
	
	stage.setScene(scn);
	stage.setTitle("CRUD Clinica");
	stage.show();
	}

}
