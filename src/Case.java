import java.util.ArrayList;
import java.util.List;

public class Case {
    private Ressource ressource;
    private List<Unite> unites;

    public Case() {
        this.ressource = null;
        this.unites = new ArrayList<>();
    }

    public Ressource getRessource() {
        return ressource;
    }

    public void setRessource(Ressource ressource) {
        this.ressource = ressource;
    }

    public List<Unite> getUnites() {
        return unites;
    }

    public void addUnite(Unite unite) {
        unites.add(unite);
    }

    public void removeUnite(Unite unite) {
        unites.remove(unite);
    }
}
