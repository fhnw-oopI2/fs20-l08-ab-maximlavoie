package ch.fhnw.oop2.module08.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
	private PresentationModel pm;

	private Button button;

	public ApplicationUI(PresentationModel pm) {
		this.pm=pm;
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {
		button = new Button();
		button.textProperty().bind(pm.buttonText);
	}

	private void layoutControls() {
		this.getChildren().add(button);
	}
}
