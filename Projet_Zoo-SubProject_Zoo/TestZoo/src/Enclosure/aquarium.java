package Enclosure;

import Animals.marins;

public class aquarium<T extends marins> extends enclosure {
	private int profondeur;
	private int etatsEau; // 1 = propre / 2 = état moyen / 3 = sale

	public aquarium(String nom, int area, int animauxMax, int profondeur) {
		super(nom, area, animauxMax);
		this.profondeur = profondeur;
		this.etatsEau = 1;
	}
}