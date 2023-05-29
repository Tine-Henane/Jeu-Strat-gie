public class DecorateurExpert extends Unite{
    private Unite unite;

    public DecorateurExpert(Unite unite) {
        super(unite.getNom(),unite.getType(),unite.outil,unite.getVitesseDeplacement(),unite.getCoutNourriture(), unite.positionX, unite.positionY);
        this.unite = unite;
    }

    @Override
    public void recupererRessource(Carte carte, CoffreJoueur coffreJoueur, int x, int y) {
        unite.recupererRessource(carte, coffreJoueur, x, y); // Premier appel à la méthode recupererRessource de l'unité de base

        unite.recupererRessource(carte, coffreJoueur, x, y); // Deuxième appel pour doubler la quantité de ressources récupérées
    }
}
