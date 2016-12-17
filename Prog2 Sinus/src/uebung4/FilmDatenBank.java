package uebung4;

import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Collection of Movies via HashMap

 * Created by
 * Author: Sven Böhrnsen
 * IDE: Eclipse Neon
 * Date: 28.11.2016
 * 
 */
public class FilmDatenBank {
	//HashMap<Integer, Filme> hmFimeDB = new HashMap<Integer, Filme>();
	
	ObservableList<Filme> hmFimeDB = FXCollections.observableArrayList(); 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public FilmDatenBank() {
		
		insertFilms();
	}
	
	/**
	 * HashMap with the Movie content
	 */
	public void insertFilms() {
		
		
		// 1. Film - Highlander
		Filme film1 = new Filme();
		film1.setTitel("Highlander – Es kann nur einen geben");
		film1.setUsTitel("Highlander");
		film1.setHaupt("Christopher Lambert, Sean Connery, Clancy Brown");
		film1.setRegie("Russell Mulcahy");
		film1.setBuch("Gregory Widen, Peter Bellwood, Larry Ferguson");
		film1.setMusik("Michael Kamen, Queen");
		film1.setLaenge(111);
		film1.setJahr(1986);
		film1.setGenre("Fantasie");
		//hmFimeDB.put(0, film1);
		hmFimeDB.add(film1);

		// 2. Film - Back to the Future
		Filme film2 = new Filme();
		film2.setTitel("Zurück in die Zukunft");
		film2.setUsTitel("Back to the Future");
		film2.setHaupt("Michael J. Fox, Christopher Lloyd, Lea Thompson");
		film2.setRegie("Robert Zemeckis");
		film2.setBuch("Bob Gale, Robert Zemeckis");
		film2.setMusik("Alan Silvestri");
		film2.setLaenge(116);
		film2.setJahr(1985);
		film2.setGenre("Science-Fiction");
		//hmFimeDB.put(1, film2);
		hmFimeDB.add(film2);
		
		// 3. Film - Tron
		Filme film3 = new Filme();
		film3.setTitel("Tron");
		film3.setUsTitel("Tron");
		film3.setHaupt("Jeff Bridges, Bruce Boxleitner, David Warner");
		film3.setRegie("Steven Lisberger");
		film3.setBuch("Steven Lisberger, Bonnie MacBird");
		film3.setMusik("Wendy Carlos");
		film3.setLaenge(96);
		film3.setJahr(1982);
		film3.setGenre("Science-Fiction");
		//hmFimeDB.put(2, film3);
		hmFimeDB.add(film3);
		
		// 4. Film - Manche mögen's heiß
		Filme film4 = new Filme();
		film4.setTitel("Manche mögen's heiß");
		film4.setUsTitel("Some Like It Hot");
		film4.setHaupt("Tony Curtis, Jack Lemmon, Marilyn Monroe");
		film4.setRegie("Billy Wilder");
		film4.setBuch("Billy Wilder, I.A.L. Diamond");
		film4.setMusik("Adolph Deutsch, Matty Malneck");
		film4.setLaenge(120);
		film4.setJahr(1959);
		film4.setGenre("Komödie");
		//hmFimeDB.put(3, film4);
		hmFimeDB.add(film4);
		
		// 5. Film - Eine Leiche zum Dessert
		Filme film5 = new Filme();
		film5.setTitel("Eine Leiche zum Dessert");
		film5.setUsTitel("Murder by Death");
		film5.setHaupt("Peter Falk, David Niven, Peter Sellers");
		film5.setRegie("Robert Moore");
		film5.setBuch("Neil Simon");
		film5.setMusik("Dave Grusin");
		film5.setLaenge(95);
		film5.setJahr(1976);
		film5.setGenre("Komödie");
		//hmFimeDB.put(4, film5);
		hmFimeDB.add(film5);
		
		// 6. Film - Blues Brothers
		Filme film6 = new Filme();
		film6.setTitel("Blues Brothers");
		film6.setUsTitel("The Blues Brothers");
		film6.setHaupt("Dan Aykroyd, John Belushi, Carrie Fisher");
		film6.setRegie("John Landis");
		film6.setBuch("Dan Aykroyd, John Landis");
		film6.setMusik("Ira Newborn, Elmer Bernstein");
		film6.setLaenge(132);
		film6.setJahr(1980);
		film6.setGenre("Komödie");
		//hmFimeDB.put(5, film6);
		hmFimeDB.add(film6);

		// 7. Film - Captain America: The First Avenger
		Filme film7 = new Filme();
		film7.setTitel("Captain America: The First Avenger");
		film7.setUsTitel("Captain America: The First Avenger");
		film7.setHaupt("Chris Evans, Hugo Weaving, Sebastian Stan");
		film7.setRegie("Joe Johnston");
		film7.setBuch("Christopher Markus, Stephen McFeely");
		film7.setMusik("Alan Silvestri");
		film7.setLaenge(124);
		film7.setJahr(2011);
		film7.setGenre("Action");
		//hmFimeDB.put(6, film7);
		hmFimeDB.add(film7);
		
		// 8. Film - Knight and Day
		Filme film8 = new Filme();
		film8.setTitel("Knight and Day");
		film8.setUsTitel("Knight and Day");
		film8.setHaupt("Tom Cruise, Cameron Diaz, Maggie Grace");
		film8.setRegie("James Mangold");
		film8.setBuch("Patrick O’Neill");
		film8.setMusik("John Powell");
		film8.setLaenge(109);
		film8.setJahr(2010);
		film8.setGenre("Komödie");
		//hmFimeDB.put(7, film8);
		hmFimeDB.add(film8);
		
		// 9. Film - Chihiros Reise ins Zauberland
		Filme film9 = new Filme();
		film9.setTitel("Chihiros Reise ins Zauberland");
		film9.setUsTitel("Spirited Away");
		film9.setHaupt("Rumi Hiiragi, Miyu Irino, Mari Natsuki");
		film9.setRegie("Hayao Miyazaki");
		film9.setBuch("Hayao Miyazaki");
		film9.setMusik("Joe Hisaishi");
		film9.setLaenge(125);
		film9.setJahr(2001);
		film9.setGenre("Animation");
		//mFimeDB.put(8, film9);
		hmFimeDB.add(film9);
		
		// 10. Film - Die Körperfresser kommen
		Filme film10 = new Filme();
		film10.setTitel("Die Körperfresser kommen");
		film10.setUsTitel("Invasion of the Body Snatchers");
		film10.setHaupt("Donald Sutherland, Brooke Adams, Leonard Nimoy");
		film10.setRegie("Philip Kaufman");
		film10.setBuch("W. D. Richter");
		film10.setMusik("Denny Zeitlin");
		film10.setLaenge(111);
		film10.setJahr(1978);
		film10.setGenre("Science-Fiction");
		//hmFimeDB.put(9, film10);
		hmFimeDB.add(film10);

	}

}
