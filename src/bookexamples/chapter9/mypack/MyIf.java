package bookexamples.chapter9.mypack;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber(){
        return 0;
    }

}

