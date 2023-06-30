import java.util.HashSet;

public class Task4 {
    public static void main(String args[]) {
        // Task 4: Find a single duplicate in an array of integers

        int[] nums = { 1, 2, 3, 4, 5, 2 };
        int duplicate = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
                break;
            } else {
                set.add(num);
            }
        }
        System.out.println("single duplicate in an array of integers: " + duplicate);
    }
}