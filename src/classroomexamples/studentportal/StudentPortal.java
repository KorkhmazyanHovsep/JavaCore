package classroomexamples.studentportal;

import java.util.Scanner;

public class StudentPortal {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_STUDENT = "1";
    private static final String PRINT_ALL_STUDENTS = "2";
    private static final String SEARCH_STUDENT = "3";
    private static final String SEARCH_STUDENT_BY_COURSE = "4";

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRunning = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case SEARCH_STUDENT:
                    searchStudent();
                    break;
                case SEARCH_STUDENT_BY_COURSE:
                    searchStudentByCourse();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    private static void printCommands() {
        System.out.println("Enter" + EXIT + "to EXIT");
        System.out.println("Enter" + ADD_STUDENT + "to ADD a Student");
        System.out.println("Enter" + PRINT_ALL_STUDENTS + "to PRINT all Students");
        System.out.println("Enter" + SEARCH_STUDENT + "to SEARCH a Student");
        System.out.println("Enter" + SEARCH_STUDENT_BY_COURSE + "to SEARCH BY Course");
    }

    public static void searchStudentByCourse() {
        System.out.println("Input the Course");
        String course = scanner.nextLine();
        studentStorage.searchByCourse(course);
    }

    public static void searchStudent() {
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        studentStorage.search(name);
    }

    public static void addStudent() {
        System.out.println("Enter the name,surname,phone and the course");
        String studentDataStr = scanner.nextLine();
        String[] studentDataArr = studentDataStr.split(",");

        Student student = new Student(studentDataArr[0], studentDataArr[1], studentDataArr[2], studentDataArr[3]);
        studentStorage.add(student);
        System.out.println("Added Successfully");
    }
}
