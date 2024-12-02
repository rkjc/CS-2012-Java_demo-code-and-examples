package magic8ball;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainStart extends Application {

	Boolean buttonpressed;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		buttonpressed = false;
		MagicEightBall mateball = new MagicEightBall();

		Button btn1 = new Button("Show Answer");
		btn1.setFont(Font.font(24));

		// action event
		EventHandler<ActionEvent> myBtnEvent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				buttonpressed = !buttonpressed;
				if (buttonpressed) {
					mateball.showSaying();
					btn1.setText("Clear Answer");
				} else {
					mateball.clearSaying();
					btn1.setText("Show Answer");
				}
			}
		};

		// when button is pressed
		btn1.setOnAction(myBtnEvent);

		VBox vPane = new VBox(2);
		vPane.setAlignment(Pos.CENTER);
		vPane.setSpacing(20);
		vPane.getChildren().add(mateball);
		vPane.getChildren().add(btn1);

		// Create a scene and place it in the stage
		Scene ballscene = new Scene(vPane, 500, 550);
		primaryStage.setTitle("Magic 8-Ball"); // Set the stage title
		primaryStage.setScene(ballscene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
