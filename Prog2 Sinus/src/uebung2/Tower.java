package uebung2;

import java.util.ArrayList;

//	Class for the Tower (Stacks) creation behaviour
public class Tower {

	ArrayList<Disc> discs = new ArrayList<>();

	public ArrayList<Disc> getDiscs() {
		return discs;
	}

	public void setDiscs(ArrayList<Disc> discs) {
		this.discs = discs;
	}

	public Disc getDisc(int position) {
		return discs.get(position);
	}

	public void pushDisc(Disc disc) {
		discs.add(disc);
	}

}
