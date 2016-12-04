package uebung3;

/*	
 * Class for the Disk and length behaviour
 *  * 2. task of Prog2
 */
public class Disc {

	private int wight; // the wight of the disc
	private int left; // where to start

	/**
	 * 
	 * @param wight
	 * @param left
	 */
	public Disc(int wight, int left) {
		this.wight = wight;
		this.left = left;
	}

	/**
	 * getter for the Left
	 * 
	 * @return
	 */
	public int getLeft() {
		return left;
	}

	/**
	 * Setter for Left
	 * 
	 * @param left
	 */
	public void setLeft(int left) {
		this.left = left;
	}

	/**
	 * Getter for the Disc Wright
	 * 
	 * @return
	 */
	public int getWight() {
		return wight;
	}

	/**
	 * Setter for the Disc Wright
	 * 
	 * @param wight
	 */
	public void setWight(int wight) {
		this.wight = wight;
	}
}
