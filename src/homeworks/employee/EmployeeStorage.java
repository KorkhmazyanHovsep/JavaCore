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
        System.arraycopy(employees, 0, temp, 0, size);
        employees = temp;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Employee ID: " + employees[i].getEmployeeID() +
                    "\nName: " + employees[i].getName() + " " + employees[i].getSurname() +
                    "\nSalary: " + employees[i].getSalary() +
                    "\nPosition: " + employees[i].getPosition() +
                    "\nCompany: " + (employees[i].getCompany() != null ? employees[i].getCompany().getName() : "None") + "\n");
        }
    }

    public Employee getById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }
        return null;
    }

    public void printByCompanyName(String companyName) {
        boolean found = false;
        System.out.println("Employees:");
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getName().equalsIgnoreCase(companyName)) {
                System.out.println(employees[i].getEmployeeID() + " - " + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company: " + companyName);
        }
    }

    public void printByCompanyId(String companyId) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getCompanyID().equals(companyId)) {
                System.out.println(employees[i].getEmployeeID() + " - " + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for this company ID.");
        }
    }

    public int countEmployeesByCompanyId(String companyId) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getCompanyID().equals(companyId)) {
                count++;
            }
        }
        return count;
    }

    public double calculateTotalSalaryByCompanyId(String companyId) {
        double total = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getCompanyID().equals(companyId)) {
                total += employees[i].getSalary();
            }
        }
        return total;
    }

    public Employee findHighestPaidEmployee() {
        if (size == 0) return null;
        Employee highest = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > highest.getSalary()) {
                highest = employees[i];
            }
        }
        return highest;
    }

    public void searchByMinSalary(double minSalary) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= minSalary) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with salary >= " + minSalary);
        }
    }

    public void deleteByID(String employeeID) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee with ID " + employeeID + " not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[size - 1] = null;
        size--;
        System.out.println("Employee with ID " + employeeID + " successfully deleted.");
    }
}