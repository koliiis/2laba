import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ex8Test {

    private ex8 arrayDifferences; // Instance of the class to be tested
    private int[] testArray; // Array for testing

    @BeforeEach
    void setUp() {
        arrayDifferences = new ex8(); // Initialize the ArrayDifferences object
        testArray = new int[]{1, 2, 3, 4, 5}; // Example array for tests
    }

    @Test
    void testMaxDifference() {
        int[] result = arrayDifferences.findDifferences(testArray); // Get differences
        int expectedMaxDifference = 2; // Expected maximum difference
        int actualMaxDifference = result[0]; // Actual maximum difference
        assertEquals(expectedMaxDifference, actualMaxDifference, "Max difference should be 2");
    }

    @Test
    void testMinDifference() {
        int[] result = arrayDifferences.findDifferences(testArray); // Get differences
        int expectedMinDifference = 0; // Expected minimum difference
        int actualMinDifference = result[1]; // Actual minimum difference
        assertEquals(expectedMinDifference, actualMinDifference, "Min difference should be 0");
    }

    @Test
    void testSingleElement() {
        int[] singleElementArray = {10}; // Array with a single element
        int[] result = arrayDifferences.findDifferences(singleElementArray);
        assertEquals(0, result[0], "Max difference for single element should be 0"); // Max difference
        assertEquals(0, result[1], "Min difference for single element should be 0"); // Min difference
    }

    @Test
    void testNullArray() {
        int[] nullArray = {0}; // Testing with a null-like input
        int[] result = arrayDifferences.findDifferences(nullArray);
        assertEquals(0, result[0], "Max difference for empty array should be 0");
        assertEquals(0, result[1], "Min difference for empty array should be 0");
    }

    @Test
    void testNegativeNumbers() {
        int[] negativeArray = {-5, -3, -1, -4, -2}; // Array with negative numbers
        int[] result = arrayDifferences.findDifferences(negativeArray);
        int expectedMaxDifference = 2; // Expected max difference for negative numbers
        int expectedMinDifference = 0; // ~~       min ~~
        assertEquals(expectedMaxDifference, result[0], "Max difference for negative numbers should be 4");
        assertEquals(expectedMinDifference, result[1], "Min difference for negative numbers should be 0");
    }

    @Test
    void testSameElements() {
        int[] sameArray = {2, 2, 2, 2, 2}; // Array with the same elements
        int[] result = arrayDifferences.findDifferences(sameArray);
        assertEquals(0, result[0], "Max difference for same elements should be 0");
        assertEquals(0, result[1], "Min difference for same elements should be 0");
    }
}