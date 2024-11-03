public class IntervalDistribution {

    public static void displayIntervalDistribution(int[] a, int[] b) {
        // Count the number of elements outside the intervals
        int outsideCount = 0;
        int[] intervalCounts = new int[b.length];

        // Iterate through each element in array a
        for (int value : a) {
            boolean inInterval = false;

            // Check which interval the value belongs to
            for (int i = 0; i < b.length; i++) {
                if (i == 0) {
                    // Check if value is less than the first upper bound
                    if (value <= b[i] && value > 0) {
                        intervalCounts[i]++;
                        inInterval = true;
                        break;
                    }
                } else {
                    // Check if value is within the current interval
                    if (value > b[i - 1] && value <= b[i]) {
                        intervalCounts[i]++;
                        inInterval = true;
                        break;
                    }
                }
            }

            // If the value is not in any interval, increment outside count
            if (!inInterval) {
                outsideCount++;
            }
        }

        // Display the counts for each interval
        for (int i = 0; i < intervalCounts.length; i++) {
            if (i == 0) {
                System.out.println("Interval 0 - " + b[i] + ": " + intervalCounts[i]);
            } else {
                System.out.println("Interval " + b[i - 1] + " - " + b[i] + ": " + intervalCounts[i]);
            }
        }

        // Display the count of values outside the intervals
        System.out.println("Outside intervals: " + outsideCount);
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 15, 20}; // Example values
        int[] b = {0, 10, 20}; // Interval boundaries
        displayIntervalDistribution(a, b);
    }
}
