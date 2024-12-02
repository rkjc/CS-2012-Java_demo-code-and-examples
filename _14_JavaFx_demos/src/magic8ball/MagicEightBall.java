package magic8ball;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class MagicEightBall extends StackPane {
	
	Circle ballcircle;
	Circle windcircle;
	Circle covercirc;
	Text saying;
	WiseSayings wsay;
	
	public MagicEightBall() {
		wsay = new WiseSayings();
		
		ballcircle = new Circle(100, 100, 200);
		ballcircle.setFill(Color.BLACK);
		ballcircle.setStroke(Color.BLACK);
		
		windcircle = new Circle(100, 100, 70);
		windcircle.setFill(Color.BLUE);
		windcircle.setStroke(Color.BLUE);
		
		covercirc = new Circle(100, 100, 70);
		covercirc.setFill(Color.BLUE);
		covercirc.setStroke(Color.BLUE);
		
		Polygon tringl = new Polygon();
		tringl.getPoints().addAll(new Double[]{
            100.0, 0.0,
            50.0, 80.0,
            150.0, 80.0 });
		tringl.setFill(Color.TRANSPARENT);
		tringl.setStroke(Color.WHITE);
		
		saying = new Text("Ask the\n8-ball\na question");
		saying.setFont(Font.font(16));
		saying.setTextAlignment(TextAlignment.CENTER);
		saying.setFill(Color.WHITE);
		
		getChildren().add(ballcircle);
		getChildren().add(windcircle);
		getChildren().add(saying);
		//getChildren().add(tringl);
		getChildren().add(covercirc);
	}
	
	public void showSaying() {

		// get string from wisesayings
		// set textsaying to string
		//shows message
		String tempSay = wsay.getRandomSaying();
		saying.setText(tempSay);
		covercirc.setFill(Color.TRANSPARENT);
	}
	
	public void clearSaying() {
		// message, just shows blue circle window
		covercirc.setFill(Color.BLUE);
	}
}
