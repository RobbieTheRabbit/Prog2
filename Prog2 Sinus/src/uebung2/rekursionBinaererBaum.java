package uebung2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class rekursionBinaererBaum extends Application{
	private Group root;
	private Pane draw;
	
	int cursorX = 0;
	int cursorY = 200;
	
	public static void main(String[] args){
		launch(args);
	}
	
	void drawLine() {
		double angleGrad = 45;
		double angleRad = angleGrad * Math.PI / 180;
		Line line = new Line(300, 350, 300 , 250);
		Line lineR = new Line(300, 250, 300 + 50 * Math.sin(135 * Math.PI / 180), 250 + 50 * Math.cos(135 * Math.PI / 180));
		Line lineL = new Line(300, 250, 300 + 50 * Math.sin(225 * Math.PI / 180), 250 + 50 * Math.cos(225 * Math.PI / 180));

		draw.getChildren().add(line);	
		draw.getChildren().add(lineR);
		draw.getChildren().add(lineL);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		root = new Group();
		draw = new Pane();
		
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Aufgabe 3.1");
		
		Pane borderpane = new Pane();
		borderpane.getChildren().add(draw);
		root.getChildren().add(borderpane);
		primaryStage.show();
		
		drawLine();
	}
}
