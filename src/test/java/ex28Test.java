import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ex28Test {

    // Test case for normal functionality
    @Test
    public void testTransformArrays() {
        int[] a = {1, 5, 10};
        int[] c = {0, 3, 12};
        int[] expected = {1, 5, 10}; // Expected output based on the rules
        int[] actual = ex28.transformArrays(a, c);
        assertArrayEquals(expected, actual);
    }

    // Test case where all elements in c are below amin
    @Test
    public void testTransformArraysAllBelowAmin() {
        int[] a = {2, 4, 6};
        int[] c = {1, 0, -1};
        int[] expected = {2, 2, 2}; // All should be set to amin (2)
        int[] actual = ex28.transformArrays(a, c);
        assertArrayEquals(expected, actual);
    }

    // Test case where all elements in c are above amax
    @Test
    public void testTransformArraysAllAboveAmax() {
        int[] a = {3, 6, 9};
        int[] c = {10, 12, 15};
        int[] expected = {9, 9, 9}; // All should be set to amax (9)
        int[] actual = ex28.transformArrays(a, c);
        assertArrayEquals(expected, actual);
    }

    // Test case where elements in c are between amin and amax
    @Test
    public void testTransformArraysInRange() {
        int[] a = {5, 10, 15};
        int[] c = {8, 12, 10};
        int[] expected = {5, 10, 15}; // bi should equal ai for elements within the range
        int[] actual = ex28.transformArrays(a, c);
        assertArrayEquals(expected, actual);
    }
}