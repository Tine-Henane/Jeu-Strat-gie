public class Pioche implements Outil {
    private int niveau;
    private int efficacite;

    public Pioche() {
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
        niveau++;
        efficacite++;
        System.out.println("La pioche a été améliorée. Niveau : " + niveau + ", Efficacité : " + efficacite);
    }
}
