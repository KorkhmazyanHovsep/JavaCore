package bookexamples.chapter9.mypack.p2;

import bookexamples.chapter9.mypack.p1.Protection; // 1. Import the class from p1

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection(); // 2. Use 'Protection' directly (remove 'p1.')
        System.out.println("other package constructor");

        //class or package only
        //System.out.println("n = " + p.n);

        //class only
        //System.out.println("n_pri = " + p.n_pri);

        //class, subclass or package only
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}