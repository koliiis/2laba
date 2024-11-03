public class ArithmeticProgressionChecker {

    public static boolean isArithmeticProgression(int[] a) {
        if (a.length < 2) {
            return true; // An array with less than two elements is always considered a progression
        }

        int commonDifference = a[1] - a[0]; // Calculate the common difference of the progression

        for (int i = 2; i < a.length; i++) {
            if (a[i] - a[i - 1] != commonDifference) {
                return false; // If the difference does not match, return false
            }
        }

        return true; // If all elements match the progression
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8}; // Example array
        if (isArithmeticProgression(array)) {
            System.out.println("The array forms an arithmetic progression.");
        } else {
            System.out.println("The array does not form an arithmetic progression.");
        }
    }
}