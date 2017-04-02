package fr.sabralex.m1.pui.java;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class NumberObject extends RecursiveTreeObject<NumberObject> {
	public StringProperty type;
	public StringProperty number;

	public NumberObject(String type, String number) {
		this.type = new SimpleStringProperty(type);
		this.number = new SimpleStringProperty(number);
	}
}
