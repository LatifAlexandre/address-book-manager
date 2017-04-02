package fr.sabralex.m1.pui.java.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToolbar;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Sabri
 */
public class FXMLMainFrameController implements Initializable {

            
    @FXML
    private Label label;

    @FXML
    private MenuBar mainMenuBar;

    @FXML
    private JFXToolbar toolBar;
    
    @FXML
    private JFXButton newContactButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleNewContactButtonAction(){
        try {
            FXMLLoader loader = new FXMLLoader(FXMLMainFrameController.class.getResource("/fr/sabralex/m1/pui/resources/views/FXMLAddContactForm.fxml"));
            Parent addContactWindow = loader.load();
            FXMLAddContactFormController fXMLAddContactFormController = (FXMLAddContactFormController) loader.getController();
            Scene addContactScene = new Scene(addContactWindow);
            Stage mainStage = new Stage();
            mainStage.setScene(addContactScene);
            mainStage.initModality(Modality.WINDOW_MODAL);
            mainStage.setResizable(false);
            mainStage.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainFrameController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
