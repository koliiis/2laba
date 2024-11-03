import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IntervalDistributionTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream(); // To capture output
    private int[] testArray; // Array for testing
    private int[] intervalBounds; // Interval boundaries for testing

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor)); // Redirecting output stream
        testArray = new int[]{1, 5, 7, 9, 15, 20}; // Example values for tests
        intervalBounds = new int[]{0, 10, 20}; // Interval boundaries
    }

    @Test
    void testDisplayIntervalDistribution() {
        IntervalDistribution.displayIntervalDistribution(testArray, intervalBounds); // Call the method to test

        String output = outputStreamCaptor.toString(); // Capturing the output
        assertTrue(output.contains("Interval 0 - 10: 4"), "Should count 4 values in interval [0, 10)");
        assertTrue(output.contains("Interval 10 - 20: 2"), "Should count 2 values in interval [10, 20)");
        assertTrue(output.contains("Outside intervals: 0"), "Should have 0 values outside the intervals");
    }

    @Test
    void testAllOutsideIntervals() {
        int[] allOutsideArray = {25, 30, 35}; // All values outside defined intervals
        IntervalDistribution.displayIntervalDistribution(allOutsideArray, intervalBounds); // Call the method to test

        String output = outputStreamCaptor.toString(); // Capturing the output
        assertTrue(output.contains("Outside intervals: 3"), "Should have 3 values outside the intervals");
    }

    @Test
    void testSingleElementInInterval() {
        int[] singleInArray = {5}; // Single element within the interval
        IntervalDistribution.displayIntervalDistribution(singleInArray, intervalBounds); // Call the method to test

        String output = outputStreamCaptor.toString(); // Capturing the output
        assertTrue(output.contains("Interval 0 - 10: 1"), "Should count 1 value in interval [0, 10)");
        assertTrue(output.contains("Outside intervals: 0"), "Should have 0 values outside the intervals");
    }

    @Test
    void testSingleElementOutsideInterval() {
        int[] singleOutArray = {25}; // Single element outside the defined intervals
        IntervalDistribution.displayIntervalDistribution(singleOutArray, intervalBounds); // Call the method to test

        String output = outputStreamCaptor.toString(); // Capturing the output
        assertTrue(output.contains("Outside intervals: 1"), "Should have 1 value outside the intervals");
    }

    @Test
    void testEmptyArray() {
        int[] emptyArray = {}; // Testing with an empty array
        IntervalDistribution.displayIntervalDistribution(emptyArray, intervalBounds); // Call the method to test

        String output = outputStreamCaptor.toString(); // Capturing the output
        assertTrue(output.contains("Outside intervals: 0"), "Should have 0 values outside the intervals");
    }

    @Test
    void testNegativeNumbers() {
        int[] negativeArray = {-5, -3, -1}; // Array with negative numbers
        IntervalDistribution.displayIntervalDistribution(negativeArray, intervalBounds); // Call the method to test

        String output = outputStreamCaptor.toString(); // Capturing the output
        assertTrue(output.contains("Outside intervals: 3"), "Should have 3 values outside the intervals");
    }
}
