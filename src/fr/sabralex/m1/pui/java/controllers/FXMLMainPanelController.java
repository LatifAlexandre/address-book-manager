package fr.sabralex.m1.pui.java.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXComboBox;

import fr.sabralex.m1.pui.java.ContactObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
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
	private TableView<ContactObject> contactsTable;

	@FXML
	private TitledPane detailsTitledPane;

	@FXML
	private JFXComboBox<String> addressBooksComboBox;

	ObservableList<String> addressBooks = FXCollections.observableArrayList("All contacts", "Private contacts",
			"Professional contacts", "Student contacts");

	TableColumn<ContactObject, String> nameCol = new TableColumn<>("Name");
	TableColumn<ContactObject, String> emailCol = new TableColumn<>("Email");
	TableColumn<ContactObject, String> numberCol = new TableColumn<>("Number");

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		addressBooksComboBox.setItems(addressBooks);

		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		nameCol.setMinWidth(100);
		
		emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
		emailCol.setMinWidth(100);
		
		numberCol.setCellValueFactory(new PropertyValueFactory<>("mobileNumber"));
		numberCol.setMinWidth(100);

		ObservableList<ContactObject> contacts = FXCollections.observableArrayList();
		contacts.add(new ContactObject("Toto Toto", "toto.toto@toto.fr", "0606060606"));
		contacts.add(new ContactObject("Toto Toto", "toto.toto@toto.fr", "0606060606"));
		contacts.add(new ContactObject("Toto Toto", "toto.toto@toto.fr", "0606060606"));

		contactsTable.getColumns().addAll(nameCol, emailCol, numberCol);
		contactsTable.setItems(contacts);

	}
}
