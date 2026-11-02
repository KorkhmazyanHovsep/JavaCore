package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        //# Test 1 - Adding Elements to an array.
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);

        System.out.println("Contents of the array: ");
        da.print();
        System.out.println();


        //# Test 2 - Increasing the size of an array.
        DynamicArray da2 = new DynamicArray();
        for (int i = 0; i < 15; i++) {
            da2.add(i);
        }
        System.out.println("Printing 15 elements: ");
        da2.print();
        System.out.println();


        //# Task 3 - Double Magnification.
        DynamicArray da3 = new DynamicArray();
        for (int i = 0; i < 28; i++) {
            da3.add(i);
        }
        System.out.println("Array capacity increased multiple times without losing elements: ");
        da3.print();
        System.out.println();

        //# Test 4 - Get element by index.
        DynamicArray da4 = new DynamicArray();

        da4.add(100);
        da4.add(200);
        da4.add(300);

        System.out.println("Getting the first element of the array: " + da4.getByIndex(0));
        System.out.println("Getting the last element of the array: " + da4.getByIndex(2));
        System.out.println("Getting an element using a negative index: " + da4.getByIndex(-1));
        System.out.println("Getting an non-existent element: " + da4.getByIndex(5));

        DynamicArray emptyArray = new DynamicArray();
        System.out.println("Printing an empty array: " + emptyArray.getByIndex(0));


    }
}
