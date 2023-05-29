import java.util.List;
public abstract class Component {
    public abstract void ajouter(Component component);
    public abstract void retirer(Component component);
    public abstract List<Component> getUnites();
    public abstract int getVitesseDeplacement();
    public abstract int getCoutNourriture();
    public abstract int getQuantiteRessources();
}
