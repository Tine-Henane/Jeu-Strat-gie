public class CoffreJoueur {
    protected Ressource ressource;

    public CoffreJoueur() {
        this.ressource = new Ressource(0, 0, 0, 0, 0); // Initialisation du coffre vide
    }

    public void ajouterRessource(Ressource ressource) {
        int boisActuel = this.ressource.getBois() + ressource.getBois();
        int pierreActuelle = this.ressource.getPierre() + ressource.getPierre();
        int orActuel = this.ressource.getOr() + ressource.getOr();
        int nourritureActuelle = this.ressource.getNourriture() + ressource.getNourriture();

        this.ressource.setBois(boisActuel);
        this.ressource.setPierre(pierreActuelle);
        this.ressource.setOr(orActuel);
        this.ressource.setNourriture(nourritureActuelle);
    }

    public void retirerRessource(Ressource ressource) {
        int boisActuel = this.ressource.getBois() - ressource.getBois();
        int pierreActuelle = this.ressource.getPierre() - ressource.getPierre();
        int orActuel = this.ressource.getOr() - ressource.getOr();
        int nourritureActuelle = this.ressource.getNourriture() - ressource.getNourriture();

        // Assurez-vous que les quantités ne deviennent pas négatives
        boisActuel = Math.max(0, boisActuel);
        pierreActuelle = Math.max(0, pierreActuelle);
        orActuel = Math.max(0, orActuel);
        nourritureActuelle = Math.max(0, nourritureActuelle);

        this.ressource.setBois(boisActuel);
        this.ressource.setPierre(pierreActuelle);
        this.ressource.setOr(orActuel);
        this.ressource.setNourriture(nourritureActuelle);
    }
    public int getNourritureDisponible() {
        return this.ressource.getNourriture();
    }
}
