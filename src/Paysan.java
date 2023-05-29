public class Paysan extends Unite {

    public Paysan(String nom, String type,Outil outil, int vitesseDeplacement, int coutNourriture) {
        super(nom, type,outil, vitesseDeplacement, coutNourriture);
    }

    @Override
    public void recupererRessource(Carte carte, CoffreJoueur coffreJoueur, int x,int y) {
        if(carte.getRessource(x,y).getBois()>0){
            if(coffreJoueur.ressource.nourriture<coffreJoueur.ressource.getquantiteMax()){
                int maxOutil= this.outil.getEfficacite();

                while(coffreJoueur.ressource.nourriture<coffreJoueur.ressource.getquantiteMax()&&maxOutil>0&&carte.getRessource(x,y).or>0){
                    coffreJoueur.ressource.nourriture++;
                    maxOutil--;
                    carte.ressources[x][y].nourriture--;
                }
            }else{
                System.out.println("Max quantité");
            }
//            coffreJoueur.ressource.setBois();
        }
    }
    // Autres méthodes spécifiques aux paysans
}