package homeworks;

import java.io.IOException;

public class ArrayHomework {
    public static void main(String[] args) throws IOException {
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};


        //#1 Counting the occurrences of the given number.
        System.out.println("Enter a number.");
        int n = (int) System.in.read() - '0';
        int count = 0;
        for (int x : numbers) {
            if (x == n) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(count);
        } else {
            System.out.println("Count of " + n + " is " + count);
        }
        System.out.println();

        //#2 Reversing the elements of the array.
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        //#3 Counting the number of repeating numbers.
        int repeatedCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int occurrences = 0;
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == numbers[i]) {
                        occurrences++;
                    }
                }
                if (occurrences > 1) {
                    repeatedCount++;
                }
            }
        }
        System.out.println("Repeated numbers count: " + repeatedCount);
        System.out.println();

        //#4 Counting the number of vowels.
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int vowelCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'ա' || c == 'ե' || c == 'է' || c == 'ը' || c == 'ի' || c == 'ո' || c == 'օ') {
                vowelCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println();

        //# Bonus Tasks
        //#1 Finding the second-largest number.
        int max = numbers[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        System.out.println("Second Maximum: " + secondMax);
        System.out.println();

        //#2 Removing duplicates from the array.
        for (int i = 0; i < numbers.length; i++) {
            boolean isFirst = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isFirst = false;
                    break;
                }
            }
            if (isFirst) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        //#3 Finding the most recurring number.
        int mostFrequent = numbers[0];
        int maxFreq = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentFreq = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    currentFreq++;
                }
            }
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                mostFrequent = numbers[i];
            }
        }
        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Count: " + maxFreq);

    }
}