package homework;

import java.io.IOException;

public class CharArrayUtil {
    public static void main(String[] args) throws IOException {
        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        // #1 Printing all the characters.
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        // #2 Counting the number of characters.
        int count = 0;
        char first = chars[0];
        char last = chars[chars.length - 1];

        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("Characters count: " + count);
        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);

        // #3 Counting the occurrences of a given symbol.
        char c = 'a';
        int symbolCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                symbolCount++;
            }
        }
        if (symbolCount == 0) {
            System.out.println("0");
        } else {
            System.out.println("Character '" + c + "' count: " + symbolCount);
        }

        // #4 Counting the number of vowels.
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int vowelCount = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowelCount++;
                    break;
                }
            }
        }
        System.out.println("Vowels count: " + vowelCount);

        // #5 Counting the number of consonants.
        int consonantCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                boolean isVowel = false;
                for (int j = 0; j < vowels.length; j++) {
                    if (ch == vowels[j]) {
                        isVowel = true;
                        break;
                    }
                }
                if (!isVowel) {
                    consonantCount++;
                }
            }
        }
        System.out.println("Consonants count: " + consonantCount);

        // #6 Counting the number of spaces.
        int spaceCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Spaces count: " + spaceCount);

        // #7 Reversing the order of the symbols (using a separate copy per Requirement 8).
        char[] revChars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        for (int i = 0; i < revChars.length / 2; i++) {
            char temp = revChars[i];
            revChars[i] = revChars[revChars.length - 1 - i];
            revChars[revChars.length - 1 - i] = temp;
        }
        for (int i = 0; i < revChars.length; i++) {
            System.out.print(revChars[i]);
        }
        System.out.println();

        // #8 Changing capitalization to Uppercase and Lowercase separately.
        char[] upperChars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        for (int i = 0; i < upperChars.length; i++) {
            if (upperChars[i] >= 'a' && upperChars[i] <= 'z') {
                upperChars[i] = (char) (upperChars[i] - 32);
            }
        }
        System.out.print("Uppercase: ");
        for (int i = 0; i < upperChars.length; i++) {
            System.out.print(upperChars[i]);
        }

        char[] lowerChars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        for (int i = 0; i < lowerChars.length; i++) {
            if (lowerChars[i] >= 'A' && lowerChars[i] <= 'Z') {
                lowerChars[i] = (char) (lowerChars[i] + 32);
            }
        }
        System.out.print(" Lowercase: ");
        for (int i = 0; i < lowerChars.length; i++) {
            System.out.print(lowerChars[i]);
        }
        System.out.println();

        // #9 Replacing the given symbol.
        char[] replaceChars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        char oldChar = 'a';
        char newChar = '*';

        for (int i = 0; i < replaceChars.length; i++) {
            if (replaceChars[i] == oldChar) {
                replaceChars[i] = newChar;
            }
        }
        System.out.print("Replaced: ");
        for (int i = 0; i < replaceChars.length; i++) {
            System.out.print(replaceChars[i]);
        }
        System.out.println();

        // #10 Checking Palindrome.
        char[] palindromeChars = {'l', 'e', 'v', 'e', 'l'};
        boolean isPalindrome = true;
        for (int i = 0; i < palindromeChars.length / 2; i++) {
            if (palindromeChars[i] != palindromeChars[palindromeChars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPalindrome);

        // Bonus Tasks
        // #1 Finding the index of the first occurrence of a symbol.
        char[] bonus1Chars = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int firstIndex = -1;
        for (int i = 0; i < bonus1Chars.length; i++) {
            if (bonus1Chars[i] == target) {
                firstIndex = i;
                break;
            }
        }
        System.out.println("First index: " + firstIndex);

        // #2 Comparing two char arrays.
        char[] firstArr = {'J', 'a', 'v', 'a'};
        char[] secondArr = {'J', 'a', 'v', 'a'};
        boolean areEqual = true;

        if (firstArr.length != secondArr.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstArr.length; i++) {
                if (firstArr[i] != secondArr[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("Arrays are equal: " + areEqual);

        // #3 Removing duplicate symbols.
        char[] bonus3Chars = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};
        System.out.print("Unique characters: ");
        for (int i = 0; i < bonus3Chars.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (bonus3Chars[i] == bonus3Chars[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(bonus3Chars[i] + " ");
            }
        }
        System.out.println();
    }
}