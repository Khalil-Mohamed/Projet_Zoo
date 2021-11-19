/**
 * 
 */
package Espece;
import Zoo.Animaux;
import Zoo.Marins;
import Zoo.Volants;

/**
 * @author n19004502
 *
 */
public class Pingouins extends Animaux implements Volants,Marins{

	public Pingouins(String name, boolean sexe, double poids, double taille, int age) {
		super(name, sexe, poids, taille, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reproduire() {
		System.out.println("Je peux pas pondre");
	
	}

	@Override
	public void deplacement() {
		System.out.println("Je peux voler et nager");
	}

}
