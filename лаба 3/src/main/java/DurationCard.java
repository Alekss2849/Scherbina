import java.util.Date;

public class DurationCard extends Card {

    private Date endDate;
    Days day;

    public DurationCard(boolean isPrivilage, Days day) {
        super(isPrivilage);
        this.day = day;
        endDate = getDateOfReg();
        endDate.setDate(endDate.getDate() + day.getDays());
        balance = 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void verifyCard() {
        Date currentDate = new Date();
        if (endDate.compareTo(currentDate) >= 0) {
            System.out.println("Прохід дозволено");
        } else {
            throw new RuntimeException("Прохід заборонено");
        }
    }


    @Override
    public String toString() {
        return "TimeCard{" +
                " id=" + this.getId() +
                " isBlocked=" + this.isBlocked() +
                " dateTo=" + endDate +
                ", isPrivilage=" + pilg +
                '}';
    }

}
