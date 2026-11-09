package homeworks.bracechecker;

import javax.swing.*;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String[] testCases = {
                "Hello from [Java]",
                "{Hello (Java)}",
                "{[()]}",
                "Hello Java",
                "Hello from [Java)",
                "{[(])}",
                "Hello from Java]",
                "{Hello Java",
                "((()))",
                "(()"
        };

        for (String test : testCases) {
            System.out.println("Testing text: \"" + test + "\"");
            BraceChecker bc = new BraceChecker(test);
            bc.check();
            System.out.println("--------------------------------");
        }
    }
}
