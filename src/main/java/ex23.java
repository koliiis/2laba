public class ex23 {

    // Method to find indices and values of equal elements in an array
    public static String findDuplicates(int[] array) {
        StringBuilder result = new StringBuilder();
        boolean foundDuplicates = false;

        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            // Check for duplicates of the current element
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    // If a duplicate is found, append the index and value to the result
                    result.append("Value: ").append(array[i]).append(", Indices: ").append(i).append(", ").append(j).append("\n");
                    foundDuplicates = true;
                }
            }
        }

        // If no duplicates found, return a message indicating that
        return foundDuplicates ? result.toString() : "No duplicates found.";
    }

    public static void main(String[] args) {
        // Initialize an array with some values
        int[] inputArray = {1, 2, 3, 2, 1, 4};

        // Call the method to find duplicates and print the result
        String duplicates = findDuplicates(inputArray);
        System.out.println(duplicates);
    }
}
