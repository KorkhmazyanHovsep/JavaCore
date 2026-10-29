package bookexamples.chapter7;

public class Test {
    int a;
    public int b;
    public int c;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test(int i) {
        a = i;
    }

    Test() {

    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    void math(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void math(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}
