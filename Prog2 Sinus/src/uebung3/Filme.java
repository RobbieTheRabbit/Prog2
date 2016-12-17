package uebung3;

import java.util.Set;

/**
 * Templade class for the Movie entries
 * 
 * Created by Author: Sven Böhrnsen 
 * IDE: Eclipse Neon 
 * Date: 22.11.2016
 * 
 */

public class Filme {
	private String titel;
	private String usTitel;
	private String haupt;
	private String regie;
	private String buch;
	private String musik;
	private int jahr;
	private int laenge;
	private String genre;
	
	//	Getters and Setters
	
	/**
	 * @return the titel
	 */
	public String getTitel() {
		return titel;
	}
	/**
	 * @param titel the titel to set
	 */
	public void setTitel(String titel) {
		this.titel = titel;
	}
	/**
	 * @return the usTitel
	 */
	public String getUsTitel() {
		return usTitel;
	}
	/**
	 * @param usTitel the usTitel to set
	 */
	public void setUsTitel(String usTitel) {
		this.usTitel = usTitel;
	}
	/**
	 * @return the haupt
	 */
	public String getHaupt() {
		return haupt;
	}
	/**
	 * @param haupt the haupt to set
	 */
	public void setHaupt(String haupt) {
		this.haupt = haupt;
	}
	/**
	 * @return the regie
	 */
	public String getRegie() {
		return regie;
	}
	/**
	 * @param regie the regie to set
	 */
	public void setRegie(String regie) {
		this.regie = regie;
	}
	/**
	 * @return the buch
	 */
	public String getBuch() {
		return buch;
	}
	/**
	 * @param buch the buch to set
	 */
	public void setBuch(String buch) {
		this.buch = buch;
	}
	/**
	 * @return the musik
	 */
	public String getMusik() {
		return musik;
	}
	/**
	 * @param musik the musik to set
	 */
	public void setMusik(String musik) {
		this.musik = musik;
	}
	/**
	 * @return the jahr
	 */
	public int getJahr() {
		return jahr;
	}
	/**
	 * @param jahr the jahr to set
	 */
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	/**
	 * @return the laenge
	 */
	public int getLaenge() {
		return laenge;
	}
	/**
	 * @param laenge the laenge to set
	 */
	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Filme [titel=" + titel + ", usTitel=" + usTitel + ", haupt=" + haupt + ", regie=" + regie + ", buch="
				+ buch + ", musik=" + musik + ", jahr=" + jahr + ", laenge=" + laenge + ", genre=" + genre + "]";
	}
	
	

}

//enum Genre {
//	Action, Animation, Komödie, Drama, Horror, Fantasie, Thriller, Comicverfilmung, Romantik, Science-Fiction 
//}
