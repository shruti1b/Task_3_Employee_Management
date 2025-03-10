import java.util.ArrayList; // Import ArrayList class
import java.util.List;       // Import List interface

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Step 1: Create 3 Employee objects with sample data
        Employee emp1 = new Employee(101, "Khushi", 50000.0);
        Employee emp2 = new Employee(102, "Shruti", 60000.0);
        Employee emp3 = new Employee(103, "Rutvik", 55000.0);

        // Step 2: Store employees in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Step 3: Display all employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
