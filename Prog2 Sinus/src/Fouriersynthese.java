import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Fouriersynthese extends Application {

	private Group root;
	private Pane draw;
	
	int cursorX = 0;
	int cursorY = 200;
	
	double ampl = 50;  // Amplitude
	double freq = 4;    //Frequenz
	
	public void wave() {
		draw.getChildren().clear();
		resetCursor();
		int y = 0;
		
		for (int x=0; x<=600; x++){
			double f = 0;
			f = ampl * Math.sin(freq * Math.PI * x/600);
			y = (int)f;
			drawLine(x, y);
		}
	}
	
	public static void auswerten(double ampl1, double freq1){
		double y = 0;
		for (int x=0; x<=600; x++){
			double f = 0;
			f = ampl1 * Math.sin(freq1 * Math.PI * x/600);
			y = y + f;
		}
		System.out.println("y-Wert ist gleich " +  y + " bei der Amplitude " + ampl1 + " und der Frequenz " + freq1);
	}
	
	private void resetCursor() {
		cursorX = 0;
		cursorY = 200;
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
		
		System.out.println("Aufgabe 3.3:");
		auswerten(50, 4);
		auswerten(50/3, 12);
		auswerten(50/5, 20);
		auswerten(50/7, 28);
		System.out.println("-----------------------");
		
		System.out.println("Aufgabe 3.4:");
		auswerten(50, 4);
		auswerten(50/9, -12);
		auswerten(50/25, 20);
		auswerten(50/9, -28);
		System.out.println("-----------------------");
		
		//	Der Button "Anwenden"
		Button bSend = new Button("Anwenden");
		VBox vbox = new VBox(8);
		vbox.getChildren().add(bSend);
		
		//	HBox mit allen Steuerelementen 
		HBox geschachtelt = new HBox(8);
		TextField tfAmplitude = drawTextField(geschachtelt, "Amplitude", String.valueOf(ampl));
		TextField tfFrequenz = drawTextField(geschachtelt, "Frequenz", String.valueOf(freq));
		geschachtelt.getChildren().addAll(vbox);
		
		//	EventHandler fuer den Button
		bSend.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				ampl = Double.valueOf(tfAmplitude.getText());
			    freq = Double.valueOf(tfFrequenz.getText());
				
				System.out.println("Amplitude: " + ampl);
				System.out.println("Frequenz: " + freq);
				System.out.println("--------------");
				wave();
			}

		});
		
		
		root = new Group();
		draw = new Pane();
		
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Scribble");
		
		Pane borderpane = new Pane();
		borderpane.getChildren().add(draw);
		root.getChildren().add(borderpane);
		borderpane.getChildren().add(geschachtelt);
		primaryStage.show();	
	
	}

	private TextField drawTextField(HBox parent, String name, String value) {
		Label label = new Label(name);
		label.setPrefHeight(25);
		TextField textField = new TextField(value);
		textField.setPrefHeight(25);
		HBox hBox = new HBox();
		hBox.getChildren().addAll(label, textField);
		hBox.setSpacing(10);
		parent.getChildren().addAll(hBox);
		return textField;
	}
}