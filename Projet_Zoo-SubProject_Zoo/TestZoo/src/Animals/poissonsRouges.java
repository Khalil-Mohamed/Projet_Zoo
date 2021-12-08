package Animals;

public class poissonsRouges extends animaux implements marins {
	public poissonsRouges(String name, Boolean sex, int weight, int size) {
		super(name, sex, weight, size);
	}

	@Override
	public void deplacements() {
		System.out.println(super.getNom() + " nage en rond car il est con");
	}
}
