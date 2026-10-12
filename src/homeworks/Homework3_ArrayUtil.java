package homeworks;

public class Homework3_ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        //#1 Printing all elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //#2 Printing the first element of the array.
        System.out.println("First element: " + numbers[0]);

        //#3 Printing the last element of the array.
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        //#4 Printing the length of the array.
        System.out.println("Array length: " + numbers.length);

        //#5 Finding minimum number of the array.
        int minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        System.out.println("Minimum number: " + minNum);

        //#6 Finding the middle elements of the array.
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 == 0) {
            System.out.println("Middle elements: " + numbers[(numbers.length / 2) - 1] + " " + numbers[numbers.length / 2]);
        } else {
            System.out.println("Middle element: " + numbers[numbers.length / 2]);
        }

        //#7 Finding the count of even numbers in the array.

        int evenNumCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumCount++;
            }
        }
        System.out.println("Even numbers count: " + evenNumCount);

        //#8 Finding the count of odd numbers of the array.

        int oddNumCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumCount++;
            }
        }
        System.out.println("Odd numbers count: " + oddNumCount);

        //#9 Printing the sum of all elements of the array.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        //#10 Finding the average of the array.
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Average: " + average);


        //Bonus Tasks

        //#1 Finding the maximum number of the array.

        int maxNum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }

        }
        System.out.println("Maximum number: " + maxNum);

        //#2 Counting positive, negative, and zero numbers.

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;

            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);


        //#3 Print the array in reverse order.

        System.out.println("Reversed order: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }


    }


}