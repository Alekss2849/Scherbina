public class Turnstile
{
    public void MakePass(Card card) {
        if (SystemControl.cards.containsValue(card) && !card.isBlocked()) {
            if (card.pilg) {
                System.out.println("Представте документи");
            }
            try {
                card.verifyCard();
                SystemControl.PassedTravel(card);
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                SystemControl.failedTravel(card);
            }
        } else {
            System.err.println("Прохід заборонено. Картка заблокована");
            SystemControl.failedTravel(card);
        }
    }
}
