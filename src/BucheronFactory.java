public class BucheronFactory implements UniteFactory {
    @Override
    public Unite createUnite() {
        return new Bucheron("Bucheron", "Bucheroon",new Hache(),1, 2,0,0);
    }

}
