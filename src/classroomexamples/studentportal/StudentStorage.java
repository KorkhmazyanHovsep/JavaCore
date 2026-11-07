package classroomexamples.studentportal;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;

    public void add(Student s) {
        if (size == array.length) {
            extend();
        }
        array[size++] = s;
    }


    private void extend() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public Student getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword) || array[i].getSurname().contains(keyword)) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public void searchByCourse(String course) {
        for (int i = 0; i < size; i++) {
            if (array[i].getCourse().equalsIgnoreCase(course)) {
                System.out.println(array[i] + " ");
            }
        }
    }
}








