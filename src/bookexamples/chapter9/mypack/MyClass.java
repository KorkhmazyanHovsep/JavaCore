package bookexamples.chapter9.mypack;

public class MyClass implements InterfaceB {

    public void meth1() {
        System.out.println("Implement meth1() .");
    }

    public void meth2() {
        System.out.println("Implement meth2() .");
    }

    public void meth3() {
        System.out.println("Implement meth3() .");
    }
}

class ifExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
