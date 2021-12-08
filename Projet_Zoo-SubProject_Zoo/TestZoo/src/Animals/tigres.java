package Animals;

public class tigres extends mammiferes implements terrestre {

	public tigres(String name, Boolean sex, int weight, int size) {
		super(name, sex, weight, size);
	}

	@Override
	public void deplacements() {
		System.out.println(super.getNom() + " vagabonde !");
	}
}
