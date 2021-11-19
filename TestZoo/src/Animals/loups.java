package Animals;

public class loups extends mammiferes implements terrestre {
    public loups(String name, Boolean sex, int weight, int size) {
        super(name, sex, weight, size);
    }

    @Override
    public void deplacements() {
        System.out.println(super.getNom() + " nage !");
    }
}
