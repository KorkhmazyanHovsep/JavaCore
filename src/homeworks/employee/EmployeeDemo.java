package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            printMenu();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    System.out.println("Program Finished");
                    break;
                case "1":
                    addEmployee(scanner, storage);
                    break;

                case "2":
                    printEmployees(storage);
                    break;

                case "3":
                    searchByID(scanner, storage);
                    break;

                case "4":
                    searchByCompany(scanner, storage);
                    break;

                default:
                    System.out.println("Invalid Command");

            }
        }

    }

    public static void printMenu() {
        System.out.println("Input 0 for EXIT");
        System.out.println("Input 1 for ADD EMPLOYEE");
        System.out.println("Input 2 for PRINT ALL EMPLOYEE");
        System.out.println("Input 3 for SEARCH EMPLOYEE BY ID");
        System.out.println("Input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
        System.out.println("Input: ");
    }

    public static void addEmployee(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input employee name: ");
        String name = scanner.nextLine();

        System.out.println("Input employee surname: ");
        String surname = scanner.nextLine();

        System.out.println("Input employee ID: ");
        String employeeID = scanner.nextLine();

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
}
