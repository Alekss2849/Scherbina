import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSystemWorking
{
    @Test
    void TestSystemWorking() {
        Turnstile turnstile = new Turnstile();
        CommonCard commonCard = new CommonCard(39);
        DurationCard durationCard = new DurationCard(true, Days.ONEDAY);
        MultiTravelCard multiTravelCard = new MultiTravelCard(true, Multitravels.TEN);

        Card card1 = SystemControl.RegistCard(commonCard);
        Card card2 = SystemControl.RegistCard(durationCard);
        Card card3 = SystemControl.RegistCard(multiTravelCard);

        turnstile.MakePass(card1);
        turnstile.MakePass(card1);
        turnstile.MakePass(card1);
        turnstile.MakePass(card1);
        turnstile.MakePass(card1);
        turnstile.MakePass(card2);
        turnstile.MakePass(card3);

        Assert.assertEquals(6, SystemControl.passed.size());
        Assert.assertNotEquals(7, SystemControl.passed.size());

        Assert.assertEquals(1,SystemControl.failed.size());
        Assert.assertNotEquals(0,SystemControl.failed.size());
    }
}

