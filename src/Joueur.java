import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private String nom;
    private CoffreJoueur coffre;
    private List<Unite> unites;
    private List<Batiment> batiments;
    private Carte carte;
    public Joueur(String nom) {
        this.nom = nom;
        this.coffre = new CoffreJoueur();
        this.unites = new ArrayList<>();
        this.batiments = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public CoffreJoueur getCoffre() {
        return coffre;
    }

    public List<Unite> getUnites() {
        return unites;
    }

    public List<Batiment> getBatiments() {
        return batiments;
    }

    public void ajouterUnite(Unite unite) {
        unites.add(unite);
    }

    public void ajouterBatiment(Batiment batiment) {
        batiments.add(batiment);
    }

    public void recupererRessource(int x, int y) {
        Ressource ressource = carte.getRessource(x, y);
        if (ressource != null) {
            coffre.ajouterRessource(ressource);
            carte.retirerRessource(x, y);
        } else {
            System.out.println("Il n'y a pas de ressource à cette position.");
        }
    }


}
