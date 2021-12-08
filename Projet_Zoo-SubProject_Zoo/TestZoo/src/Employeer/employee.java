package Employeer;

import Animals.animaux;
import Employeer.employee;
import Enclosure.enclosure;

public final class employee {
	private String nom;
	private char sexe;
	private int age;
	private static employee EMPLOYEE = new employee();

	public static employee getEmployee() {
		return EMPLOYEE;
	}

	public employee initEmployee(String name, char sex, int age) {
		EMPLOYEE.setName(name);
		EMPLOYEE.setSex(sex);
		EMPLOYEE.setAge(age);
		return EMPLOYEE;
	}

	private employee() {
	}

	public void examineEnclosure(enclosure enclosure) {
		enclosure.getInfos();
	}

	public void cleanEnclosure(enclosure enclosure) {
		enclosure.clean();
		System.out.println(this.nom + " a nettoyé l'enclos " + enclosure.getName());
	}

	public void feedAnimalsOfEnclosure(enclosure enclosure) {
		enclosure.feedAnimals();
		System.out.println(this.nom + " a nourri tous les animaux de l'enclos " + enclosure.getName());
	}

	public void moveAnimalFromEnclosure(animaux animal, enclosure enclosure1, enclosure enclosure2) {
		if (enclosure1.removeAnimal(animal)) {
			if (enclosure2.addAnimal(animal)) {
				System.out.println(this.nom + " a déplacé l'animal " + animal.getNom() + " de l'enclos "
						+ enclosure1.getName() + " a l'enclos " + enclosure2.getName());
			} else {
				enclosure1.addAnimal(animal);
			}
		}
		// TODO: voir autre façon de faire
	}

	public void setName(String name) {
		this.nom = name;
	}

	public void setSex(char sex) {
		this.sexe = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}
}