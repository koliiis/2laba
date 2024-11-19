import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ex13Test {

    @Test
    public void testArithmeticProgression() {
        boolean expected = true;
        boolean actual = ex13.isArithmeticProgression(new int[]{1, 3, 5, 7});
        assertEquals(expected, actual, "The array should form an arithmetic progression.");
    }

    @Test
    public void testAnotherArithmeticProgression() {
        boolean expected = true;
        boolean actual = ex13.isArithmeticProgression(new int[]{10, 20, 30, 40});
        assertEquals(expected, actual, "The array should form an arithmetic progression.");
    }

    @Test
    public void testNotAnArithmeticProgression1() {
        boolean expected = false;
        boolean actual = ex13.isArithmeticProgression(new int[]{1, 2, 4, 8});
        assertEquals(expected, actual, "The array should not form an arithmetic progression.");
    }

    @Test
    public void testNotAnArithmeticProgression2() {
        boolean expected = false;
        boolean actual = ex13.isArithmeticProgression(new int[]{1, 2, 3, 5});
        assertEquals(expected, actual, "The array should not form an arithmetic progression.");
    }

    @Test
    public void testSingleElement() {
        boolean expected = true;
        boolean actual = ex13.isArithmeticProgression(new int[]{2});
        assertEquals(expected, actual, "A single element array should be considered an arithmetic progression.");
    }

    @Test
    public void testEmptyArray() {
        boolean expected = true;
        boolean actual = ex13.isArithmeticProgression(new int[]{});
        assertEquals(expected, actual, "An empty array should be considered an arithmetic progression.");
    }
}
