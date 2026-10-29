package bookexamples.chapter7;

public class ClassByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.math(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
