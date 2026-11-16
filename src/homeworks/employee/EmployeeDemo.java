package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_EMPLOYEES = "2";
    private static final String SEARCH_BY_ID = "3";
    private static final String SEARCH_BY_COMPANY = "4";
    private static final String SEARCH_BY_MIN_SALARY = "5";
    private static final String DELETE_BY_ID = "6";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            printMenu();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    System.out.println("Program Finished");
                    break;

                case ADD_EMPLOYEE:
                    addEmployee(scanner, storage);
                    break;

                case PRINT_EMPLOYEES:
                    printEmployees(storage);
                    break;

                case SEARCH_BY_ID:
                    searchByID(scanner, storage);
                    break;

                case SEARCH_BY_COMPANY:
                    searchByCompany(scanner, storage);
                    break;
                case SEARCH_BY_MIN_SALARY:
                    searchByMinSalary(scanner, storage);
                    break;
                case DELETE_BY_ID:
                    deleteByID(scanner, storage);
                    break;
                default:
                    System.out.println("Invalid Command");

            }
        }

    }

    public static void printMenu() {
        System.out.println("Input " + EXIT + " for EXIT");
        System.out.println("Input " + ADD_EMPLOYEE + " for ADD EMPLOYEE");
        System.out.println("Input " + PRINT_EMPLOYEES + " for PRINT ALL EMPLOYEE");
        System.out.println("Input " + SEARCH_BY_ID + " for SEARCH EMPLOYEE BY ID");
        System.out.println("Input " + SEARCH_BY_COMPANY + " for SEARCH EMPLOYEE BY COMPANY NAME");
        System.out.println("Input " + SEARCH_BY_MIN_SALARY + " for SEARCH EMPLOYEES BY MINIMUM SALARY");
        System.out.println("Input " + DELETE_BY_ID + " for DELETE EMPLOYEE BY ID");
        System.out.println("Input: ");
    }

    public static void addEmployee(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input employee name: ");
        String name = scanner.nextLine();

        System.out.println("Input employee surname: ");
        String surname = scanner.nextLine();

        System.out.println("Input employee ID: ");
        String employeeID = scanner.nextLine();
        if (storage.searchID(employeeID) != null) {
            System.out.println("Employee with ID " + employeeID + " already exists.");
            return;
        }

        System.out.println("Input employee salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Input employee company: ");
        String company = scanner.nextLine();

        System.out.println("Input employee position: ");
        String position = scanner.nextLine();

        Employee employee = new Employee(name, surname, employeeID, salary, company, position);
        storage.add(employee);
        System.out.println("Employee successfully added.");

    }

    public static void printEmployees(EmployeeStorage storage) {
        storage.print();
    }

    public static void searchByID(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input employee ID");
        String searchID = scanner.nextLine();

        Employee foundEmployee = storage.searchID(searchID);
        if (foundEmployee != null) {
            System.out.println("Employee found: " + foundEmployee);
        } else {
            System.out.println("Employee with ID: " + searchID + " not found.");
        }
    }

    public static void searchByCompany(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input company name: ");
        String searchCompany = scanner.nextLine();
        storage.searchByCompany(searchCompany);

    }

    public static void deleteByID(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input employee ID to delete.");
        String deleteID = scanner.nextLine();
        storage.deleteByID(deleteID);
    }

    public static void searchByMinSalary(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input minimum salary. ");
        double minSalary = Double.parseDouble(scanner.nextLine());
        storage.searchByMinSalary(minSalary);
    }
}
