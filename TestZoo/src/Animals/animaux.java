package Animals;

public abstract class animaux {
	private String nom;
    private boolean sexe;
    private int poids;
    private int taille; 
    private boolean faimIndicateur; 
    private boolean sommeilIndicateur; 
    private boolean santéIndicateur; 
    
    public animaux(String name, boolean sex, int weight, int size) {
        this.nom = name;
        setSexe(sex);
        this.poids = weight;
        this.taille = size;
        this.faimIndicateur = false;
        this.sommeilIndicateur = false;
        this.santéIndicateur = true;
    }
    
    public String getNom() {
        return nom;
    }

    public boolean getSexe() {
        return sexe;
    }
    
    public void setNom(String name) {
        this.nom = name;
    }
    
    private void setSexe(boolean sex) {
        if(sex == true|| sex == false)
            this.sexe = sex;
    }
    public void manger() {
        if(this.faimIndicateur) {
            this.faimIndicateur = false;
            System.out.println(this.nom + " est en train de manger");
        }
    }

    public void voix() {
        System.out.println(this.nom + " émet un son");
    }

    public void soins() {
        if(!this.santéIndicateur) {
            this.santéIndicateur = true;
        }
    }
    
    public void dormir() {
        if(!this.sommeilIndicateur) {
            this.sommeilIndicateur = true;
            System.out.println(this.nom + " s'endort et rejoins le monde des rêves");
        }
    }

    public void reveil() {
        if(this.sommeilIndicateur) {
            this.sommeilIndicateur = false;
            System.out.println(this.nom + " se réveille !");
        }
    }
    
    public void naissance() {
        if(this.sexe == false) {
            System.out.println(this.nom + " pond des oeufs");
        }
    }
    
    public boolean isSleep() {
        return sommeilIndicateur;
    }

    public boolean isHealth() {
        return santéIndicateur;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + nom + '\'' +
                ", sex=" + sexe +
                ", weight=" + poids +
                ", size=" + taille +
                ", hunger=" + faimIndicateur +
                ", sleep=" + sommeilIndicateur +
                ", health=" + santéIndicateur +
                '}';
    }
}