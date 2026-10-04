package homeworks;

public class Homework1 {
    public static void main(String[] args) {
        // Checking which of the two integers is greater.
        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("x is greater than y.");
        }

        if (y > x) {
            System.out.println("y is greater than x");
        }
        System.out.println();

        //Printing the first 5 natural numbers.
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i <= 4; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();

        //Calculating the sum of two integer variables.
        int a = 5;
        int b = 7;
        int result = a + b;
        System.out.println(result);
        System.out.println();

        // Printing the multiplication table of the given number.
        int n = 3;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));

        }
    }
}
