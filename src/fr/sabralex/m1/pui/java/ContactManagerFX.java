package fr.sabralex.m1.pui.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Sabri
 */
public class ContactManagerFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		System.out.println(" ------------- " + ContactManagerFX.class
				.getResource("/fr/sabralex/m1/pui/resources/views/FXMLMainFrame.fxml").getPath());
		Parent root = FXMLLoader
				.load(ContactManagerFX.class.getResource("/fr/sabralex/m1/pui/resources/views/FXMLMainFrame.fxml"));
		stage.setResizable(false);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
