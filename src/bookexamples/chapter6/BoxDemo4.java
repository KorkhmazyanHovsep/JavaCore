package bookexamples.chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volumeD();
        System.out.println("Volume is " + vol);

        vol = myBox2.volumeD();
        System.out.println("Volume is " + vol);
    }
}
