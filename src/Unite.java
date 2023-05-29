public abstract class Unite extends Component{
    private String nom;
    private String type;
    protected Outil outil;
    private int vitesseDeplacement;
    private int coutNourriture;
    protected int positionX;
    protected int positionY;
    public Unite(String nom, String type,Outil outil, int vitesseDeplacement, int coutNourriture, int positionX, int positionY) {
        this.nom = nom;
        this.type = type;
        this.outil = outil;
        this.vitesseDeplacement = vitesseDeplacement;
        this.coutNourriture = coutNourriture;
        this.positionX=positionX;
        this.positionY=positionY;
    }
    public abstract void recupererRessource(Carte carte, CoffreJoueur coffreJoueur, int x, int y);
    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getVitesseDeplacement() {
        return vitesseDeplacement;
    }

    public int getCoutNourriture() {
        return coutNourriture;
    }
    public void seDeplacer(Carte carte){

    }
    public void seDeplacerHaut(Carte carte){
        if(carte.estPositionValide(this.positionX-1,this.positionY)){
            carte.getCase(this.positionX,this.positionY).removeUnite(this);
            this.positionX--;
            carte.getCase(this.positionX,this.positionY).addUnite(this);
        }
    }
    public void seDeplacerBas(Carte carte){
        if(carte.estPositionValide(this.positionX+1,this.positionY)){
            carte.getCase(this.positionX,this.positionY).removeUnite(this);
            this.positionX++;
            carte.getCase(this.positionX,this.positionY).addUnite(this);
        }
    }
    public void seDeplacerDroite(Carte carte){
        if(carte.estPositionValide(this.positionX,this.positionY+1)){
            carte.getCase(this.positionX,this.positionY).removeUnite(this);
            this.positionY++;
            carte.getCase(this.positionX,this.positionY).addUnite(this);
        }
    }
    public void seDeplacerGauche(Carte carte){
        if(carte.estPositionValide(this.positionX,this.positionY-1)){
            carte.getCase(this.positionX,this.positionY).removeUnite(this);
            this.positionY--;
            carte.getCase(this.positionX,this.positionY).addUnite(this);
        }
    }
}
