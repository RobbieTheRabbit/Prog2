package uebung2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class rekursionSchneeflocke extends Application{
	
	private Group root;
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void drawLine(double xstart, double ystart, int n, Pane draw, double laenge) {
		
		if (n == 0) {
			return;
		}
		
		laenge = laenge * 0.33;
		
		n = n - 1;
		
		Line line1 = new Line(xstart - laenge, ystart - laenge, xstart + laenge , ystart +laenge);
		drawLine(xstart - laenge, ystart - laenge , n, draw, laenge);
		drawLine(xstart + laenge, ystart +laenge , n, draw, laenge);
		
		Line line2 = new Line(xstart, ystart - laenge, xstart , ystart + laenge);
		drawLine(xstart, ystart - laenge , n, draw, laenge);
		drawLine(xstart, ystart + laenge , n, draw, laenge);
		
		Line line3 = new Line(xstart + laenge, ystart - laenge, xstart - laenge , ystart +laenge);
		drawLine(xstart + laenge, ystart - laenge , n, draw, laenge);
		drawLine(xstart - laenge, ystart + laenge , n, draw, laenge);
		
		Line line4 = new Line(xstart - laenge, ystart, xstart + laenge , ystart);
		drawLine(xstart - laenge, ystart , n, draw, laenge);
		drawLine(xstart + laenge, ystart , n, draw, laenge);
		
		
		draw.getChildren().add(line1);
		draw.getChildren().add(line2);
		draw.getChildren().add(line3);
		draw.getChildren().add(line4);
		
		
		
		
		
		
			
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
	    Pane draw;
		root = new Group();
		draw = new Pane();
		double laenge = 100;
		
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Aufgabe 3.2");
		
		Pane borderpane = new Pane();
		borderpane.getChildren().add(draw);
		root.getChildren().add(borderpane);
		primaryStage.show();
		
		drawLine(300, 200, 3, draw, laenge);
		
	}}
