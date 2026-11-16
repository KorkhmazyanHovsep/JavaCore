package classroomexamples.studentportal;

public interface Commands {
    String EXIT = "0";
    String ADD_STUDENT = "1";
    String PRINT_ALL_STUDENTS = "2";
    String SEARCH_STUDENT = "3";
    String SEARCH_STUDENT_BY_COURSE = "4";
    String ADD_COURSE = "5";
    String PRINT_ALL_COURSES = "6";

    static void printCommands() {
        System.out.println("Enter" + EXIT + "to EXIT");
        System.out.println("Enter" + ADD_STUDENT + "to ADD a Student");
        System.out.println("Enter" + PRINT_ALL_STUDENTS + "to PRINT all Students");
        System.out.println("Enter" + SEARCH_STUDENT + "to SEARCH a Student");
        System.out.println("Enter" + SEARCH_STUDENT_BY_COURSE + "to SEARCH BY Course");
        System.out.println("Enter" + ADD_COURSE + "to ADD a Course");
        System.out.println("Enter" + PRINT_ALL_COURSES + "to PRINT ALL Courses");
    }

}
