import java.util.Date;

public abstract class Card
{
    public static int count = 0;

    public abstract int getPrice();


    private int id;
    private Date dateOfReg;
    public boolean pilg;
    private boolean isBlocked;
    public int balance;



    public Date getDateOfReg() {
        return dateOfReg;
    }

    public int getId() {
        return id;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void Block(boolean blocked) {
        isBlocked = blocked;
    }

    public Card(boolean pilg) {
        this.id = count++;
        this.pilg = pilg;
        this.isBlocked = false;
        dateOfReg = new Date();
    }

    public abstract void verifyCard();

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", dateRegistration=" + dateOfReg +
                ", pilg=" + pilg +
                ", isBlocked=" + isBlocked +
                ", balance=" + balance +
                '}';
    }
}
