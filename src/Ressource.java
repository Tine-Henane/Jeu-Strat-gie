public class Ressource {
    protected int bois;
    protected int pierre;
    protected int or;
    protected int nourriture;
    protected int quantiteMax;
    public Ressource(int bois, int pierre, int or, int nourriture,int quantiteMax) {
        this.bois = bois;
        this.pierre = pierre;
        this.or = or;
        this.nourriture = nourriture;
        this.quantiteMax = quantiteMax;
    }

    public int getBois() {
        return bois;
    }

    public int getPierre() {
        return pierre;
    }

    public int getOr() {
        return or;
    }

    public int getNourriture() {
        return nourriture;
    }

    public int getquantiteMax() {
        return quantiteMax;
    }
    public void setBois(int bois) {
        this.bois = bois;
    }

    public void setPierre(int pierre) {
        this.pierre = pierre;
    }

    public void setOr(int or) {
        this.or = or;
    }

    public void setNourriture(int nourriture) {
        this.nourriture = nourriture;
    }
    public void setquantiteMax(int quantiteMax) {
        this.quantiteMax = quantiteMax;
    }
}
