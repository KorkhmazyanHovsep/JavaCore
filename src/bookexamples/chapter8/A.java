
package bookexamples.chapter8;

import java.sql.SQLOutput;

abstract class A {
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

    void callme() {
        System.out.println("AInside A's callme method");
    }

    void collmetoo() {
        System.out.println("This is a concrete method.");
    }

    final void meth() {
        System.out.println("This is a final method.");
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

    //void meth(){ Error! Can't override.
    //    System.out.println("Illegal");
    //}

    void show() {
        super.show();
        System.out.println("k: " + k);
    }


    void callme() {
        System.out.println("Inside B's callme method.");
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

    void callme() {
        System.out.println("Inside C's callme method.");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
