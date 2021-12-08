package Animals;

public class pingouins extends animaux implements mix {

	public pingouins(String name, boolean sex, int weight, int size) {
		super(name, sex, weight, size);
	}

	@Override
	public void deplacements() {
		System.out.println(super.getNom() + " marche car il peut pas voler...");
	}
}
