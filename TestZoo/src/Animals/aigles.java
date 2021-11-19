package Animals;

public class aigles extends animaux implements volants {

    public aigles(String name, Boolean sex, int weight, int size) {
        super(name, sex, weight, size);
    }

    @Override
    public void deplacements() {
        System.out.println(super.getNom() + " vole de manière royal !");
    }
}
