public class Task3 {
    public static void main(String args[]) {
        // TAsk 3: Create a named loop
        int i = 0;
        outerloop: for (i = 0; i < 10; i++) {
            // Code to be executed
            System.out.println(i);
            // Check if i is equal to 5
            if (i == 5) {
                // Break the loop
                break outerloop;
            }
        }
    }
}
