public class Bucheron extends Unite {

    public Bucheron(String nom, String type, Outil outil, int vitesseDeplacement, int coutNourriture) {
        super(nom, type,outil, vitesseDeplacement, coutNourriture);
    }

    @Override
    public void recuprerRessource(Carte carte, CoffreJoueur coffreJoueur, int x,int y) {
        if(carte.getRessource(x,y).getBois()>0){
            if(coffreJoueur.ressource.bois<coffreJoueur.ressource.getquantiteMax()){
                int maxOutil= this.outil.getEfficacite();

                while(coffreJoueur.ressource.bois<coffreJoueur.ressource.getquantiteMax()&&maxOutil>0&&carte.getRessource(x,y).bois>0){
                    coffreJoueur.ressource.bois++;
                    maxOutil--;
                    carte.ressources[x][y].bois--;
                }
            }else{
                System.out.println("Max quantité");
            }
//            coffreJoueur.ressource.setBois();
        }
    }

    // Autres méthodes spécifiques aux bucherons
}