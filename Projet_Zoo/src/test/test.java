/**
 * 
 */
package test;
import Enclos.Enclos;
import Espece.*;
//import Zoo.Animaux;

/**
 * @author n19004502
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tigres tigre1 = new Tigres("tigre",true,60,160,10);
		Pingouins pingouin1 = new Pingouins("pingouin",true,80,60,80);
		tigre1.eat(true);
		tigre1.beHealed(true);
		Enclos enclos1 = new Enclos("test",100,10);
		enclos1.ajouter(tigre1);
		enclos1.ajouter(pingouin1);
		System.out.println(enclos1);
		tigre1.setHungryIndicator(true);
		enclos1.feedAnimals();
		enclos1.enlever(tigre1);
		System.out.println(enclos1);
		pingouin1.setHungryIndicator(true);
		enclos1.feedAnimals();
		enclos1.enlever(pingouin1);
	}

}
