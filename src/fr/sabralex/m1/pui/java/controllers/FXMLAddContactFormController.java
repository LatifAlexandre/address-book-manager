package fr.sabralex.m1.pui.java.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import fr.sabralex.m1.pui.java.NumberObject;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;

public class FXMLAddContactFormController implements Initializable {
    
    @FXML
    private JFXToggleButton genderToggleButton;

    @FXML
    private JFXTextField lastNameTextField;

    @FXML
    private JFXComboBox<String> numberTypeComboBox;

    @FXML
    private JFXTextField emailTextField;

    @FXML
    private JFXComboBox<?> addressBookComboBox;

    @FXML
    private JFXTextField numberTextField;

    @FXML
    private JFXTextField firstNameTextField;

    @FXML
    private JFXButton addNumberButton;

    @FXML
    private JFXTreeTableView<NumberObject> numbersTableView;

    @FXML
    private JFXTextField ageTextField;
    
    ObservableList<String> numberTypes = 
    FXCollections.observableArrayList(
        "Mobile",
        "Office",
        "Home",
        "Fax", 
        "Pager"
    );

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        numberTypeComboBox.setItems(numberTypes);
        
        JFXTreeTableColumn<NumberObject, String> typeCol = new JFXTreeTableColumn<>("Type");
        typeCol.setPrefWidth(150);
        typeCol.setCellValueFactory((TreeTableColumn.CellDataFeatures<NumberObject, String> param) -> param.getValue().getValue().type);
        
        JFXTreeTableColumn<NumberObject, String> numberCol = new JFXTreeTableColumn<>("Number");
        numberCol.setPrefWidth(150);
        numberCol.setCellValueFactory((TreeTableColumn.CellDataFeatures<NumberObject, String> param) -> param.getValue().getValue().number);
        
        ObservableList<NumberObject> numbers = FXCollections.observableArrayList();
        numbers.add(new NumberObject("Office", "0454879865"));
        numbers.add(new NumberObject("Home", "0254879865"));
        numbers.add(new NumberObject("Fax", "013545186"));
        numbers.add(new NumberObject("Pager", "0022557"));
        numbers.add(new NumberObject("Mobile", "0654988754"));
        
        final TreeItem<NumberObject> root = new RecursiveTreeItem<NumberObject>(numbers, RecursiveTreeObject::getChildren);
        numbersTableView.getColumns().setAll(typeCol, numberCol);
        numbersTableView.setRoot(root);
    }    
    
    @FXML
    public void handleGenderToggleButtonAction(){
        System.out.println(genderToggleButton.isSelected());
        if (genderToggleButton.isSelected()){
            genderToggleButton.setText("Woman");
        }
        else{
            genderToggleButton.setText("Man");
        }
    }
    
    @FXML
    void handleAddNumberButonAction(ActionEvent event) {
        if (numberTypeComboBox.isVisible() && numberTextField.isVisible()){
            numberTypeComboBox.setVisible(false);
            numberTextField.setVisible(false);
        } else{
            numberTypeComboBox.setVisible(true);
            numberTextField.setVisible(true);
        }
            
    }

    @FXML
    void handleNumberTextFieldKeyPress(ActionEvent event) {

    }
}
