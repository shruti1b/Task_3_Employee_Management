public class Employee {
    // Step 1: Define attributes
    private int id;
    private String name;
    private double salary;

    // Step 2: Create a constructor (a method to set initial values)
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Step 3: Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs " + salary);
        System.out.println("-------------------------");
    }
}
