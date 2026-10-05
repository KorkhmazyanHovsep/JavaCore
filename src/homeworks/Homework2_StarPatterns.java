package homeworks;

public class Homework2_StarPatterns {
    public static void main(String[] args) {
        int rows = 5;

        //#1: Left-Aligned Triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        //#2: Inverted Left-Aligned Triangle

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //#3: Right-Aligned Triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        //#4: Inverted Right-Aligned Triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= rows - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        //#5: Diamond Pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }

            System.out.println();

        }

        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }

}
