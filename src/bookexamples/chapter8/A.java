
package bookexamples.chapter8;

public class A {
    int i, j;

    A() {
    }

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    B() {
    }

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
