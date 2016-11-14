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
	private double laenge = 100;
	int cursorX = 0;
	int cursorY = 200;
	double x = 400;
	double y = 550;
	double x1, y1;
	
	double angleRadRsin = Math.sin(135 * Math.PI / 180);
	double angleRadRcos = Math.cos(135 * Math.PI / 180);
	double angleRadLcos = Math.cos(225 * Math.PI / 180);
	double angleRadLsin = Math.sin(225 * Math.PI / 180);
	
	public static void main(String[] args){
		launch(args);
	}
	
	void drawLine(double x, double y, double x1, double y1, int n) {
		System.out.println(n);
		n++;
		
		if (n < 5) {
			Line line = new Line(x, y, x , y-100);
			laenge = laenge / 2;
			Line lineRR = new Line(x, y-100, x + laenge * angleRadRsin, y-100 + laenge * angleRadRcos);
			Line lineRL = new Line(x, y-100, x + laenge * angleRadLcos, y-100 + laenge * angleRadLsin);

			Line lineLR = new Line(x, y-100, x + laenge * angleRadRcos, y-100 + laenge * angleRadLsin);
			Line lineLL = new Line(x, y-100, x + laenge * angleRadLsin, y-100 + laenge * angleRadLcos);
			
			lineLR.setStroke(Color.RED);
			lineLL.setStroke(Color.RED);
			
			draw.getChildren().add(line);	
			draw.getChildren().add(lineRR);
			draw.getChildren().add(lineRL);
			draw.getChildren().add(lineLR);
			draw.getChildren().add(lineLL);
			
			drawLine(x + laenge * angleRadRsin, y-100 + laenge * angleRadRcos, x + laenge * angleRadLcos, y-100 + laenge * angleRadLsin, n);
		}
	}
	 

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
		
		int n = 0;
		drawLine( x, y, x1, y1, n);
	}
}
