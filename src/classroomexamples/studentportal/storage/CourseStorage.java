package classroomexamples.studentportal.storage;

import classroomexamples.studentportal.model.Course;
import classroomexamples.studentportal.model.Student;

public class CourseStorage {
    private Course[] array = new Course[10];
    private int size = 0;

    public void add(Course... courses) {
        for (Course course : courses) {
            add(course);
        }

    }

    public void add(Course course) {
        if (size == array.length) {
            extend();
        }
        array[size++] = course;
    }


    private void extend() {
        Course[] temp = new Course[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public Course getCourseByName(String courseName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equalsIgnoreCase(courseName)) {
                return array[i];
            }
        }
        return null;
    }


}

