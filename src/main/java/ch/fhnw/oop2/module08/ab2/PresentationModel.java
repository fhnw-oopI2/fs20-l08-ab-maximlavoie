package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {
	StringProperty buttonText;
	ButtonValue text;

	PresentationModel() {
		text = ButtonValue.On;
		buttonText = new SimpleStringProperty(text.toString());
	}

	public void toggle() {
		if (text == ButtonValue.On) {

			text = ButtonValue.Off;
		} else {
			text = ButtonValue.On;
		}

		buttonText.setValue(text.toString());
	}

}
