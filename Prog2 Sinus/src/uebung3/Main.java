package uebung3;

/**
 * The Main class for the Movie Database

 * Created by
 * Author: Sven Böhrnsen
 * IDE: Eclipse Neon
 * Date: 22.11.2016
 * 
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	/**
	 * integrate the FXML file
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent mainPane = FXMLLoader.load(getClass().getResource("/uebung3/moviebase2.fxml"));
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.show();
		// FilmDatenBank d = new FilmDatenBank();
		// d.addFilm(new Film());
	}

}
