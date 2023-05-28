public class Houe implements Outil {
    private int niveau;
    private int efficacite;

    public Houe() {
        this.niveau = 1;
        this.efficacite = 1;
    }

    @Override
    public int getNiveau() {
        return niveau;
    }

    @Override
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public int getEfficacite() {
        return efficacite;
    }

    @Override
    public void setEfficacite(int efficacite) {
        this.efficacite = efficacite;
    }

    @Override
    public void ameliorer() {
        // Logique pour améliorer la houe
        // Par exemple :
        niveau++;
        efficacite++;
        System.out.println("La houe a été améliorée. Niveau : " + niveau + ", Efficacité : " + efficacite);
        // Autres instructions pour l'amélioration de la houe
    }
}

