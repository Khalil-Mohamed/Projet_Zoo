/**
 * 
 */
package Enclos;

import java.util.*;

import Zoo.Animaux;

/**
 * @author n19004502
 *
 */
public class Enclos <T>{
	private String name;
	private double supercifie;
	private int maxAnimals;
	private int nbAnimals;
	// private Animaux[] actualAnimals= new Animaux[maxAnimals];
	private ArrayList<T> actualAnimals;

	private enum degreProprete {
		mauvais, correct, bon
	}
	
	

	/**
	 * @param name
	 * @param supercifie
	 * @param maxAnimals
	 * @param nbAnimals
	 * @param actualAnimals
	 */
	public Enclos(String name, double supercifie, int maxAnimals) {
		super();
		this.name = name;
		this.supercifie = supercifie;
		this.maxAnimals = maxAnimals;
		this.nbAnimals = 0;
		this.actualAnimals = new ArrayList<T>();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the supercifie
	 */
	public double getSupercifie() {
		return supercifie;
	}

	/**
	 * @param supercifie the supercifie to set
	 */
	public void setSupercifie(double supercifie) {
		this.supercifie = supercifie;
	}

	/**
	 * @return the maxAnimals
	 */
	public int getMaxAnimals() {
		return maxAnimals;
	}

	/**
	 * @param maxAnimals the maxAnimals to set
	 */
	public void setMaxAnimals(int maxAnimals) {
		this.maxAnimals = maxAnimals;
	}

	/**
	 * @return the nbAnimals
	 */
	public int getNbAnimals() {
		return nbAnimals;
	}

	/**
	 * @param nbAnimals the nbAnimals to set
	 */
	public void setNbAnimals(int nbAnimals) {
		this.nbAnimals = nbAnimals;
	}

	/**
	 * @return the actualAnimals
	 */
	public List<T> getActualAnimals() {
		return actualAnimals;
	}

	/**
	 * @param actualAnimals the actualAnimals to set
	 */
	public void setActualAnimals(ArrayList<T> actualAnimals) {
		this.actualAnimals = actualAnimals;
	}

	@Override
	public String toString() {
		return "Enclos [name=" + name + ", supercifie=" + supercifie + ", maxAnimals=" + maxAnimals + ", nbAnimals="
				+ nbAnimals + ", actualAnimals=" + actualAnimals + "]";
	}

	/**
	 * 
	 */

	public void printAnimalsAttributs() {
		System.out.println(toString());
		System.out.println(actualAnimals);
	}

	public void ajouter(T espece) {
		if (nbAnimals == maxAnimals) {
			System.out.println("enclos plein");
		} else {
			this.nbAnimals += 1;
			actualAnimals.add(espece);
			System.out.println("animal ajouter");
		}
	}

	public void enlever(T espece) {

		if (nbAnimals == 0) {
			System.out.println("enclos vide");
		} else {
			this.nbAnimals -=1;
			for (int i = 0; i <= actualAnimals.size() - 1; i++)
				if (actualAnimals.get(i) == espece) {
					actualAnimals.remove(i);
				}
			System.out.println("animal retirer");
		}

	}

	public void feedAnimals() {
		for (T animals : actualAnimals) {
			if (((Animaux) animals).isHungryIndicator() == true) {
				((Animaux) animals).eat(true);
				System.out.println("Je nourris les " + animals);
			}
			else {
				System.out.println("Ils ont pas faim " + animals);
			}
		}
	}
	public void transferer(T espece, Enclos enclos2) {
		this.enlever(espece);
		enclos2.ajouter(espece);
		System.out.println("Le transfert a bien été effectué");
	}
	public void maintenance(degreProprete etat) {
		if (nbAnimals == 0 && etat == degreProprete.mauvais) {
			System.out.println("Nettoyage en cours");
		} else {
			System.out.println("Enclos propre");
		}
	}
	public Enclos() {
		// TODO Auto-generated constructor stub
	}

}
