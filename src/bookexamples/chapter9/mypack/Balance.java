package bookexamples.chapter9.mypack;

public class Balance {
    String name;
    double bal;

    Balance(String n , double d){
        name =n;
        bal = d;
    }

    void show(){
        if (bal<0){
            System.out.println("--> ");
            System.out.println(name = ": $" + bal);
        }
    }
}
