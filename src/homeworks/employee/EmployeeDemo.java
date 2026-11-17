package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo implements Commands {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        CompanyStorage companyStorage = new CompanyStorage();
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
                    addEmployee(scanner, employeeStorage, companyStorage);
                    break;

                case PRINT_EMPLOYEES:
                    printEmployees(employeeStorage);
                    break;

                case SEARCH_BY_ID:
                    searchByID(scanner, employeeStorage);
                    break;

                case SEARCH_BY_COMPANY:
                    searchByCompany(scanner, employeeStorage);
                    break;

                case SEARCH_BY_MIN_SALARY:
                    searchByMinSalary(scanner, employeeStorage);
                    break;

                case DELETE_BY_ID:
                    deleteByID(scanner, employeeStorage);
                    break;

                case ADD_COMPANY:
                    addCompany(scanner, companyStorage);
                    break;

                case PRINT_COMPANIES:
                    printCompanies(companyStorage);
                    break;

                case SEARCH_COMPANY_BY_ID:
                    searchCompanyByID(scanner, companyStorage);
                    break;

                case PRINT_EMPLOYEES_BY_COMPANY_ID:
                    printEmployeesByCompanyID(scanner, employeeStorage, companyStorage);
                    break;

                case CHANGE_EMPLOYEE_COMPANY:
                    changeEmployeeCompany(scanner, employeeStorage, companyStorage);
                    break;

                case PRINT_EMPLOYEE_COMPANY:
                    printEmployeeCompany(scanner, employeeStorage);
                    break;

                case COUNT_EMPLOYEES_BY_COMPANY:
                    countEmployeesByCompany(scanner, employeeStorage, companyStorage);
                    break;

                case TOTAL_SALARY_BY_COMPANY:
                    totalSalaryByCompany(scanner, employeeStorage, companyStorage);
                    break;

                case HIGHEST_PAID_EMPLOYEE:
                    highestPaidEmployee(employeeStorage);
                    break;

                case DELETE_COMPANY:
                    deleteCompany(scanner, companyStorage, employeeStorage);
                    break;

                default:
                    System.out.println("Invalid Command");
            }
        }
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Input " + EXIT + " for EXIT");
        System.out.println("Input " + ADD_EMPLOYEE + " for ADD EMPLOYEE");
        System.out.println("Input " + PRINT_EMPLOYEES + " for PRINT ALL EMPLOYEE");
        System.out.println("Input " + SEARCH_BY_ID + " for SEARCH EMPLOYEE BY ID");
        System.out.println("Input " + SEARCH_BY_COMPANY + " for SEARCH EMPLOYEE BY COMPANY NAME");
        System.out.println("Input " + SEARCH_BY_MIN_SALARY + " for SEARCH EMPLOYEES BY MINIMUM SALARY");
        System.out.println("Input " + DELETE_BY_ID + " for DELETE EMPLOYEE BY ID");
        System.out.println("Input " + ADD_COMPANY + " for ADD COMPANY");
        System.out.println("Input " + PRINT_COMPANIES + " for PRINT ALL COMPANIES");
        System.out.println("Input " + SEARCH_COMPANY_BY_ID + " for SEARCH COMPANY BY ID");
        System.out.println("Input " + PRINT_EMPLOYEES_BY_COMPANY_ID + " for PRINT EMPLOYEES BY COMPANY ID");
        System.out.println("Input " + CHANGE_EMPLOYEE_COMPANY + " for CHANGE EMPLOYEE COMPANY");
        System.out.println("Input " + PRINT_EMPLOYEE_COMPANY + " for PRINT EMPLOYEE COMPANY");
        System.out.println("Input " + COUNT_EMPLOYEES_BY_COMPANY + " for COUNT EMPLOYEES BY COMPANY (Bonus 1)");
        System.out.println("Input " + TOTAL_SALARY_BY_COMPANY + " for CALCULATE TOTAL SALARY BY COMPANY (Bonus 2)");
        System.out.println("Input " + HIGHEST_PAID_EMPLOYEE + " for FIND HIGHEST PAID EMPLOYEE (Bonus 3)");
        System.out.println("Input " + DELETE_COMPANY + " for DELETE COMPANY (Bonus 5)");
    }

    public static void addEmployee(Scanner scanner, EmployeeStorage employeeStorage, CompanyStorage companyStorage) {
        System.out.println("Input employee ID: ");
        String employeeID = scanner.nextLine();
        if (employeeStorage.getById(employeeID) != null) {
            System.out.println("Employee with ID " + employeeID + " already exists.");
            return;
        }

        System.out.println("Input employee name: ");
        String name = scanner.nextLine();

        System.out.println("Input employee surname: ");
        String surname = scanner.nextLine();

        System.out.println("Input employee salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Input employee position: ");
        String position = scanner.nextLine();

        System.out.println("Input company ID: ");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);
        if (company != null) {
            Employee employee = new Employee(name, surname, employeeID, salary, company, position);
            employeeStorage.add(employee);
            System.out.println("Employee successfully added!");
        } else {
            System.out.println("Company with ID " + companyId + " not found. Please add the company first.");
        }
    }

    public static void printEmployees(EmployeeStorage storage) {
        storage.printAll();
    }

    public static void searchByID(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input employee ID:");
        String searchID = scanner.nextLine();

        Employee foundEmployee = storage.getById(searchID);
        if (foundEmployee != null) {
            System.out.println("Employee found:\n" + foundEmployee);
        } else {
            System.out.println("Employee with ID: " + searchID + " not found.");
        }
    }

    public static void searchByCompany(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input company name:");
        String searchCompany = scanner.nextLine();
        storage.printByCompanyName(searchCompany);
    }

    public static void searchByMinSalary(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input minimum salary:");
        double minSalary = Double.parseDouble(scanner.nextLine());
        storage.searchByMinSalary(minSalary);
    }

    public static void deleteByID(Scanner scanner, EmployeeStorage storage) {
        System.out.println("Input employee ID to delete:");
        String deleteID = scanner.nextLine();
        storage.deleteByID(deleteID);
    }

    public static void addCompany(Scanner scanner, CompanyStorage storage) {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();
        if (storage.getById(companyId) != null) {
            System.out.println("Company with ID " + companyId + " already exists.");
            return;
        }

        System.out.println("Enter company name:");
        String name = scanner.nextLine();
        System.out.println("Enter industry:");
        String industry = scanner.nextLine();
        System.out.println("Enter country:");
        String country = scanner.nextLine();

        Company company = new Company(companyId, name, industry, country);
        storage.add(company);
        System.out.println("Company successfully added!");
    }

    public static void printCompanies(CompanyStorage storage) {
        storage.printAll();
    }

    public static void searchCompanyByID(Scanner scanner, CompanyStorage storage) {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();
        Company company = storage.getById(companyId);
        if (company != null) {
            System.out.println("Company found:\n" + company);
        } else {
            System.out.println("Company not found.");
        }
    }

    public static void printEmployeesByCompanyID(Scanner scanner, EmployeeStorage employeeStorage, CompanyStorage companyStorage) {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();
        Company company = companyStorage.getById(companyId);
        if (company != null) {
            System.out.println("Company: " + company.getName());
            System.out.println("Employees:");
            employeeStorage.printByCompanyId(companyId);
        } else {
            System.out.println("Company not found.");
        }
    }

    public static void changeEmployeeCompany(Scanner scanner, EmployeeStorage employeeStorage, CompanyStorage companyStorage) {
        System.out.println("Enter employee ID:");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getById(employeeId);
        if (employee != null) {
            String currentCompName = (employee.getCompany() != null) ? employee.getCompany().getName() : "None";
            System.out.println("Current company: " + currentCompName);

            System.out.println("Enter new company ID:");
            String newCompanyId = scanner.nextLine();
            Company newCompany = companyStorage.getById(newCompanyId);

            if (newCompany != null) {
                employee.setCompany(newCompany);
                System.out.println("Employee company successfully changed! New company: " + newCompany.getName());
            } else {
                System.out.println("Company not found. Employee's company remains unchanged.");
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void printEmployeeCompany(Scanner scanner, EmployeeStorage employeeStorage) {
        System.out.println("Enter employee ID:");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getById(employeeId);
        if (employee != null) {
            System.out.println("Employee: " + employee.getName() + " " + employee.getSurname());
            if (employee.getCompany() != null) {
                System.out.println("Company information:\n" + employee.getCompany());
            } else {
                System.out.println("Company information: None");
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void countEmployeesByCompany(Scanner scanner, EmployeeStorage employeeStorage, CompanyStorage companyStorage) {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();
        Company company = companyStorage.getById(companyId);
        if (company != null) {
            int count = employeeStorage.countEmployeesByCompanyId(companyId);
            System.out.println("Company: " + company.getName());
            System.out.println("Employees count: " + count);
        } else {
            System.out.println("Company not found.");
        }
    }

    public static void totalSalaryByCompany(Scanner scanner, EmployeeStorage employeeStorage, CompanyStorage companyStorage) {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();
        Company company = companyStorage.getById(companyId);
        if (company != null) {
            double total = employeeStorage.calculateTotalSalaryByCompanyId(companyId);
            System.out.println("Company: " + company.getName());
            System.out.println("Total salary: " + total);
        } else {
            System.out.println("Company not found.");
        }
    }

    public static void highestPaidEmployee(EmployeeStorage employeeStorage) {
        Employee highest = employeeStorage.findHighestPaidEmployee();
        if (highest != null) {
            System.out.println("Highest paid employee:\n" + highest);
        } else {
            System.out.println("No employees found in the system.");
        }
    }

    public static void deleteCompany(Scanner scanner, CompanyStorage companyStorage, EmployeeStorage employeeStorage) {
        System.out.println("Enter company ID to delete:");
        String companyId = scanner.nextLine();
        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found.");
            return;
        }

        int empCount = employeeStorage.countEmployeesByCompanyId(companyId);
        if (empCount > 0) {
            System.out.println("Cannot delete company. Company has " + empCount + " employees.");
        } else {
            companyStorage.deleteByID(companyId);
        }
    }
}