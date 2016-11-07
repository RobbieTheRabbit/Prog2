package uebung2;

import javafx.scene.paint.Color;

//	Class for the Disk and behaviour
public class Disc {

	private int wight;
	private int left;

	public Disc(int wight, int left) {
		this.wight = wight;
		this.left = left;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getWight() {
		return wight;
	}

	public void setWight(int wight) {
		this.wight = wight;
	}
}
