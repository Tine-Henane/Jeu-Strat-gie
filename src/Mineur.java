public class Mineur extends Unite {

    public Mineur(String nom, String type,Outil outil, int vitesseDeplacement, int coutNourriture,int positionX, int positionY) {
        super(nom, type,outil, vitesseDeplacement, coutNourriture,positionX,positionY);
    }


    @Override
    public void recupererRessource(Carte carte, CoffreJoueur coffreJoueur, int x,int y) {
        if(carte.getRessource(x,y).getBois()>0){
            if(coffreJoueur.ressource.or<coffreJoueur.ressource.getquantiteMax()){
                int maxOutil= this.outil.getEfficacite();

                while(coffreJoueur.ressource.or<coffreJoueur.ressource.getquantiteMax()&&maxOutil>0&&carte.getRessource(x,y).or>0){
                    coffreJoueur.ressource.or++;
                    maxOutil--;
                    carte.ressources[x][y].or--;
                }
            }else{
                System.out.println("Max quantité or");
            }
//            coffreJoueur.ressource.setBois();
        }
        if(carte.getRessource(x,y).getBois()>0){
            if(coffreJoueur.ressource.pierre<coffreJoueur.ressource.getquantiteMax()){
                int maxOutil= this.outil.getEfficacite();

                while(coffreJoueur.ressource.pierre<coffreJoueur.ressource.getquantiteMax()&&maxOutil>0&&carte.getRessource(x,y).pierre>0){
                    coffreJoueur.ressource.pierre++;
                    maxOutil--;
                    carte.ressources[x][y].pierre--;
                }
            }else{
                System.out.println("Max quantité Pierre");
            }
//            coffreJoueur.ressource.setBois();
        }
    }

    // Autres méthodes spécifiques aux mineurs
}