public class Unite {
    private String nom;
    private String type;
    private int vitesseDeplacement;
    private int coutNourriture;

    public Unite(String nom, String type, int vitesseDeplacement, int coutNourriture) {
        this.nom = nom;
        this.type = type;
        this.vitesseDeplacement = vitesseDeplacement;
        this.coutNourriture = coutNourriture;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getVitesseDeplacement() {
        return vitesseDeplacement;
    }

    public int getCoutNourriture() {
        return coutNourriture;
    }
}
