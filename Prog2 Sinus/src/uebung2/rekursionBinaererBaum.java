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
	private double laenge = 100; // laenge der Linie
	int cursorX = 0;
	int cursorY = 200;
	double x = 400;	// erste x-Koordinate
	double y = 550;	// erste y-Koordinate
	double x1, y1;	// Koordinaten zur Hilfe
	
	// winkel in Rad berechnen für 45grad
	double angleRadRsin = Math.sin(135 * Math.PI / 180);
	double angleRadRcos = Math.cos(135 * Math.PI / 180);
	double angleRadLcos = Math.cos(225 * Math.PI / 180);
	double angleRadLsin = Math.sin(225 * Math.PI / 180);
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		launch(args);
	}
	
	/** 
	 * @param x - x-Position des unteres Punktes der Linie
	 * @param y - y-Position des unteres Punktes der Linie
	 * @param x1 - x-Position des oberestes Punktes der Linie
	 * @param y1 - y-Position des oberestes Punktes der Linie
	 * @param n - Abbruchbediengung
	 */
	void drawLine(double x, double y, double x1, double y1, int n) {
		System.out.println(n);
		
		if (n == 0) {
			return;
		}
		
			laenge = laenge / 2;
			Line line = new Line(x, y, x , y-100); // die mittlere Linie
			
			Line lineRR = new Line(x, y-100, x + laenge * angleRadRsin, y-100 + laenge * angleRadRcos); // die rechte Linie, die um 45 grad gedreht ist
			Line lineRL = new Line(x, y-100, x + laenge * angleRadLcos, y-100 + laenge * angleRadLsin); // die linke Linie, die um 45 grad gedreht ist

//			Line lineLR = new Line(x + laenge * angleRadLsin, y-100 + laenge * angleRadLcos, x + laenge * angleRadLsin, y-200 + laenge * angleRadLcos); // rechte gerade Linie
//			Line lineLL = new Line(x + laenge * angleRadLsin, y-200 + laenge * angleRadLcos,(x + laenge * angleRadLsin) + laenge * angleRadLsin, (y-200 + laenge * angleRadLcos) + laenge * angleRadLcos); //die linke Linie auf der linken Seite, die um 45 grad gedreht ist
//			Line lineLLr = new Line(x + laenge * angleRadLsin, y-200 + laenge * angleRadLcos,(x + laenge * angleRadLsin) + laenge * angleRadRsin, (y-200 + laenge * angleRadLcos) + laenge * angleRadRcos); //die rechte Linie auf der linken Seite, die um 45 grad gedreht ist
//			Line lineLLl = new Line((x + laenge * angleRadLsin) + laenge * angleRadRsin, (y-200 + laenge * angleRadLcos) + laenge * angleRadRcos, (x + laenge * angleRadLsin) + laenge * angleRadRsin,(y-300 + laenge * angleRadLcos) + laenge * angleRadRcos); // linke gerade Linie
//			Line lineLLrG = new Line((x + laenge * angleRadLsin) + laenge * angleRadLsin, (y-200 + laenge * angleRadLcos) + laenge * angleRadLcos, (x + laenge * angleRadLsin) + laenge * angleRadLsin, (y-300 + laenge * angleRadLcos) + laenge * angleRadLcos);
//			
			lineRL.setStroke(Color.BLUE);
			
			draw.getChildren().add(line);	
			draw.getChildren().add(lineRR);
			draw.getChildren().add(lineRL);
//			draw.getChildren().add(lineLR);
//			draw.getChildren().add(lineLL);
//			draw.getChildren().add(lineLLr);
//			draw.getChildren().add(lineLLl);
//			draw.getChildren().add(lineLLrG);
			
			drawLine(x + laenge * angleRadRsin, y-100 + laenge * angleRadRcos, x + laenge * angleRadLcos, y-100 + laenge * angleRadLsin, n-1); // rekursive Methode für die rechte Seite
			drawLine(x- laenge * angleRadRsin, y-100, x + laenge * angleRadLsin, y-100 + laenge * angleRadLcos, n-1); // rekursive Methode für die linke Seite
	
	}
	 

	/* (non-Javadoc)
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
		
		int n = 0; // Abbruchbediengung
		drawLine( 400, 550, x1, y1, 5);
	}
}
