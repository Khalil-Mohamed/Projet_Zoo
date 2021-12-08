package Animals;

public abstract class mammiferes extends animaux {

	public mammiferes(String name, boolean sex, int weight, int size) {
		super(name, sex, weight, size);
	}

	public void vagabonder() {
		System.out.println(super.getNom() + " vagabonde");
	}

	public void giveBirth() {
		if (super.getSexe() == false) {
			System.out.println("Félicitations ! " + super.getNom() + " a mit bas !");
		}
	}
}
