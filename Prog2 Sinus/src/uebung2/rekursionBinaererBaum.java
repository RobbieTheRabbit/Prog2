package uebung2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class rekursionBinaererBaum extends Application {
	private Group root;
	private Pane draw;
	private double laenge = 200; // laenge der Linie
	double x = 400; // erste x-Koordinate
	double y = 550; // erste y-Koordinate
	int stopAfter = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		root = new Group();
		draw = new Pane();

		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Aufgabe 3.1");

		Pane borderpane = new Pane();
		borderpane.getChildren().add(draw);
		root.getChildren().add(borderpane);
		primaryStage.show();

		double x1 = x;
		double y1 = y - laenge;

		Line line = new Line(x, y, x1, y1); // die mittlere Linie
		draw.getChildren().add(line);

		drawRecursion(x, y, x1, y1, stopAfter, laenge);
	}
	
	/**
	 * @param x startingpoint x-coordinate 
	 * @param y startingpoint y-coordinate
	 * @param x1 endpoint x-coordinate 
	 * @param y1 endpoint y-coordinate
	 * @param n iteration counter 
	 * @param length -  length of one segment of the snowflake (actual size *2)
	 */
	void drawRecursion(double x, double y, double x1, double y1, int n, double length) {
		System.out.println(n);
		if (n == 0) {
			return;
		}
		System.out.println(String.format("(x: %f, y: %f, x1: %f, y1: %f, n: %d, len: %f)", x, y, x1, y1, n, length));

		// Den Winker der gezeichneten Linie berechnen
		double thetha = Math.atan2(x1 - x, y1 - y);
		System.out.println(String.format("(thetha: %f)", thetha));

		// 45 Grad +/- berechnen
		double thethaL = thetha + Math.PI / 4.0;
		double thethaR = thetha - Math.PI / 4.0;
		System.out.println(String.format("(thethaR: %f)", thethaR));
		System.out.println(String.format("(thethaL: %f)", thethaL));

		// Berechnen sin/cos
		double angleRadRsin = Math.sin(thethaR);
		double angleRadRcos = Math.cos(thethaR);
		double angleRadLsin = Math.sin(thethaL);
		double angleRadLcos = Math.cos(thethaL);

		// Berechnen X,Y Endkoordinaten
		double x2 = x1 + length * angleRadRsin;
		double y2 = y1 + length * angleRadRcos;
		double x3 = x1 + length * angleRadLsin;
		double y3 = y1 + length * angleRadLcos;

		Line lineR = new Line(x1, y1, x2, y2); // die rechte Linie
		Line lineL = new Line(x1, y1, x3, y3); // die linke Linie

		draw.getChildren().add(lineR);
		draw.getChildren().add(lineL);
		
		// rekursiv aufrufen
		drawRecursion(x1, y1, x2, y2, n - 1, length / 2);
		drawRecursion(x1, y1, x3, y3, n - 1, length / 2);
	}
}