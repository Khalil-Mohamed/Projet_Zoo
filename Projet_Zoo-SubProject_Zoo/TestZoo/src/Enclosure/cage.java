package Enclosure;

import Animals.volants;

public class cage<T extends volants> extends enclosure {
	private int poids;

	public cage(String nom, int area, int animauxMax, int poids) {
		super(nom, area, animauxMax);
		this.poids = poids;
	}
}
