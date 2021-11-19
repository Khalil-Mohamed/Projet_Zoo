/**
 * 
 */
package Animaux;
import Zoo.Animaux;
import Zoo.Marins;

/**
 * @author n19004502
 *
 */
public class Baleines extends Animaux implements Marins{

	public Baleines(String name, boolean sexe, double poids, double taille, int age) {
		super(name, sexe, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reproduire() {
		if(this.isSexe() == false) {
			System.out.println("Je ponds un oeuf");
		}else {
			System.out.println("Je peux pas pondre");
		}		
	}

	@Override
	public void deplacement() {
		System.out.println("Je peux nager");
	}
	
}
