public class PaysanFactory implements UniteFactory {
    @Override
    public Unite createUnite() {
        return new Paysan("Paysan", "Paysan",new Houe(),1, 2,0,0);
    }
}
