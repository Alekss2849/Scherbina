import org.junit.Test;

import static org.junit.Assert.*;

public class NewArrTest {

    @Test
    public void newArray() {
        NewArr newarr = new NewArr();
        String[] inS = new String[]{"HelloWorld", "how", "are", "you"};
        String[] actual = newarr.NewArray(inS);
        String[] expected = new String[]{"are", "you"};
        assertArrayEquals(actual, expected);
    }
}