package uebung2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import java.util.ArrayList;

/* 
* Main Class for the Hanoi Towers
 * 2. task of Prog2
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
		flowPane.setMinWidth(750);

		// Creation of the canvases
		ArrayList<Canvas> canvas = new ArrayList<>();
		final ArrayList<GraphicsContext> gces = new ArrayList<>();

		for (int x = 0; x < 3; x++) {
			canvas.add(new Canvas(130, 150));
			flowPane.getChildren().add(canvas.get(x));
		}
		drawTower(gces, towers, canvas);

		// ComboBox FromBox
		ComboBox<String> fromBox = new ComboBox<String>();
		Label lFrom = new Label("  Von: ");
		fromBox.getItems().addAll("1", "2", "3");
		fromBox.setValue("1");
		flowPane.getChildren().addAll(lFrom, fromBox);

		// ComboBox toBox
		Label lTo = new Label("  Nach: ");
		lTo.setPrefHeight(25);
		ComboBox<String> toBox = new ComboBox<String>();
		toBox.getItems().addAll("1", "2", "3");
		toBox.setValue("2");
		Label lSpace = new Label("   ");
		flowPane.getChildren().addAll(lTo, toBox, lSpace);

		// Button "Verschieben"
		Button submitBtn = new Button("Verschieben");
		flowPane.getChildren().add(submitBtn);
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {

			// Action Handler for the Button
			public void handle(ActionEvent event) {
				if (fromBox.getValue().isEmpty() || toBox.getValue().isEmpty()
						|| fromBox.getValue().equals(toBox.getValue()) || !fromBox.getValue().matches("[0-3]")
						|| !toBox.getValue().matches("[0-3]")) {
					return;
				}

				Tower fromTower = towers.get(Integer.parseInt(fromBox.getValue()) - 1);
				Tower toTower = towers.get(Integer.parseInt(toBox.getValue()) - 1);
				ArrayList<Disc> fromDiscs = fromTower.getDiscs();
				ArrayList<Disc> toDiscs = toTower.getDiscs();

				/**
				 * if the towers have no Discs
				 *
				 * @return
				 */
				if (towers.get(Integer.parseInt(fromBox.getValue()) - 1).getDiscs().size() == 0) {
					System.out.println("Keine Scheibe vorhanden!");
					return;
				}

				/**
				 * if DiscsA > discsB
				 *
				 * @return
				 */
				if (!toDiscs.isEmpty()) {
					if (fromDiscs.get(fromDiscs.size() - 1).getWight() >= toDiscs.get(toDiscs.size() - 1).getWight()) {
						System.out.println("Die Scheibe ist größer als die vorige!");
						return;
					}
				}

				// add disc frombox to tobox
				toTower.pushDisc(fromTower.getDisc(fromTower.getDiscs().size() - 1));

				// delete disc from frombox
				fromDiscs.remove(fromDiscs.size() - 1);

				// draw towers
				drawTower(gces, towers, canvas);
				if (towers.get(2).getDiscs().size() == 6) {
					submitBtn.setDisable(true);
				}
			}
		});

		// Scene
		Scene scene = new Scene(flowPane);
		primaryStage.setScene(scene);
		primaryStage.show();

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
