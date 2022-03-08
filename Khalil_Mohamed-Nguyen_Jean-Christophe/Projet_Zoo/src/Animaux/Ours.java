/**
 * @author Nguyen, Khalil
 *
 */
package Animaux;

import Animaux.Especes.Mammiferes;

public class Ours extends Animaux implements Mammiferes {

	/**
	 * Constructeur d'ours
	 *
	 * @param name de l'ours
	 */
	public Ours(String name) {
		super(name);
	}

	/**
	 * Surcharge/ Réécriture de la méthode reproduire
	 */
	@Override
	public void reproduire() {
		if (!this.isSexe()) {
			System.out.println("Je me reproduis et va donner naissance à un bébé");
		} else {
			System.out.println("Je peux pas mettre bas car je suis un male.");
		}
	}

	/**
	 * Surcharge/ Réécriture de la méthode deplacement
	 */
	@Override
	public void deplacement() {
		System.out.println("Je peux vagabonder");
	}

	/**
	 * Espèce de l'animal
	 *
	 * @return String
	 */
	@Override
	public String getSpecies() {
		return "Ours";
	}
}
