public class Bucheron extends Unite {
    private String outil;

    public Bucheron(String nom, String type, int vitesseDeplacement, int coutNourriture, String outil) {
        super(nom, type, vitesseDeplacement, coutNourriture);
        this.outil = outil;
    }

    public String getOutil() {
        return outil;
    }

    public void setOutil(String outil) {
        this.outil = outil;
    }

    // Autres méthodes spécifiques aux bucherons
}