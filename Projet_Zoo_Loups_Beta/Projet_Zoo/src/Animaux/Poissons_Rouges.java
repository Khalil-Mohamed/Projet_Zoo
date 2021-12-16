/**
 * @author Nguyen, Khalil
 *
 */
package Animaux;

import Animaux.Especes.Marins;

public class Poissons_Rouges extends Animaux implements Marins {

	/**
	 * Constructeur de poissons rouges
	 * @param name
	 */
	public Poissons_Rouges(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Surcharge/ Réécriture de la méthode reproduire
	 */
	@Override
	public void reproduire() {
		if(this.isSexe() == false) {
			System.out.println("Je ponds un oeuf");
		}else {
			System.out.println("Je peux pas pondre car je suis un male.");
		}		
	}

	/**
	 * Surcharge/ Réécriture de la méthode deplacement
	 */
	@Override
	public void deplacement() {
		System.out.println("Je peux nager");
	}

	/**
	 * Espèce de l'animal
	 * @return string
	 */
	@Override
	public String getSpecies() {return "Poisson rouge";}
}
