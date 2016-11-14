package uebung2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class rekursionSchneeflocke extends Application{
	
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
		
		Line line1 = new Line(300, 350, 300 , 250);
		Line line2 = new Line(350, 300, 250 , 300);
		Line line3 = new Line(325, 325, 275 , 275);
		Line line4 = new Line(325, 275, 275 , 325);
		

		draw.getChildren().add(line1);
		draw.getChildren().add(line2);
		draw.getChildren().add(line3);
		draw.getChildren().add(line4);
		
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		root = new Group();
		draw = new Pane();
		
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Aufgabe 3.2");
		
		Pane borderpane = new Pane();
		borderpane.getChildren().add(draw);
		root.getChildren().add(borderpane);
		primaryStage.show();
		
		drawLine();
		
	}}
