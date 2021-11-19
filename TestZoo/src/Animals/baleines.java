package Animals;

public class baleines extends mammiferes implements marins {
    public baleines(String name, Boolean sex, int weight, int size) {
        super(name, sex, weight, size);
    }

    @Override
    public void deplacements() {
        System.out.println(super.getNom() + " nage !");
    }
}
