import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    @Test
    public void sleepIn() {
        Boolean ans1 = CodingBat.sleepIn(false, false);
        Boolean ans2 = CodingBat.sleepIn(true, false);
        Boolean ans3 = CodingBat.sleepIn(false, true);
        Boolean ans4 = CodingBat.sleepIn(true, true);

        assertEquals(ans1, true);
        assertEquals(ans2, false);
        assertEquals(ans3, true);
        assertEquals(ans4, true);
    }

    @Test
    public void endUp() {
        String ans1 = CodingBat.endUp("Hello World!");
        String ans2 = CodingBat.endUp("Jello");
        String ans3 = CodingBat.endUp("Hello");

        assertEquals(ans1, "Hello WorLD!");
        assertEquals(ans2, "JeLLO");
        assertEquals(ans3, "HeLLO");
    }

    @Test
    public void countEvens() {
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {10, 20, 30, 40};
        int[] nums3 = {15, 16, 17, 18, 19, 20};

        assertEquals(CodingBat.countEvens(nums1), 5);
        assertEquals(CodingBat.countEvens(nums2), 4);
        assertEquals(CodingBat.countEvens(nums3), 3);
    }

    @Test
    public void makeAbba() {
        String ans1 = CodingBat.makeAbba("AAA", "BBB");
        String ans2 = CodingBat.makeAbba("Jello", "123");
        String ans3 = CodingBat.makeAbba("Hello", "World");

        assertEquals(ans1, "AAABBBBBBAAA");
        assertEquals(ans2, "Jello123123Jello");
        assertEquals(ans3, "HelloWorldWorldHello");
    }
}