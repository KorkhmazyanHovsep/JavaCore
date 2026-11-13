package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extendStorage();
        }
        employees[size++] = employee;
    }

    private void extendStorage() {
        Employee[] temp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
    }

    public void print() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employees[i]);
        }
    }

    public Employee searchID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchByCompany(String companyName) {
        boolean found = false;
        System.out.println("Employees:");
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equalsIgnoreCase(companyName))
            {
                System.out.println(employees[i].getName() + " " + employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company " + companyName);
        }
    }
}
