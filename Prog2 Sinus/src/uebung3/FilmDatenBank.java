package uebung3;

import java.util.HashMap;

/**
 * XXX

 * Created by
 * Author: Sven Böhrnsen
 * IDE: Eclipse Neon
 * Date: 28.11.2016
 * 
 */
public class FilmDatenBank {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void insertFilms() {
		HashMap<String, Filme> hmFimeDB = new HashMap<String, Filme>();
		
		// 1. Film - Highlander
		Filme film1 = new Filme();
		film1.titel  = "Highlander – Es kann nur einen geben";
		film1.original = "Highlander";
		film1.haupt = "Christopher Lambert, Sean Connery, Clancy Brown";
		film1.regie = "Russell Mulcahy";
		film1.buch = "Gregory Widen, Peter Bellwood, Larry Ferguson";
		film1.musik = "Michael Kamen, Queen";
		film1.laenge = "111";
		film1.jahr = "1986";
		film1.genre = "Fantasie";

		// 2. Film - Back to the Future
		Filme film2 = new Filme();
		film2.titel  = "Zurück in die Zukunft";
		film2.original = "Back to the Future";
		film2.haupt = "Michael J. Fox, Christopher Lloyd, Lea Thompson";
		film2.regie = "Robert Zemeckis";
		film2.buch = "	Bob Gale, Robert Zemeckis";
		film2.musik = "Alan Silvestri";
		film2.laenge= "116";
		film2.jahr = "1985";
		film2.genre = "Science-Fiction";
		
		// 3. Film - Tron
		Filme film3 = new Filme();
		film3.titel  = "Tron";
		film3.original = "Tron";
		film3.haupt = "Jeff Bridges, Bruce Boxleitner, David Warner";
		film3.regie = "Steven Lisberger";
		film3.buch = "Steven Lisberger, Bonnie MacBird";
		film3.musik = "Wendy Carlos";
		film3.laenge= "96";
		film3.jahr = "1982";
		film3.genre = "Science-Fiction";
		
		// 4. Film - Manche m�gen�s hei�
		Filme film4 = new Filme();
		film4.titel  = "Manche mögen's heiß";
		film4.original = "Some Like It Hot";
		film4.haupt = "Tony Curtis, Jack Lemmon, Marilyn Monroe";
		film4.regie = "Billy Wilder";
		film4.buch = "Billy Wilder, I.A.L. Diamond";
		film4.musik = "Adolph Deutsch, Matty Malneck";
		film4.laenge= "120";
		film4.jahr = "1959";
		film4.genre = "Komödie";
		
		// 5. Film - Eine Leiche zum Dessert
		Filme film5 = new Filme();
		film5.titel  = "Eine Leiche zum Dessert";
		film5.original = "Murder by Death";
		film5.haupt = "Peter Falk, David Niven, Peter Sellers";
		film5.regie = "Robert Moore";
		film5.buch = "Neil Simon";
		film5.musik = "Dave Grusin";
		film5.laenge= "95";
		film5.jahr = "1976";
		film5.genre = "Komödie";
		
		// 6. Film - Blues Brothers
		Filme film6 = new Filme();
		film6.titel  = "Blues Brothers";
		film6.original = "The Blues Brothers";
		film6.haupt = "Dan Aykroyd, John Belushi, Carrie Fisher";
		film6.regie = "John Landis";
		film6.buch = "Dan Aykroyd, John Landis";
		film6.musik = "Ira Newborn, Elmer Bernstein";
		film6.laenge= "132";
		film6.jahr = "1980";
		film6.genre = "Komödie";

		// 7. Film - Captain America: The First Avenger
		Filme film7 = new Filme();
		film7.titel  = "Captain America: The First Avenger";
		film7.original = "Captain America: The First Avenger";
		film7.haupt = "Chris Evans, Hugo Weaving, Sebastian Stan";
		film7.regie = "Joe Johnston";
		film7.buch = "Christopher Markus, Stephen McFeely";
		film7.musik = "Alan Silvestri";
		film7.laenge= "124";
		film7.jahr = "2011";
		film7.genre = "Action";

		// 8. Film - Knight and Day
		Filme film8 = new Filme();
		film8.titel  = "Knight and Day";
		film8.original = "Knight and Day";
		film8.haupt = "Tom Cruise, Cameron Diaz, Maggie Grace";
		film8.regie = "James Mangold";
		film8.buch = "Patrick O’Neill";
		film8.musik = "John Powell";
		film8.laenge= "109";
		film8.jahr = "2010";
		film8.genre = "Komödie";
		
	}

}
