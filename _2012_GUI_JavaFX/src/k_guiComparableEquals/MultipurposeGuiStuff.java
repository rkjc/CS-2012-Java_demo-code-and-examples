package k_guiComparableEquals;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * // make sure to add these lines to the // module-info.java // file
 * 
 * 
 * module _13_JavaFX_GUI { requires javafx.base; requires javafx.graphics;
 * requires javafx.controls;
 * 
 * exports app; exports appGUI; }
 * 
 */

public class MultipurposeGuiStuff extends Application {
	
int cnt = 0;
RCircle zonk;

	@Override
	public void start(Stage primaryStage) { // the 'Stage' is the Window that will be opened on the desktop
		try {		
			
			
			// make a stack page to hold all of the 
			//StackPane spane = new StackPane();
			VBox vBox = new VBox();
			
		//  ---- make entry box -----
			
			TextArea input = new TextArea();
			
			input.setPromptText("Enter your first name.");
			input.setPrefColumnCount(10);
			input.setPrefRowCount(1);
			input.setFont(Font.font(40));
						
		//----------------- make labels ---------------------f-
			// Create a label and set its properties
		    Label dislabel = new Label("JavaFX");	    
		    dislabel.setFont(Font.font(40));
		    dislabel.setAlignment(Pos.CENTER);	    
		    dislabel.setStyle("-fx-text-fill: red; -fx-background-color: yellow; -fx-border-color: green; ");   
		    dislabel.setPrefHeight(200);
		    dislabel.setPrefWidth(600);
		    
		
		    // ---- make buttons -------
			// create a new Button (Button is a subclass of Control)
			Button btn = new Button();
			
			// set text inside button
			btn.setText("Display Message");
			btn.setFont(Font.font(40));

			//----------------- event button code ----------------------
			// action event
			EventHandler<ActionEvent> myBtnEvent = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					cnt++;
					//System.out.println("hahahah   gotch ya  " + cnt);
					dislabel.setText("made a circle");
					zonk = new RCircle(Double.valueOf(input.getText()));
					dislabel.setText("made a circle with radius" + zonk.getRadius());
				}
			};

			// when button is pressed
			btn.setOnAction(myBtnEvent);

			// ------------- assemble the GUI window -------------
			
			// add button to Stack Pane
			vBox.getChildren().add(dislabel);
			vBox.getChildren().add(input);
			vBox.getChildren().add(btn);
			

			StackPane spane = new StackPane();
			spane.getChildren().add(vBox);
			Scene bleen = new Scene(spane, 600, 400);
			primaryStage.setScene(bleen);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}

// thanks for the sample code to:
// https://www.tutorialkart.com/javafx/basic-javafx-example-application/