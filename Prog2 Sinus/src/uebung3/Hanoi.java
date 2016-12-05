package uebung3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import java.util.ArrayList;

/* 
* Main Class for the Hanoi Towers with a Thread 
 * 3. task of Prog2
 */

public class Hanoi extends Application {

	@Override
	public void start(Stage primaryStage) {

		// creation of the Towers
		ArrayList<Tower> towers = new ArrayList<>();
		towers.add(new Tower()); // Tower 1
		towers.add(new Tower()); // Tower 2
		towers.add(new Tower()); // Tower 3

		// creation of the Discs
		int widht = 120; // start width
		int left = 10; // set start
		for (int x = 0; x < 5; x++) { // 5 Discs
			towers.get(0).pushDisc(new Disc(widht, left));
			widht -= 20;
			left += 10;
		}

		primaryStage.setTitle("Die Tuerme von Hanoi");

		// FlowPane Layout
		FlowPane flowPane = new FlowPane();
		flowPane.setPadding(new Insets(10, 10, 10, 10));
		flowPane.setVgap(2);
		flowPane.setHgap(2);
		flowPane.setMinWidth(620);

		// Creation of the canvases
		ArrayList<Canvas> canvas = new ArrayList<>();
		final ArrayList<GraphicsContext> gces = new ArrayList<>();

		for (int x = 0; x < 3; x++) {
			canvas.add(new Canvas(130, 150));
			flowPane.getChildren().add(canvas.get(x));
		}
		drawTower(gces, towers, canvas);

		// Button "Start" for the Thread
		Button submitBtn = new Button("Start");
		submitBtn.setStyle("-fx-font: 22 arial;");
		flowPane.getChildren().add(submitBtn);
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {

			// Action Handler for the Button "Start" with runnable
			public void handle(ActionEvent event) {
				Runnable rHanoi = new Runnable() {
					public void run() {
						hanoi(5, towers.get(0), towers.get(1), towers.get(2));
					}
				};
				// Generating the thread for the Hanoi
				Thread tHanoi = new Thread(rHanoi);
				tHanoi.start();

			}

			/**
			 * draw the discs from the start to the end of the Thread
			 * 
			 * @param N
			 * @param startTower
			 * @param hilfsTower
			 * @param endTower
			 */
			public void hanoi(int N, Tower startTower, Tower hilfsTower, Tower endTower) {

				try {
					if (N == 1) {
						ziehe_Scheibe(startTower, endTower);
						drawTower(gces, towers, canvas);
						Thread.sleep(800);

					} else {
						hanoi(N - 1, startTower, endTower, hilfsTower);
						ziehe_Scheibe(startTower, endTower);
						drawTower(gces, towers, canvas);
						Thread.sleep(800);
						hanoi(N - 1, hilfsTower, startTower, endTower);

					}
				} catch (Exception e) {
					System.err.println("Caught Exception: " + e.getMessage());
				}
			}
		});

		Button btnBeenden = new Button("Beenden");
		btnBeenden.setStyle("-fx-font: 22 arial;");
		flowPane.getChildren().add(btnBeenden);

		btnBeenden.setOnAction(new EventHandler<ActionEvent>() {

			// Action Handler for the Button "Beenden"
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});

		// Scene
		Scene scene = new Scene(flowPane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/**
	 * push the discs between towers
	 * 
	 * @param fromTower
	 * @param toTower
	 */
	public void ziehe_Scheibe(Tower fromTower, Tower toTower) {
		toTower.pushDisc(fromTower.getDisc(fromTower.getDiscs().size() - 1));

		// delete disc from frombox
		fromTower.discs.remove(fromTower.discs.size() - 1);

	}

	/**
	 * launch of the GUI
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * output of canvas + towers + discs
	 * 
	 * @param gces
	 * @param towers
	 * @param canvases
	 */
	public void drawTower(ArrayList<GraphicsContext> gces, ArrayList<Tower> towers, ArrayList<Canvas> canvases) {

		Color cTower = new Color(0, 0, 0, 0.9); // Tower color
		for (int y = 0; y < 3; y++) {
			gces.add(canvases.get(y).getGraphicsContext2D());
			gces.get(y).setFill(cTower);
			gces.get(y).clearRect(0, 0, canvases.get(y).getWidth(), canvases.get(y).getHeight());
			gces.get(y).fillRect(65, 30, 10, 100);

			Color cDiscs = new Color(1, 0.4, 0, 1); // Discs color
			int level = 120;
			for (int x = 0; x < towers.get(y).getDiscs().size(); x++) {
				gces.get(y).setFill(cDiscs);
				gces.get(y).clearRect(towers.get(y).getDisc(x).getLeft(), level, towers.get(y).getDisc(x).getWight(),
						10);
				gces.get(y).fillRect(towers.get(y).getDisc(x).getLeft(), level, towers.get(y).getDisc(x).getWight(),
						10);
				level -= 20;

			}
		}
	}
}
