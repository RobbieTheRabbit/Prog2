import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Sinusfunktion extends Application {

	private Group root;
	private Pane draw;
	
	int cursorX = 0;
	int cursorY = 200;
	
	double z0;
	double z1 = 8;  // Amplitude
	double z2 = 0;
	int i = 0;
	double freq = 1.99;
	double b;
	
	public void sinus(double f) {
		f = this.freq;
		if(i > 900)
			return;
		z0 = f * z1 - b*z2;
		z2 = z1;
		z1 = z0;
		//System.out.println(i + " " + (int)z0 ); 
		drawLine(i, (int)z0) ;
		i++;
		//f -= 0.01;
		sinus(f);
	}
	
	public static void main(String[] args) {
		launch(args);	
	}
	
	void drawLine(int x, int y) {
		int endX =  x;
		int endY =  200 - y;
		Line line = new Line(cursorX, cursorY, endX , endY);
		cursorX = endX;
		cursorY = endY;
		line.setStroke(Color.RED);
		draw.getChildren().add(line);	
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub	
		
		// Textfeld Amplitude fuer z1
		Label lAamplitude = new Label("    Amplitude:");
		lAamplitude.setPrefHeight(25);
		TextField tfAmplitude = new TextField ();
		tfAmplitude.setPrefHeight(25);
		HBox hbAmplitude = new HBox();
		hbAmplitude.getChildren().addAll(lAamplitude, tfAmplitude);
		hbAmplitude.setSpacing(10);
		
		// Textfeld Frequenz
		Label lFrequenz = new Label("Frequenz:");
		lFrequenz.setPrefHeight(25);
		TextField tfFrequenz = new TextField ("1.99");
		tfFrequenz.setPrefHeight(25);
		HBox hbFrequenz = new HBox();
		hbAmplitude.getChildren().addAll(lFrequenz, tfFrequenz);
		hbAmplitude.setSpacing(10);
		
		// Textfeld Faktor fuer z2 MUSS NOCH GEMACHT WERDEN
		Label lFaktor = new Label("Faktor:");
		lFaktor.setPrefHeight(25);
		TextField tfFaktor = new TextField ();
		tfFaktor.setPrefHeight(25);
		HBox hbB = new HBox();
		hbAmplitude.getChildren().addAll(lFaktor, tfFaktor);
		hbAmplitude.setSpacing(10);
		
		//	Der Button
		Button bSend = new Button("Anwenden");
		VBox vbox = new VBox(8);
		vbox.getChildren().add(bSend);
		
		//	HBox mit allen Steuerelementen 
		HBox geschachtelt = new HBox(8);
		geschachtelt.getChildren().addAll(hbAmplitude, hbFrequenz,hbB, vbox);
		
		bSend.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				z2 = 0;
				z1 = Double.parseDouble(tfAmplitude.getText());
				freq = Double.parseDouble(tfFrequenz.getText());
				b = Double.parseDouble(tfFaktor.getText()); 
				
				draw.getChildren().clear();	
				i = 0;
				cursorX = 0;
				cursorY = 200;
				
				System.out.println("Sinus: " + z1);
				System.out.println("Frequenz: " + freq);
				System.out.println("Faktor: " + b);
				System.out.println("--------------");
				
				sinus(freq);
			}

			 });
		
		
		
		root = new Group();
		draw = new Pane();
		
		Scene scene = new Scene(root, 900, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Scribble");
		
		//Rectangle panel = new Rectangle(900, 400, Color.WHITESMOKE);
		//root.getChildren().add(panel);
		
		
		
//		root.getChildren().add(hbAmplitude);
//		root.getChildren().add(hbFrequenz);
//		root.getChildren().add(hbB);
//		root.getChildren().add(vbox);
		
		Pane borderpane = new Pane();
		borderpane.getChildren().add(geschachtelt);
		borderpane.getChildren().add(draw);
		root.getChildren().add(borderpane);
		primaryStage.show();	
	
		//sinus(1.99);
	}
}