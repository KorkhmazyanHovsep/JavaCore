package homeworks.bracechecker;

public class CharStack {
    private char[] array;
    private int top;

    public CharStack() {
        array = new char[10];
        top = -1;
    }

    public void push(char item) {
        if (top == array.length - 1) {
            extend();
        }
        array[++top] = item;
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void extend() {
        char[] newArray = new char[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
    }
}
