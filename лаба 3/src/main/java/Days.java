public enum Days {

    ONEDAY(1, 8),
    WEEK(7, 42),
    MONTH(30, 150);

    private int days;
    private int price;
    public int getDays() {
        return days;
    }
    public int getPrice() {
        return price;
    }

    Days(int days, int price) {
        this.days = days;
        this.price = price;
    }

}