import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.internal.jline.internal.Log.info;

public class SystemControl
{
    public static Map<Integer, Card> cards = new HashMap<>();
    public static List<Card> failed = new ArrayList<>();
    public static List<Card> passed = new ArrayList<>();

    public static void block(Card card) {
        card.Block(true);
    }

    public static void unblock(Card card) {
        card.Block(false);
    }

    public static Card RegistCard(Card card) {
        cards.put(card.getId(), card);
        int price = 0;
        if(card.pilg){
            price = card.getPrice()/2;
        }else {
            price = card.getPrice();
        }
        info(card.getId());


        System.out.println(card + " проданий за " + price);
        return card;
    }

    public static void CardInfo(int id) {
        if (cards.containsKey(id)) {
            Card card = cards.get(id);
            System.out.println("Card: " + card);
        } else {
            System.out.println("Нема картки з таким id " + id);
        }
    }

    public static void failedTravel(Card card) {
        failed.add(card);
    }

    public static void PassedTravel(Card card) {
        passed.add(card);
    }
}
