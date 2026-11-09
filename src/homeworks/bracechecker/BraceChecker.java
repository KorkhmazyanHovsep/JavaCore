package homeworks.bracechecker;

public class BraceChecker {
    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        if (text == null || text.isEmpty()) {
            System.out.println("No Errors.");
            return;
        }

        CharStack stack = new CharStack();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed " + ch + " at index " + i + " but stack is empty.");
                    return;
                }

                char lastOpen = stack.pop();

                if (ch == '}' && lastOpen != '{') {
                    System.out.println("Error: opened " + lastOpen + " but closed " + ch + " at " + i);
                    return;
                } else if (ch == ']' && lastOpen != '[') {
                    System.out.println("Error: opened " + lastOpen + "but closed " + ch + " at " + i);
                    return;
                } else if (ch == ')' && lastOpen != '(') {
                    System.out.println("Error: opened " + lastOpen + " but closed " + ch + " at " + i);
                    return;
                }

            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: unclosed opening parenthesis remaining in stack.");
        } else {
            System.out.println("Correct");
        }

    }
}
