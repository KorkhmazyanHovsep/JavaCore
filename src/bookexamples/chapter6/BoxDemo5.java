package bookexamples.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.volumeD();
        System.out.println("Volume is " + vol);

        vol = myBox2.volumeD();
        System.out.println("Volume is " + vol);

    }
}
