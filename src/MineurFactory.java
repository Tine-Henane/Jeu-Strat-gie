public class MineurFactory implements UniteFactory {
    @Override
    public Unite createUnite() {
        return new Mineur("Mineur", "Mineur",new Pioche(),1, 2,0,0);
    }
}
