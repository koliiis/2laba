public class ex28 {

    // Method to create array b based on arrays c and a
    public static int[] transformArrays(int[] a, int[] c) {
        // Calculate amin and amax from array a
        int amin = Integer.MAX_VALUE;  // Initialize to maximum possible value
        int amax = Integer.MIN_VALUE;  // Initialize to minimum possible value

        // Find amin and amax
        for (int value : a) {
            if (value < amin) {
                amin = value; // Update amin if a smaller value is found
            }
            if (value > amax) {
                amax = value; // Update amax if a larger value is found
            }
        }

        // Create array b with the same length as array c
        int[] b = new int[c.length];

        // Fill array b based on the conditions provided
        for (int i = 0; i < c.length; i++) {
            if (c[i] < amin) {
                b[i] = amin; // Set bi to amin if ci ≤ amin
            } else if (c[i] > amax) {
                b[i] = amax; // Set bi to amax if ci ≥ amax
            } else {
                b[i] = a[i]; // Set bi to ai if amin < ci < amax
            }
        }

        return b; // Return the transformed array b
    }

    public static void main(String[] args) {
        // Example arrays for testing
        int[] a = {10, 16, 5};
        int[] c = {0, 31, 7};

        // Transform arrays and print the result
        int[] b = transformArrays(a, c);
        for (int value : b) {
            System.out.print(value + " ");
        }
    }
}
