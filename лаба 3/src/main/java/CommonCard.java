public class CommonCard extends Card
{
    public static int TravelPrice = 8;

    @Override
    public int getPrice() {
        return TravelPrice;
    }

    @Override
    public void verifyCard() {
        if (balance > TravelPrice) {
            balance -= TravelPrice;
            System.out.println("Прохід дозволено");
        } else {
            throw new RuntimeException("Прохід заборонено");
        }
    }

    public CommonCard(int balance) {
        super(false);
        this.balance = balance;
    }
}
