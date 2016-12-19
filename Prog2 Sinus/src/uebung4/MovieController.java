package uebung4;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Controller class of the FXML File

 * Created by
 * Author: Sven Böhrnsen
 * IDE: Eclipse Neon
 * Date: 22.11.2016
 * 
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;

public class MovieController {

	FilmDatenBank db = new FilmDatenBank();

	@FXML // fx:id="tv_Movies"
	private TableView<Filme> tv_Movies; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Titel"
	private TableColumn<Filme, String> tc_Titel; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Original"
	private TableColumn<Filme, String> tc_Original; // Value injected by
													// FXMLLoader

	@FXML // fx:id="tc_Haupt"
	private TableColumn<Filme, String> tc_Haupt; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Regie"
	private TableColumn<Filme, String> tc_Regie; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Buch"
	private TableColumn<Filme, String> tc_Buch; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Musik"
	private TableColumn<Filme, String> tc_Musik; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Jahr"
	private TableColumn<Filme, Integer> tc_Jahr; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Laenge"
	private TableColumn<Filme, Integer> tc_Laenge; // Value injected by
													// FXMLLoader

	@FXML // fx:id="tc_Genre"
	private TableColumn<Filme, String> tc_Genre; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Titel"
	private TextField tf_Titel; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Haupt"
	private TextField tf_Haupt; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Original"
	private TextField tf_Original; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Jahr"
	private TextField tf_Jahr; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Regie"
	private TextField tf_Regie; // Value injected by FXMLLoader

	@FXML // fx:id="cb_Genre"
	private ComboBox<String> cb_Genre; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Laenge"
	private TextField tf_Laenge; // Value injected by FXMLLoader

	@FXML
	private TextField tf_Musik;

	@FXML // fx:id="tv_Buch"
	private TextField tv_Buch; // Value injected by FXMLLoader

	@FXML // fx:id="b_Delete"
	private Button b_Delete; // Value injected by FXMLLoader

	@FXML // fx:id="b_insert"
	private Button b_insert; // Value injected by FXMLLoader

	@FXML // fx:id="lv_Movies"
	private ListView<Filme> lv_Movies; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Search1"
	private TextField tf_Search1; // Value injected by FXMLLoader

	@FXML // fx:id="b_Search1"
	private Button b_Search1; // Value injected by FXMLLoader

	@FXML
	private Label lNodeChanges;

	/**
	 * Search a Movie entry
	 * 
	 * @param event
	 */
	@FXML
	void searchMovieClick(ActionEvent event) {

	}

	/**
	 * Close the Programm via Menu
	 * 
	 * @param event
	 */
	@FXML
	void beenden(ActionEvent event) {
		System.exit(0);

	}

	/**
	 * add Movies entries to the Table
	 * 
	 * @param event
	 */
	@FXML
	void clickAdd(ActionEvent event) {
		Filme newFilm = new Filme();
		newFilm.setTitel(tf_Titel.getText());
		newFilm.setHaupt(tf_Haupt.getText());
		newFilm.setRegie(tf_Regie.getText());
		newFilm.setUsTitel(tf_Original.getText());
		newFilm.setMusik(tf_Musik.getText());
		newFilm.setBuch(tv_Buch.getText());
		newFilm.setLaenge(Integer.parseInt(tf_Laenge.getText()));
		newFilm.setJahr(Integer.parseInt(tf_Jahr.getText()));
		newFilm.setGenre(cb_Genre.getValue());

		tv_Movies.getItems().add(newFilm);
		tf_Titel.clear();
		tf_Haupt.clear();
		tf_Regie.clear();
		tf_Original.clear();
		tv_Buch.clear();
		tf_Laenge.clear();
		tf_Jahr.clear();
		tf_Musik.clear();
		cb_Genre.setValue(null);

		lNodeChanges.setText("Eintrag wurde hinzugefügt!");

	}

	/**
	 * Delete Entries from the Table
	 * 
	 * @param event
	 * @throws InterruptedException
	 */
	@FXML
	void deleteEntry(ActionEvent event) throws InterruptedException {
		ObservableList<Filme> movieSelect, allSelect;
		allSelect = lv_Movies.getItems();
		movieSelect = lv_Movies.getSelectionModel().getSelectedItems();
		movieSelect.forEach(allSelect::remove);

		lNodeChanges.setText("Eintrag wurde gelöscht!");
	}

	/**
	 * Fill the Table and List with given Entries
	 */
	@FXML
	private void initialize() {

		tv_Movies.setEditable(true);

		cb_Genre.getItems().addAll("Action", "Animation", "Komödie", "Drama", "Horror", "Fantasie", "Thriller",
				"Comicverfilmung", "Romantik", "Science-Fiction");

		// Content to fill elements
		tc_Titel.setCellValueFactory(cellData -> cellData.getValue().getTitel());
		tc_Regie.setCellValueFactory(cellData -> cellData.getValue().getRegie());
		tc_Musik.setCellValueFactory(cellData -> cellData.getValue().getMusik());
		tc_Laenge.setCellValueFactory(cellData -> cellData.getValue().getLaenge().asObject());
		tc_Jahr.setCellValueFactory(cellData -> cellData.getValue().getJahr().asObject());
		tc_Haupt.setCellValueFactory(cellData -> cellData.getValue().getHaupt());
		tc_Genre.setCellValueFactory(cellData -> cellData.getValue().getGenre());
		tc_Buch.setCellValueFactory(cellData -> cellData.getValue().getBuch());
		tc_Original.setCellValueFactory(cellData -> cellData.getValue().getUsTitel());

		// Fill the TableView
		tv_Movies.setItems(db.hmFimeDB);
		// Fill the ListView
		lv_Movies.setItems(db.hmFimeDB);

		// Editable Titel
		tc_Titel.setCellFactory(TextFieldTableCell.forTableColumn());
		tc_Titel.setOnEditCommit(new EventHandler<CellEditEvent<Filme, String>>() {

			@Override
			public void handle(CellEditEvent<Filme, String> event) {
				((Filme) event.getTableView().getItems().get(event.getTablePosition().getRow()))
						.setTitel(event.getNewValue());
			}
		});

		// Editable US Titel
		tc_Original.setCellFactory(TextFieldTableCell.forTableColumn());
		tc_Original.setOnEditCommit(new EventHandler<CellEditEvent<Filme, String>>() {

			@Override
			public void handle(CellEditEvent<Filme, String> event) {
				((Filme) event.getTableView().getItems().get(event.getTablePosition().getRow()))
						.setUsTitel(event.getNewValue());
			}
		});

		// Editable Hauptdarsteller
		tc_Haupt.setCellFactory(TextFieldTableCell.forTableColumn());
		tc_Haupt.setOnEditCommit(new EventHandler<CellEditEvent<Filme, String>>() {

			@Override
			public void handle(CellEditEvent<Filme, String> event) {
				((Filme) event.getTableView().getItems().get(event.getTablePosition().getRow()))
						.setHaupt(event.getNewValue());
			}
		});

		// Editable Regie
				tc_Regie.setCellFactory(TextFieldTableCell.forTableColumn());
				tc_Regie.setOnEditCommit(new EventHandler<CellEditEvent<Filme, String>>() {

					@Override
					public void handle(CellEditEvent<Filme, String> event) {
						((Filme) event.getTableView().getItems().get(event.getTablePosition().getRow()))
								.setRegie(event.getNewValue());
					}
				});
				
				// Editable Drehbuch
				tc_Buch.setCellFactory(TextFieldTableCell.forTableColumn());
				tc_Buch.setOnEditCommit(new EventHandler<CellEditEvent<Filme, String>>() {

					@Override
					public void handle(CellEditEvent<Filme, String> event) {
						((Filme) event.getTableView().getItems().get(event.getTablePosition().getRow()))
								.setBuch(event.getNewValue());
					}
				});
				
				// Editable Musik
				tc_Musik.setCellFactory(TextFieldTableCell.forTableColumn());
				tc_Musik.setOnEditCommit(new EventHandler<CellEditEvent<Filme, String>>() {

					@Override
					public void handle(CellEditEvent<Filme, String> event) {
						((Filme) event.getTableView().getItems().get(event.getTablePosition().getRow()))
								.setMusik(event.getNewValue());
					}
				});
				
//				// Editable Länge
//				tc_Laenge.setCellValueFactory(TextFieldTableCell.forTableColumn());
//				tc_Laenge.setOnEditCommit(new EventHandler<CellEditEvent<Filme, Integer>>() {
//
//					@Override
//					public void handle(CellEditEvent<Filme, Integer> event) {
//						((Filme) event.getTableView().getItems().get(event.getTablePosition().getRow()))
//								.setLaenge(event.getNewValue());
//					}
//				});
	}

}
