import java.util.List;

public class Batiment {
    private String nom;
    private int intervalleCreation; // Intervalle de création en tours de jeu
    private List<Ressource> coutCreation; // Ressources nécessaires pour la création du bâtiment

    public Batiment(String nom, int intervalleCreation, List<Ressource> coutCreation) {
        this.nom = nom;
        this.intervalleCreation = intervalleCreation;
        this.coutCreation = coutCreation;
    }

    public String getNom() {
        return nom;
    }

    public int getIntervalleCreation() {
        return intervalleCreation;
    }

    public List<Ressource> getCoutCreation() {
        return coutCreation;
    }
   //les méthodes
   // Méthode spécifique au bâtiment de production de bucherons

}
