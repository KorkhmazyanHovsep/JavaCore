package bookexamples.chapter7;

public class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ab.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.math(ob);


        System.out.println("ab.a and ob.b before call: " + ob.a + " " + ob.b);

    }
}
