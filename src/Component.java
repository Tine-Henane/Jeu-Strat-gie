import java.util.List;
public abstract class Component {
    public abstract void ajouterUnite(Component component);
    public abstract void retirerUnite(Component component);
    public abstract List<Unite> getUnites();
    public abstract void seDeplacer(Carte carte);

}
