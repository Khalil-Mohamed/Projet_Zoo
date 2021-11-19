package Animals;

public class ours extends mammiferes implements terrestre {

    public ours(String name, boolean sex, int weight, int size) {
        super(name, sex, weight, size);
    }

    @Override
    public void deplacements() {
        System.out.println(super.getNom() + " vagabonne !");
    }
}

