/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sabralex.m1.pui.java;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author uapv1404039
 */
public class NumberObject extends RecursiveTreeObject<NumberObject>{
    public StringProperty type;
    public StringProperty number;
    
    public NumberObject(String type, String number){
        this.type = new SimpleStringProperty(type);
        this.number = new SimpleStringProperty(number);
    }
}
