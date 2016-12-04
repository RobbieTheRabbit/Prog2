package uebung3;

import java.util.ArrayList;

/*
 * Class for the Tower (Stacks) creation behaviour
 *  * 2. task of Prog2
 */
public class Tower {

	ArrayList<Disc> discs = new ArrayList<>();

	/**
	 * 
	 * @return
	 */
	public ArrayList<Disc> getDiscs() {
		return discs;
	}

	/**
	 * Set the Disc to the tower
	 * 
	 * @param discs
	 */
	public void setDiscs(ArrayList<Disc> discs) {
		this.discs = discs;
	}

	/**
	 * get the disc from the tower
	 * 
	 * @param position
	 * @return
	 */
	public Disc getDisc(int position) {
		return discs.get(position);
	}

	/**
	 * move the Disc
	 * 
	 * @param disc
	 */
	public void pushDisc(Disc disc) {
		discs.add(disc);
	}

}
