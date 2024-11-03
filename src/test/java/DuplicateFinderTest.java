import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DuplicateFinderTest {

    // Test case for an array with duplicates
    @Test
    public void testFindDuplicatesWithDuplicates() {
        int[] inputArray = {1, 2, 3, 2, 1, 4};
        String expected = "Value: 1, Indices: 0, 4\nValue: 2, Indices: 1, 3\n";
        String actual = DuplicateFinder.findDuplicates(inputArray);
        assertEquals(expected, actual);
    }

    // Test case for an array without duplicates
    @Test
    public void testFindDuplicatesWithoutDuplicates() {
        int[] inputArray = {1, 2, 3, 4, 5};
        String expected = "No duplicates found.";
        String actual = DuplicateFinder.findDuplicates(inputArray);
        assertEquals(expected, actual);
    }

    // Test case for an empty array
    @Test
    public void testFindDuplicatesEmptyArray() {
        int[] inputArray = {};
        String expected = "No duplicates found.";
        String actual = DuplicateFinder.findDuplicates(inputArray);
        assertEquals(expected, actual);
    }

    // Test case for an array with all elements the same
    @Test
    public void testFindDuplicatesAllSame() {
        int[] inputArray = {2, 2, 2, 2};
        String expected = "Value: 2, Indices: 0, 1\nValue: 2, Indices: 0, 2\nValue: 2, Indices: 0, 3\nValue: 2, Indices: 1, 2\nValue: 2, Indices: 1, 3\nValue: 2, Indices: 2, 3\n";
        String actual = DuplicateFinder.findDuplicates(inputArray);
        assertEquals(expected, actual);
    }
}