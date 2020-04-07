package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {
	 SimpleStringProperty buttonText;
	 
	 PresentationModel(){
		 buttonText=new SimpleStringProperty("Hello World");
	 }
	
}
