public class Carte {
    private static Carte instance;
    protected Case[][] cases;
    private int largeur;
    private int hauteur;
    protected Ressource[][] ressources;
    private Carte(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.ressources = new Ressource[largeur][hauteur];
        this.cases = new Case[largeur][hauteur];

        // Initialisation des cases de la carte
        for (int x = 0; x < largeur; x++) {
            for (int y = 0; y < hauteur; y++) {
                cases[x][y] = new Case();
            }
        }
    }

    public static Carte getInstance(int largeur, int hauteur) {
        if (instance == null) {
            instance = new Carte(largeur, hauteur);
        }
        return instance;
    }

    public Case getCase(int x, int y) {
        return cases[x][y];
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public Ressource getRessource(int x, int y) {
        if (estPositionValide(x, y)) {
            return ressources[x][y];
        } else {
            System.out.println("Position invalide sur la carte.");
            return null;
        }
    }

    public void retirerRessource(int x, int y) {
        if (estPositionValide(x, y)) {
            ressources[x][y] = null;
        } else {
            System.out.println("Position invalide sur la carte.");
        }
    }

    protected boolean estPositionValide(int x, int y) {
        return x >= 0 && x < ressources.length && y >= 0 && y < ressources[0].length;
    }
}
