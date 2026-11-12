package bookexamples.chapter9.mypack.p2;

import bookexamples.chapter9.mypack.p1.Protection; // 1. Import the class from p1

public class Protection2 extends Protection {
    public Protection2() {
        System.out.println("protection2 subclass constructor");

        // A subclass in a different package can access:
        // System.out.println("n = " + n);       // Error: default (package-private) not accessible
        // System.out.println("n_pri = " + n_pri); // Error: private not accessible

        System.out.println("n_pro = " + n_pro);    // Accessible because Protection2 is a subclass
        System.out.println("n_pub = " + n_pub);    // Accessible because it's public
    }
}