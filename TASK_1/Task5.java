import java.util.Arrays;

public class Task5 {
    public static void main(String args[]) {
        // Task 5: Find a non-unique duplicate in an array of integers
        int[] array = { 1, 2, 3, 4, 5, 2, 3 };
        Arrays.sort(array);
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Non-Unique Duplicate: " + array[i + 1]);
            }
        }
    }
}
