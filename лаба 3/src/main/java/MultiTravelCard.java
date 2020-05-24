public class MultiTravelCard extends Card
{
    Multitravels multitravels;


    public MultiTravelCard(boolean isPrivilage, Multitravels multitravels) {
        super(isPrivilage);
        this.multitravels = multitravels;
        balance = multitravels.getTravels();
    }

    @Override
    public void verifyCard() {
        if (balance > 0) {
            this.balance--;
            System.out.println("Прохід дозволено");
        } else {
            throw new RuntimeException("Прохід заборонено");
        }
    }

    @Override
    public int getPrice() {
        return multitravels.getPrice();
    }
}
