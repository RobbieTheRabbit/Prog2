package uebung4;

import java.util.Set;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Templade class for the Movie entries
 * 
 * Created by Author: Sven Böhrnsen 
 * IDE: Eclipse Neon 
 * Date: 22.11.2016
 * 
 */

public class Filme {
	private SimpleStringProperty titel = new SimpleStringProperty();
	private SimpleStringProperty  usTitel = new SimpleStringProperty();
	private SimpleStringProperty  haupt= new SimpleStringProperty();
	private SimpleStringProperty  regie= new SimpleStringProperty();
	private SimpleStringProperty  buch= new SimpleStringProperty();
	private SimpleStringProperty  musik= new SimpleStringProperty();
	private SimpleIntegerProperty jahr= new SimpleIntegerProperty();
	private SimpleIntegerProperty laenge= new SimpleIntegerProperty();
	private SimpleStringProperty  genre= new SimpleStringProperty();
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Filme [titel=" + titel + ", usTitel=" + usTitel + ", haupt=" + haupt + ", regie=" + regie + ", buch="
				+ buch + ", musik=" + musik + ", jahr=" + jahr + ", laenge=" + laenge + ", genre=" + genre + "]";
	}

	//	Getters and Setters 
	
	/**
	 * @return the titel
	 */
	public SimpleStringProperty getTitel() {
		return titel;
	}

	/**
	 * @param string the titel to set
	 */
	public void setTitel(String string) {
		this.titel.set(string);

	}

	/**
	 * @return the usTitel
	 */
	public SimpleStringProperty getUsTitel() {
		return usTitel;
	}

	/**
	 * @param string the usTitel to set
	 */
	public void setUsTitel(String string) {
		this.usTitel.set(string);
	}

	/**
	 * @return the haupt
	 */
	public SimpleStringProperty getHaupt() {
		return haupt;
	}

	/**
	 * @param string the haupt to set
	 */
	public void setHaupt(String string) {
		this.haupt.set(string);
	}

	/**
	 * @return the regie
	 */
	public SimpleStringProperty getRegie() {
		return regie;
	}

	/**
	 * @param string the regie to set
	 */
	public void setRegie(String string) {
		this.regie.set(string);
	}

	/**
	 * @return the buch
	 */
	public SimpleStringProperty getBuch() {
		return buch;
	}

	/**
	 * @param string the buch to set
	 */
	public void setBuch(String string) {
		this.buch.set(string);
	}

	/**
	 * @return the musik
	 */
	public SimpleStringProperty getMusik() {
		return musik;
	}

	/**
	 * @param string the musik to set
	 */
	public void setMusik(String string) {
		this.musik.set(string);
	}

	/**
	 * @return the jahr
	 */
	public SimpleIntegerProperty getJahr() {
		return jahr;
	}

	/**
	 * @param i the jahr to set
	 */
	public void setJahr(int i) {
		this.jahr.set(i);
	}

	/**
	 * @return the laenge
	 */
	public SimpleIntegerProperty getLaenge() {
		return laenge;
	}

	/**
	 * @param i the laenge to set
	 */
	public void setLaenge(int i) {
		this.laenge.set(i);
	}

	/**
	 * @return the genre
	 */
	public SimpleStringProperty getGenre() {
		return genre;
	}

	/**
	 * @param string the genre to set
	 */
	public void setGenre(String string) {
		this.genre.set(string);
	}
	
	

}

//enum Genre {
//	Action, Animation, Komödie, Drama, Horror, Fantasie, Thriller, Comicverfilmung, Romantik, Science-Fiction 
//}
