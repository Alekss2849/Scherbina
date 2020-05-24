public enum Multitravels
{
    FOUR(4, 30),
    TEN(10, 70),
    TWENTY(20, 120);

    private int travels;
    private int price;

    public int getTravels() {
        return travels;
    }

    public int getPrice() {
        return price;
    }

    Multitravels(int travels, int price) {
        this.travels = travels;
        this.price = price;
    }
}
