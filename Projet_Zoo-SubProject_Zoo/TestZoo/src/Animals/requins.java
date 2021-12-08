package Animals;

public class requins extends animaux implements marins {

	public requins(String name, Boolean sex, int weight, int size) {
		super(name, sex, weight, size);
	}

	@Override
	public void deplacements() {
		System.out.println(super.getNom() + " nage dangeureusement !");
	}
}
