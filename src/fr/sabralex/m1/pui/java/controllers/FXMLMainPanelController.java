/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sabralex.m1.pui.java.controllers;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTreeTableView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Sabri
 */
public class FXMLMainPanelController implements Initializable {

    
    @FXML
    private AnchorPane mainPanelAnchorPane;

    @FXML
    private JFXTreeTableView<?> contactsTreeTable;

    @FXML
    private TitledPane detailsTitledPane;

    @FXML
    private JFXComboBox<?> addressBooksComboBox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO 
    }    
}
