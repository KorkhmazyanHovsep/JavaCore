package bookexamples.chapter10;

public class ExceptionDemo {
    static void comupte(int a) throws MyException {
        System.out.println("Called compute(" + a + ") ");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try {
            comupte(1);
            comupte(20);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
    }

}
