package Enclosure;

import Animals.animaux;

public class enclosNormal<T extends animaux> extends enclosure<T> {

	public enclosNormal(String nom, int area, int animauxMax) {
		super(nom, area, animauxMax);
	}
}
