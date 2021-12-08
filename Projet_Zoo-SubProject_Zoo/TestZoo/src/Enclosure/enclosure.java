package Enclosure;

import java.util.ArrayList;

import Animals.animaux;

public abstract class enclosure<T> {
	private String nom;
	private int area;
	private int animeauxMax; // nombre maximums d'animaux
	private int nombreAnimaux; // nombre d'animaux en temps réel
	private ArrayList<T> animals;
	private int propreter; // 3 = propre / 2 = état moyen / 1 = sale

	public enclosure(String nom, int area, int animeauxMax) {
		this.nom = nom;
		this.area = area;
		this.animeauxMax = animeauxMax;
		this.nombreAnimaux = 0;
		this.animals = new ArrayList<T>();
		this.propreter = 1;
	}

	public void getInfos() {
		System.out.println("Enclos : " + this.nom);
		System.out.println("Superficie " + this.area);
		System.out.println("Nombre max d'animaux : " + this.animeauxMax);
		System.out.println("Nombre actuels d'animaux : " + this.nombreAnimaux);
		System.out.println("Niveau de propreté : " + this.propreter + "/3");
		for (T animal : animals) {
			System.out.println(animal); // TODO: permettre de voir le type d'animal (Wolf, Tiger etc...)
		}
	}

	public boolean addAnimal(T animal) {
		if (this.nombreAnimaux + 1 <= this.animeauxMax) {
			if (!this.animals.contains(animal)) {
				this.animals.add(animal);
				++this.nombreAnimaux;
				System.out.println(((animaux) animal).getNom() + " a été ajouté à l'enclos " + this.nom + " ("
						+ this.nombreAnimaux + "/" + this.animeauxMax + ")");
			} else {
				System.out.println(((animaux) animal).getNom() + " est déjà dans l'enclos " + this.nom);
				return false;
			}
		} else {
			System.out.println("Nombre maximal d'animaux atteint pour l'enclos " + this.nom + " !");
			return false;
		}
		return true;
	}

	public boolean removeAnimal(T animal) {
		if (this.animals.contains(animal)) {
			this.animals.remove(animal);
			--this.nombreAnimaux;
			System.out.println(((animaux) animal).getNom() + " a été enlevé à l'enclos " + this.nom);
		} else {
			System.out.println("L'animal n'est pas dans l'enclos " + this.nom);
			return false;
		}
		return true;
	}

	public void feedAnimals() {
		for (T animal : animals) {
			((animaux) animal).manger();
		}
		System.out.println("Tous les animaux de l'enclos " + this.nom + " ont été nourris");
	}

	public void clean() {
		this.propreter = 1;
		System.out.println("L'enclos " + this.nom + " est maintenant propre");
	}

	public void showAnimals() {
		/*
		 * for(Animal animal : this.animals) { System.out.println(animal); }
		 */
	}

	public String getnom() {
		return nom;
	}

	public int getnombreAnimaux() {
		return nombreAnimaux;
	}

	public ArrayList<T> getAnimals() {
		return animals;
	}
}