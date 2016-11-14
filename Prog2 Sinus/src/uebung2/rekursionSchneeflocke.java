package uebung2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


/**Übung 2, Aufgabe 3.2, Schneeflocke
 * @author mauricestolte
 *
 */
public class rekursionSchneeflocke extends Application{
	
	private Group root;
	

	public static void main(String[] args){
		launch(args);
	}
	
	/**
	 * @param xstart startingpoint x-coordinate 
	 * @param ystart startingpoint y-coordinate
	 * @param n iteration counter 
	 * @param draw 
	 * @param laenge length of one segment of the snowflake (actual size *2)
	 */
	public void drawLine(double xstart, double ystart, int n, Pane draw, double laenge) {
		
		if (n == 0) {
			return;
		}
		
		laenge = laenge * 0.33; //Reducing laenge by the given factor for recursion 
		
		n = n - 1;
		
		Line line1 = new Line(xstart - laenge*0.75, ystart - laenge*0.75, xstart + laenge*0.75 , ystart +laenge*0.75);
		drawLine(xstart - laenge*0.75, ystart - laenge*0.75 , n, draw, laenge*0.75);
		drawLine(xstart + laenge*0.75, ystart +laenge*0.75 , n, draw, laenge*0.75);
		/*
		 * \
		 */

		
		Line line2 = new Line(xstart, ystart - laenge, xstart , ystart + laenge);
		drawLine(xstart, ystart - laenge , n, draw, laenge);
		drawLine(xstart, ystart + laenge , n, draw, laenge);
		/*
		 * |
		 */
		
		Line line3 = new Line(xstart + laenge*0.75, ystart - laenge*0.75, xstart - laenge*0.75 , ystart +laenge*0.75);
		drawLine(xstart + laenge*0.75, ystart - laenge*0.75 , n, draw, laenge*0.75);
		drawLine(xstart - laenge*0.75, ystart + laenge*0.75 , n, draw, laenge*0.75);
		/*
		 * /
		 */
		
		Line line4 = new Line(xstart - laenge, ystart, xstart + laenge , ystart);
		drawLine(xstart - laenge, ystart , n, draw, laenge);
		drawLine(xstart + laenge, ystart , n, draw, laenge);
		/*
		 * -
		 */
		
		draw.getChildren().add(line1);
		draw.getChildren().add(line2);
		draw.getChildren().add(line3);
		draw.getChildren().add(line4);
		/*
		 * Drawing the snowflake
		 */
		
		
		
		
		
		
			
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
	    Pane draw;
		root = new Group();
		draw = new Pane();
		double laenge = 100; //length of one original segment of the snowflake, actual size *2
		
		Scene scene = new Scene(root, 600, 400); //size of the canvas 
		primaryStage.setScene(scene);
		primaryStage.setTitle("Aufgabe 3.2");
		
		Pane borderpane = new Pane();
		borderpane.getChildren().add(draw);
		root.getChildren().add(borderpane);
		primaryStage.show();
		
		drawLine(300, 200, 3, draw, laenge); //starting point xy, amount of iterations, draw, length of one original segment of the snowflake (actual size *2)
		
	}}
