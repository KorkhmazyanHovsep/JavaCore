package classroomexamples.studentportal;

import java.util.Scanner;

public class StudentPortal {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRunning = false;
                    break;
                case "1":
                    addStudent();
                    break;
                case "2":
                    studentStorage.print();
                    break;
                case "3":
                    searchStudent();
                    break;
                case "4":
                    searchStudentByCourse();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    private static void printCommands() {
        System.out.println("Enter 0 to EXIT");
        System.out.println("Enter 1 to ADD a Student");
        System.out.println("Enter 2 to PRINT all Students");
        System.out.println("Enter 3 to SEARCH a Student");
        System.out.println("Enter 4 to SEARCH by Course");
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
