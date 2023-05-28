public class Mineur extends Unite {
    private String outil;

    public Mineur(String nom, String type, int vitesseDeplacement, int coutNourriture, String outil) {
        super(nom, type, vitesseDeplacement, coutNourriture);
        this.outil = outil;
    }

    public String getOutil() {
        return outil;
    }

    public void setOutil(String outil) {
        this.outil = outil;
    }

    // Autres méthodes spécifiques aux mineurs
}