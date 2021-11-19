/**
 * 
 */
package Espece;
import Zoo.Animaux;
import Zoo.Mammiferes;

/**
 * @author n19004502
 *
 */
public class Tigres extends Animaux implements Mammiferes{

	public Tigres(String name, boolean sexe, double poids, double taille, int age) {
		super(name, sexe, poids, taille, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void reproduire() {
		if(this.isSexe() == true) {
			System.out.println("Je me reproduis et va donner naissance � un b�b�");
		}else {
			System.out.println("Je peux pas mettre bas");
		}		
	}

	@Override
	public void deplacement() {
		System.out.println("Je peux vagabonder");
	}

}

