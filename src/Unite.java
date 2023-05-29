public abstract class Unite {
    private String nom;
    private String type;
    protected Outil outil;
    private int vitesseDeplacement;
    private int coutNourriture;

    public Unite(String nom, String type,Outil outil, int vitesseDeplacement, int coutNourriture) {
        this.nom = nom;
        this.type = type;
        this.outil = outil;
        this.vitesseDeplacement = vitesseDeplacement;
        this.coutNourriture = coutNourriture;
    }
    public abstract void recuprerRessource(Carte carte, CoffreJoueur coffreJoueur, int x, int y);
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
    public boolean estNourrie(Joueur joueur) {
        int nourritureDisponible = joueur.getCoffre().getNourritureDisponible();
        return nourritureDisponible >= coutNourriture;
    }


}
