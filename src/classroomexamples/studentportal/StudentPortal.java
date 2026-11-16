package classroomexamples.studentportal;

import classroomexamples.studentportal.model.Course;
import classroomexamples.studentportal.model.Student;
import classroomexamples.studentportal.storage.CourseStorage;
import classroomexamples.studentportal.storage.StudentStorage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentPortal implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static CourseStorage courseStorage = new CourseStorage();
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        boolean isRunning = true;

        while (isRunning) {
            Commands.printCommands();

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
                case ADD_COURSE:
                    addCourse();
                    break;
                case PRINT_ALL_COURSES:
                    courseStorage.print();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    public static void addCourse() throws ParseException {
        System.out.println("Input Course Name, Teacher Name, Price, StartDate(dd/MM/yyyy):");
        String courseDataStr = scanner.nextLine();
        String[] courseDataArr = courseDataStr.split(",");

        if (courseDataArr.length < 4) {
            System.out.println("Invalid input format. Please provide all 4 fields separated by commas.");
            return;
        }

        Course course = new Course();
        course.setName(courseDataArr[0].trim());
        course.setTeacherName(courseDataArr[1].trim());
        course.setPrice(Double.parseDouble(courseDataArr[2].trim()));
        course.setStartDate(sdf.parse(courseDataArr[3].trim()));

        courseStorage.add(course);
        System.out.println("Course Added.");
    }

    public static void searchStudentByCourse() {
        System.out.println("Choose Course from the list.");
        courseStorage.print();

        String courseName = scanner.nextLine().trim();
        Course course = courseStorage.getCourseByName(courseName);
        if (course == null) {
            System.out.println("Invalid Course Name");
            return;
        }
        studentStorage.searchByCourse(course);
    }

    public static void searchStudent() {
        System.out.println("Enter the name:");
        String name = scanner.nextLine().trim();
        studentStorage.search(name);
    }

    public static void addStudent() {
        System.out.println("Choose Course from the list.");
        courseStorage.print();

        String courseName = scanner.nextLine().trim();
        Course course = courseStorage.getCourseByName(courseName);
        if (course == null) {
            System.out.println("Invalid Course Name");
            return;
        }

        System.out.println("Enter the name, surname, phone:");
        String studentDataStr = scanner.nextLine();
        String[] studentDataArr = studentDataStr.split(",");

        if (studentDataArr.length < 3) {
            System.out.println("Invalid input format. Please enter name, surname, and phone separated by commas.");
            return;
        }

        Student student = new Student(
                studentDataArr[0].trim(),
                studentDataArr[1].trim(),
                studentDataArr[2].trim(),
                course
        );
        studentStorage.add(student);
        System.out.println("Added Successfully");
    }
}