import java.util.ArrayList;
import java.util.List;
public class GroupeUnites extends Component{
    private List<Component> unites;

    public GroupeUnites() {
        this.unites = new ArrayList<>();
    }

    public void ajouterUnite(Component component) {
        unites.add(component);
    }

    public void retirerUnite(Component component) {
        unites.remove(component);
    }

    public List<Unite> getUnites() {
        List<Unite> uniteList = new ArrayList<>();
        for (Component component : unites) {
            if (component instanceof Unite) {
                uniteList.add((Unite) component);
            }
        }
        return uniteList;
    }

    public void seDeplacer(Carte carte) {
        for (Component unite : unites) {
            if (unite instanceof Unite) {
                ((Unite) unite).seDeplacer(carte);
            }
        }
    }



}
