package homeworks.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
    }

    private void extend() {
        Company[] temp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, temp, 0, size);
        companies = temp;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No companies found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyID().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }

    public void deleteByID(String id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyID().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Company with ID " + id + " not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            companies[i] = companies[i + 1];
        }
        companies[size - 1] = null;
        size--;
        System.out.println("Company with ID " + id + " successfully deleted.");
    }
}