package com.abook.module.core;

/**
 * @author jayavardhanravi
 *
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Abook extends Application {
	
	Button b_1,b_2,b_3;
	Scene scene_1,scene_2,scene_3;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Address Book - Jaskfl");
		
		b_1 = new Button();
		b_1.setText("Add Contact");
		b_1.setOnAction(e -> {primaryStage.setScene(scene_2);});
		Label label_1 = new Label();
		label_1.setText("Menu");
		VBox vbox_1 = new VBox(20);
		vbox_1.getChildren().addAll(label_1,b_1);
		scene_1 = new Scene(vbox_1,200,200);
		
		b_2 = new Button("Add");
		b_2.setOnAction(e -> {primaryStage.setScene(scene_1);});
		Label label_2 = new Label("Add your new contact details here...");
		HBox hbox_1 = new HBox(20);
		hbox_1.getChildren().addAll(label_2,b_2);
		scene_2 = new Scene(hbox_1,600,100);
		
		primaryStage.setScene(scene_1);
		primaryStage.show();
		
	}

}
