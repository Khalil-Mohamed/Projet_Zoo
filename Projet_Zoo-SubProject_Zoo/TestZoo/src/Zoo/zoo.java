package Zoo;

import java.util.ArrayList;
import Animals.animaux;
import Employeer.employee;
import Enclosure.enclosure;

public final class zoo {
	private String name;
	private employee employee;
	private int maxEnclosure;
	private ArrayList<enclosure> enclosures;
	private static zoo ZOO = new zoo();

	public static zoo getZoo() {
		return ZOO;
	}

	public zoo initZoo(String name, employee employee, int maxEnclosure) {
		ZOO.setName(name);
		ZOO.setEmployee(employee);
		ZOO.setMaxEnclosure(maxEnclosure);
		ZOO.setEnclosures(new ArrayList<enclosure>());
		return ZOO;
	}

	private zoo() {
	}

	public void addEnclosure(enclosure enclosure) {
		this.enclosures.add(enclosure);
		System.out.println("L'enclos " + enclosure.getnom() + " a été ajouté au Zoo " + this.name);
	}

	public void showNbAnimals() {
		int nbAnimals = 0;
		for (enclosure enclosure : this.enclosures) {
			nbAnimals += enclosure.getnombreAnimaux();
		}
		System.out.println("Le zoo " + this.name + " a " + nbAnimals + " animaux");
	}

	public void showAllAnimals() {
		System.out.println("=== Tous les animaux du zoo " + this.name + " ===");
		for (enclosure enclosure : this.enclosures) {
			System.out.println("Animaux de l'enclos " + enclosure.getnom() + " : " + enclosure.getAnimals());
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaxEnclosure(int maxEnclosure) {
		this.maxEnclosure = maxEnclosure;
	}

	public void setEnclosures(ArrayList<enclosure> enclosures) {
		this.enclosures = enclosures;
	}

	public void setEmployee(employee employee) {
		this.employee = employee;
	}
}