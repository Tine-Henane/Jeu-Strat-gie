public class Paysan extends Unite {
    private Outil outil;

    public Paysan(String nom, String type, int vitesseDeplacement, int coutNourriture, Outil outil) {
        super(nom, type, vitesseDeplacement, coutNourriture);
        this.outil = outil;
    }
    public Outil getOutil() {
        return outil;
    }

    public void setOutil(Outil outil) {
        this.outil = outil;
    }

    // Autres méthodes spécifiques aux paysans
}