package homeworks.employee;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_EMPLOYEES = "2";
    String SEARCH_BY_ID = "3";
    String SEARCH_BY_COMPANY = "4";
    String SEARCH_BY_MIN_SALARY = "5";
    String DELETE_BY_ID = "6";
    String ADD_COMPANY = "7";
    String PRINT_COMPANIES = "8";
    String SEARCH_COMPANY_BY_ID = "9";
    String PRINT_EMPLOYEES_BY_COMPANY_ID = "10";
    String CHANGE_EMPLOYEE_COMPANY = "11";
    String PRINT_EMPLOYEE_COMPANY = "12";
    String COUNT_EMPLOYEES_BY_COMPANY = "13";
    String TOTAL_SALARY_BY_COMPANY = "14";
    String HIGHEST_PAID_EMPLOYEE = "15";
    String DELETE_COMPANY = "16";
}